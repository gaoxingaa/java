package io.github.janezhangoo;

public class Demo {
    public static void main(String args[]) throws Exception{
        FileExample file = new FileExample();

        ReadThread readThread = new ReadThread("readThread", file);
        readThread.printState();
        readThread.start();
        readThread.printState();

        WriteThread writeThread = new WriteThread("writeThread", file);
        writeThread.printState();
        writeThread.start();
        writeThread.printState();

        readThread.join();
        readThread.printState();

        writeThread.join();
        writeThread.printState();
    }
}
