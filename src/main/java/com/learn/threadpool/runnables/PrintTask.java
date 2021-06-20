package com.learn.threadpool.runnables;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class PrintTask implements Runnable{

    private Integer num=0;


    @Override
    public void run() {
        String threadName=Thread.currentThread().getName();
        System.out.print("\n"+threadName + " -> ");
        System.out.println(num);
    }
}
