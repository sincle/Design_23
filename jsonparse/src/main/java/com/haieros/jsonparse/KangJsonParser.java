package com.haieros.jsonparse;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by Kang on 2018/4/11.
 */

class KangJsonParser implements IHandleJson<MQBeannn.ArgsBean> {
    @Override
    public MQBeannn.ArgsBean parseJson(String json) {
        MQBeannn.ArgsBean argsBean = null;
        try {
            JSONObject jsonObject = new JSONObject(json);
            String data = jsonObject.optString("data");
            String msg = jsonObject.optString("msg");
            argsBean = new MQBeannn.ArgsBean();
            argsBean.setMsg(msg);
            argsBean.setData(data);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return argsBean;
    }

    @Override
    public void handle(MQBeannn.ArgsBean argsBean) {

        System.out.println("result:"+argsBean.getData()+",:"+argsBean.getMsg());
    }
}
