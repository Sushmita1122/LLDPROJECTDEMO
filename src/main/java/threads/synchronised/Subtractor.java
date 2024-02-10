package threads.synchronised;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Subtractor implements Callable<Void> {

    Value val;

    public Subtractor(Value val) {
        this.val = val;
    }

    @Override
    public Void call() throws Exception {
        for(int i=0; i<=50000; i++){
            synchronized (val){
                val.value -= i;
            }
        }
        return null;
    }
}