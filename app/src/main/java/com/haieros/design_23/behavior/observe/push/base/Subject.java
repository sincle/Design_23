package com.haieros.design_23.behavior.observe.push.base;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kang on 2018/4/13.
 */

public abstract class Subject {

    private List<Observer> mObseverList = new ArrayList<>();

    public void attach(Observer observer){
        mObseverList.add(observer);
        System.out.println("register : "+observer.getClass().getName());
    }

    public void detach(Observer observer){
        mObseverList.remove(observer);
        System.out.println("unregister : "+observer.getClass().getName());
    }

    public void notifyAllObservers(String state){
        for (Observer observer : mObseverList) {
            observer.update(state);
        }
    }
}
