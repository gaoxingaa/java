package io.github.janezhango;

public Class ReadThread implements Runnable{
    public void run()
    {
        System.out.println(Thread.currentThread().getName()
                         + ", executing run() method!");
    }
}