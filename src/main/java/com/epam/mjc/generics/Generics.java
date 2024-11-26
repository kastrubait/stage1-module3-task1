package com.epam.mjc.generics;

import java.util.ArrayList;
import java.util.List;

public class Generics {

    //TODO: Refactor Method-1
    public List<String> boxingMethod(String name) {
        List<String> firstList = new ArrayList<String>();
        firstList.add(name);
        List<String> secondList = new ArrayList<String>();
        secondList.add(String.valueOf(firstList));
        return secondList;
    }

    //TODO: Refactor Method-2
    public <Object> Object genericMethod(Object data) {
        return data;
    }

    //TODO: Refactor Method-3
    public <T> void cloneMethod(List<T> consumer, List<? extends T> producer) {
        consumer.addAll(producer);
    }

}
