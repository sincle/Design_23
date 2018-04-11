package com.haieros.jsonparse;

import java.util.List;

/**
 * Created by Kang on 2018/4/11.
 */

public class MQInBean extends MQBaseBean{


    /**
     * taskCode : 1001
     */

    private List<ArgBean> args;

    public List<ArgBean> getArg() {
        return args;
    }

    public void setArg(List<ArgBean> arg) {
        this.args = arg;
    }

    public static class ArgBean {
        private String taskCode;

        public String getTaskCode() {
            return taskCode;
        }

        public void setTaskCode(String taskCode) {
            this.taskCode = taskCode;
        }

        @Override
        public String toString() {
            return "ArgBean{" +
                    "taskCode='" + taskCode + '\'' +
                    '}';
        }
    }
}
