package org.basics.ocp8._16_Concurrency;

import java.util.HashMap;
import java.util.Map;

public class ZooManagerBad {

    private Map<String, Object> foodData = new HashMap<String, Object>();

    public synchronized void put(String key, String value){
        foodData.put(key, value);
    }

    public synchronized Object get(String key){
        return foodData.get(key);
    }

}
