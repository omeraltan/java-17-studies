package org.basics.ocp8._16_Concurrency;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ZooManagerGood {

   private Map<String, String> foodData = new ConcurrentHashMap<>();

   public void put(String key, String value){
        foodData.put(key, value);
   }

   public String get(String key){
       return foodData.get(key);
   }

}

/**
 *
 * "synchronized" kullanmak yerine "ConcurrentHashMap" kullanmak daha iyi bir yaklaşım olacaktır.
 * Bu Map üzerinde birden fazla thread güvenli bir şekilde çalışabilir.
 *
 */
