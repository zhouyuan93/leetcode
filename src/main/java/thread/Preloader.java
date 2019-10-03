package thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.zip.DataFormatException;

/**
 * FutureTask 实现闭锁
 */
public class Preloader {
    private final FutureTask<ProductInfo> future = new FutureTask<ProductInfo>(
            new Callable<ProductInfo>() {
                @Override
                public ProductInfo call() throws Exception {
                    return loadProductInfo();
                }
            }
    );

    private final Thread thread = new Thread(future);

    public void start(){
        thread.start();
    }


    public ProductInfo get() throws Throwable {
        try {
            return future.get();
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause instanceof DataLoadException) {
                throw (DataLoadException) cause;
            }else{
                throw launderThrowable(cause);
            }
        }
    }

    private Throwable launderThrowable(Throwable t) {
        if (t instanceof RuntimeException) {
            return (RuntimeException) t;
        } else if (t instanceof Error) {
            return (Error) t;
        }else{
            throw new IllegalStateException("NOT UNCHECKED", t);
        }

    }

    public ProductInfo loadProductInfo() {
        return new ProductInfo();
    }

    private class ProductInfo {
    }

    private class DataLoadException extends Throwable {
    }
}
