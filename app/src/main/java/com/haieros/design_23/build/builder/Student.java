package com.haieros.design_23.build.builder;

/**
 * Created by Kang on 2017/11/28.
 */

public class Student {

    private int id;
    private String name;
    private String password;
    private String sex;
    private String address;

    public Student(){

    }
    public Student(Student origin){
        this.id = origin.id;
        this.name = origin.name;
        this.password = origin.password;
        this.sex = origin.sex;
        this.address = origin.address;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getSex() {
        return sex;
    }

    public String getAddress() {
        return address;
    }

    public static class Builder{

        private Student target;

        public Builder(){
            target = new Student();
        }
        public Builder id(int id){
            target.id = id;
            return this;
        }

        public Builder name(String name){
            target.name = name;
            return this;
        }

        public Builder password(String pwd){
            target.password = pwd;
            return this;
        }

        public Builder sex(String sex){
            target.sex = sex;
            return this;
        }

        public Builder address(String address){
            target.address = address;
            return this;
        }

        public Student build(){
            return new Student(target);
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", sex='" + sex + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
