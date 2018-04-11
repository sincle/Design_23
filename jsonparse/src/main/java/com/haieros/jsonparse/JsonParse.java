package com.haieros.jsonparse;

import org.json.JSONObject;

import java.lang.reflect.Field;
import java.util.HashMap;

/**
 * Created by Kang on 2018/4/11.
 */

public class JsonParse {

    public JsonParse(){
    }
    public <T> T parse(String json, Class<T> clazz) throws Exception {
        return outerParse(json,clazz);
    }

    private <T> T outerParse(String json,Class<T> clazz) throws Exception {
        if (json == null || "".equals(json)){
            throw new Exception("param can`t be null");
        }
        T t = clazz.newInstance();
        Class<? super T> superclass = clazz.getSuperclass();
        Field[] declaredFields1 = superclass.getDeclaredFields();

        JSONObject jsonObject = new JSONObject(json);
        String robot_code = null;
        String data_type = null;
        String message_type = null;
        String project_code = null;

        for (Field field : declaredFields1) {
            //设置私有属性可访问
            field.setAccessible(true);
            switch (field.getName()) {
                case "robot_code" :
                    //机器人17位 ID
                    robot_code = jsonObject.optString("robot_code");
                    field.set(t,robot_code);
                    break;
                case "data_type" :
                    //数据类型
                    data_type = jsonObject.optString("data_type");
                    field.set(t,data_type);
                    break;
                case "message_type" :
                    //数据传输方向
                    // event： 机器人作为消息生产者，表示机器人向集控系统传输数据
                    // action：机器人作为消息消费者，表示集控系统向机器人传输数据
                    message_type = jsonObject.optString("message_type");
                    field.set(t,message_type);
                    break;
                case "project_code" :
                    // 评测项目标号,10位数值格式编号，没有监控项目时缺省为10个0
                    project_code = jsonObject.optString("project_code");
                    field.set(t,project_code);
                    break;
            }
        }
        String args = jsonObject.optString("args");
        System.out.println("args:"+args);
        if (data_type == null || "".equals(data_type)){
            throw new Exception("data_type can`t be null");
        }
        return innerParse(args,data_type,t);
    }

    /**
     *
     * @param json 内层json 数据
     * @param type mq 传来的内层json 数据类型
     * @param t
     * @throws Exception
     */
    private <T> T innerParse(String json, String type, T t) throws Exception {

        if (json == null || "".equals(json)){
            throw new Exception("args`s value can`t be null");
        }
        Object o = JsonParseFactory.getJsonParse(type).parseJson(json);
        Field field = t.getClass().getDeclaredField("args");
        field.setAccessible(true);
        field.set(t,o);
        return t;
    }

    private static class JsonParseFactory {

        static HashMap<String,IHandleJson> parses = new HashMap();

        static {
            parses.put("CTRL_STD_TASK",new TaskJsonParser());
            parses.put("kang",new KangJsonParser());
        }

        public static IHandleJson getJsonParse(String type) {
            return parses.get(type);
        }
    }
}
