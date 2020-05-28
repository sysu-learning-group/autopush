package com.jason.autopush.common.util;

import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.stereotype.Component;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @Desc
 * @Author jason
 * @CreateTime 2020/5/28 10:46 下午
 **/
public class ThreadUtil {
    private static ExecutorService executorService;

    public static ExecutorService getSingleton() {
        if (executorService == null) {
            executorService = new ThreadPoolExecutor(10, 20, 0, TimeUnit.SECONDS,
                    new ArrayBlockingQueue<>(512),
                    new ThreadPoolExecutor.DiscardPolicy());
        }
        return executorService;
    }
}
