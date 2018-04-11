package com.haieros.jsonparse;

/**
 * Created by Kang on 2018/4/11.
 */

public class MQBaseBean {

    /**
     * args : [{"taskCode":"001"},{"taskCode":"002"},{"taskCode":"003"},{"taskCode":"004"}]
     * data_type : CTRL_STD_TASK
     * message_type : event
     * project_code : 0000000000
     * robot_code : 111111111
     */

    private String data_type;
    private String message_type;
    private String project_code;
    private String robot_code;

    public String getData_type() {
        return data_type;
    }

    public void setData_type(String data_type) {
        this.data_type = data_type;
    }

    public String getMessage_type() {
        return message_type;
    }

    public void setMessage_type(String message_type) {
        this.message_type = message_type;
    }

    public String getProject_code() {
        return project_code;
    }

    public void setProject_code(String project_code) {
        this.project_code = project_code;
    }

    public String getRobot_code() {
        return robot_code;
    }

    public void setRobot_code(String robot_code) {
        this.robot_code = robot_code;
    }

    @Override
    public String toString() {
        return "MQBaseBean{" +
                "data_type='" + data_type + '\'' +
                ", message_type='" + message_type + '\'' +
                ", project_code='" + project_code + '\'' +
                ", robot_code='" + robot_code + '\'' +
                '}';
    }
}
