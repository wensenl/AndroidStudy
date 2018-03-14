package com.threadpoolexecutor;

import android.app.Activity;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainActivity extends Activity {
    private String TAG = "ThreadPoolExecutor";
    private ExecutorService newFixedThreadPool;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //创建线程池
        newFixedThreadPool = Executors.newFixedThreadPool(3);

        for(int i = 0; i < 30; i++){
            final int finalI = i;

            Runnable runnable = new Runnable() {
                @Override
                public void run() {
                    SystemClock.sleep(3000);
                    Log.d(TAG, "run: " + finalI);
                }
            };

            newFixedThreadPool.execute(runnable);
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        newFixedThreadPool.shutdownNow();
    }
}
