package com.learn.threadpool.services;
import com.learn.threadpool.runnables.PrintTask;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;



@Service
public class RunParallelStream {


    private Executor executor;


    @Autowired
    public RunParallelStream(@Qualifier("taskExecutor") Executor executor) {
      this.executor=executor;
    //    runParallelStream();
    }



    public void runParallelStream()  {
        List<PrintTask> printTasks= initPrintTaskList(20);
        printTasks.parallelStream().forEach(c->c.run());
    }



    private List<PrintTask> initPrintTaskList(Integer size) {
        List<PrintTask> printTasks=new ArrayList<>();
        for(int i=1;i<=size;i++){
            PrintTask printTask=new PrintTask(i);
            printTasks.add(printTask);
        }
        return printTasks;
    }


}
