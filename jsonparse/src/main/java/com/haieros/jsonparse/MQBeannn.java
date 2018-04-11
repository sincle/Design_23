package com.haieros.jsonparse;

/**
 * Created by Kang on 2018/4/11.
 */

public class MQBeannn extends MQBaseBean {


    /**
     * data :
     * msg :
     */

    private ArgsBean args;

    public ArgsBean getArgs() {
        return args;
    }

    public void setArgs(ArgsBean args) {
        this.args = args;
    }

    public static class ArgsBean {
        private String data;
        private String msg;

        public String getData() {
            return data;
        }

        public void setData(String data) {
            this.data = data;
        }

        public String getMsg() {
            return msg;
        }

        public void setMsg(String msg) {
            this.msg = msg;
        }

        @Override
        public String toString() {
            return "ArgsBean{" +
                    "data='" + data + '\'' +
                    ", msg='" + msg + '\'' +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "MQBeannn{" +
                "args=" + args +
                '}' + "super:"+super.toString();
    }
}
