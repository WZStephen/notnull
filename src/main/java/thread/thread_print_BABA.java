package thread;
import java.util.*;
import java.lang.*;
import java.io.*;

class thread_print_BABA implements Runnable {
    private Thread t;
    private String threadName;

    thread_print_BABA (String threadName){
        this.threadName = threadName;
    }

    public void run() {
        while(true)
            System.out.print(threadName);
    }

    public void start() {
        if(t==null){
            t = new Thread (this, threadName);
            t.start();
        }
    }

    public static void main (String[] args) throws java.lang.Exception
    {
        thread_print_BABA A =  new thread_print_BABA ("A");
        thread_print_BABA B =  new thread_print_BABA ("B");

        /** ABABAB** */
//        A.start();
//        B.start();

        /** BABABA** */
        B.start();
        A.start();
    }
}