package it.kenble.async

import android.os.Looper;
import android.os.Handler;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

public class AsyncWorker {

    private static final int NUMBER_OF_THREADS = 4;
    private static final AsyncWorker instance = new AsyncWorker();
    
    protected Handler handler;
    private ExecutorService executorService;
    
    private AsyncWorker() {
        executorService = Executors.newFixedThreadPool(NUMBER_OF_THREADS);
        handler = new Handler(Looper.getMainLooper());
    }

    public static AsyncWorker getInstance() {
        return instance;
    }

    public ExecutorService getExecutorService() {
        return executorService;
    }

    public Handler getHandler() {
        return handler;
    }
	
}
