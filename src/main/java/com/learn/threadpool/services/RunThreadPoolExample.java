package com.learn.threadpool.services;
import com.learn.threadpool.runnables.PrintTask;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import java.util.concurrent.Executor;


@Service
public class RunThreadPoolExample {


    private Executor executor;


    @Autowired
    public RunThreadPoolExample(@Qualifier("taskExecutor") Executor executor)  {
        this.executor=executor;
        runThreadPool();
    }


    public void runThreadPool()  {
        for(int i=10;i<=100;i+=10){
            PrintTask printTask =new PrintTask(i);
            executor.execute(printTask);
        }
    }




}
