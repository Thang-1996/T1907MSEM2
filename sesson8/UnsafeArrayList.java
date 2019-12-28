/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesson8;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author thang
 */
public class UnsafeArrayList {
    public static void main(String[] args) throws InterruptedException {
        List<Integer> unsafeArrayList = new ArrayList<>();
        unsafeArrayList.add(1);
        unsafeArrayList.add(2);
        unsafeArrayList.add(3);
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        Runnable task = () ->{
            incrementArrayList(unsafeArrayList);
        };
        for(int i = 0;i<100;i++){
            executorService.submit(task);
        }
        executorService.shutdown();
        executorService.awaitTermination(60, TimeUnit.SECONDS);
        System.out.println(unsafeArrayList);
 
    }
    private static void incrementArrayList(List<Integer> unsafeArrayList){
        for (int i = 0; i < unsafeArrayList.size(); i++) {
            Integer value  = unsafeArrayList.get(i);
            unsafeArrayList.set(i, value + 1);
            
        }
    }
    
}
