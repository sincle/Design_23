package com.haieros.jsonparse;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kang on 2018/4/11.
 */

public class TaskJsonParser implements IHandleJson<List<MQInBean.ArgBean>>{

    @Override
    public List<MQInBean.ArgBean> parseJson(String json) {

        List<MQInBean.ArgBean> list = new ArrayList<>();
        try {
            JSONArray jsonArray = new JSONArray(json);
            if(jsonArray != null){
                for (int i = 0; i < jsonArray.length(); i++) {
                    JSONObject jsonObject = jsonArray.getJSONObject(i);
                    String taskCode = jsonObject.optString("taskCode");
                    MQInBean.ArgBean argBean = new MQInBean.ArgBean();
                    argBean.setTaskCode(taskCode);
                    list.add(argBean);//把解析出来的字符串加入集合
                }
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public void handle(List<MQInBean.ArgBean> argBeans) {
        for (MQInBean.ArgBean argBean4 : argBeans) {
            System.out.println("arg:"+argBean4.toString());
        }
    }
}
