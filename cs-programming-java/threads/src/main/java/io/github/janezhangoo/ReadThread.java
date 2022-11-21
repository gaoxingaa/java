package io.github.janezhangoo;

public class ReadThread implements Runnable{
    @Override
    public void run() {

        System.out.println("name " + Thread.currentThread().getName());

        System.out.println(Thread.currentThread().getState());
        System.out.println(Thread.currentThread().getStackTrace());

    }
}
