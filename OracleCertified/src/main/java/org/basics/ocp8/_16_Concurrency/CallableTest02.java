package org.basics.ocp8._16_Concurrency;

import java.util.concurrent.*;
import java.util.concurrent.ExecutorService;

public class CallableTest02 {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService service = Executors.newSingleThreadExecutor();
        System.out.println(service.getClass());

        Future<Integer> result = service.submit(() -> 30 + 20);
        try{
            System.out.println(result.get());
            System.out.println(result.isDone());
            System.out.println(result.isCancelled());
        }catch (InterruptedException | ExecutionException e){
            e.printStackTrace();
        }finally {
            if(service != null){
                service.shutdown();
            }
            System.out.println(service.isShutdown());
            Thread.sleep(1000); // -> service shutdown edildikten sonra bir saniye bekleniyor.
            System.out.println(service.isTerminated());
        }

    }

}
