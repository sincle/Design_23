package com.haieros.jsonparse;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kang on 2018/4/11.
 */

public class Client {
    public static void main(String[] agrs){

        MQInBean mqInBean = new MQInBean();
        mqInBean.setRobot_code("111111111");
        mqInBean.setData_type("CTRL_STD_TASK");
        mqInBean.setMessage_type("event");
        mqInBean.setProject_code("0000000000");
        ArrayList<MQInBean.ArgBean> argBeans = new ArrayList<>();
        MQInBean.ArgBean argBean = new MQInBean.ArgBean();
        argBean.setTaskCode("001");
        argBeans.add(argBean);
        MQInBean.ArgBean argBean1 = new MQInBean.ArgBean();
        argBean1.setTaskCode("002");
        argBeans.add(argBean1);
        MQInBean.ArgBean argBean2 = new MQInBean.ArgBean();
        argBean2.setTaskCode("003");
        argBeans.add(argBean2);
        MQInBean.ArgBean argBean3= new MQInBean.ArgBean();
        argBean3.setTaskCode("004");
        argBeans.add(argBean3);
        mqInBean.setArg(argBeans);
        String json = new Gson().toJson(mqInBean);
        System.out.println("json:"+json);
        try {
            JsonParse jsonParse =  JsonParse.getInstance();
            MQCommonBean bean = jsonParse.parse(json, MQCommonBean.class);
            List<MQInBean.ArgBean> arg = (List<MQInBean.ArgBean>) bean.getArgs();
            for (MQInBean.ArgBean argBean4 : arg) {
                System.out.println("arg:"+argBean4.toString());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        MQBeannn mqBeannn = new MQBeannn();
        mqBeannn.setRobot_code("111111111");
        mqBeannn.setData_type("kang");
        mqBeannn.setMessage_type("event");
        mqBeannn.setProject_code("0000000000");

        MQBeannn.ArgsBean argsbean = new MQBeannn.ArgsBean();
        argsbean.setData("2222");
        argsbean.setMsg("meaaaa");
        mqBeannn.setArgs(argsbean);

        String json1 = new Gson().toJson(mqBeannn);
        System.out.println("json1:"+json1);

        try {
            JsonParse jsonParse =  JsonParse.getInstance();
            MQCommonBean bean = jsonParse.parse(json1, MQCommonBean.class);
            MQBeannn.ArgsBean args = (MQBeannn.ArgsBean) bean.getArgs();
            System.out.println("----------------------------");
            System.out.println("bean:"+bean.toString());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
