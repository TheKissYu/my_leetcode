package juc;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolDemo {
    public static void main(String[] args) {
        BlockingDeque<Runnable> queue = new LinkedBlockingDeque<>(10);
        ThreadPoolExecutor t =new ThreadPoolExecutor(10,20,1000,
                TimeUnit.MILLISECONDS,queue,new ThreadPoolExecutor.CallerRunsPolicy());
        t.execute(new Runnable() {
            @Override
            public void run() {

            }
        });
    }
}
