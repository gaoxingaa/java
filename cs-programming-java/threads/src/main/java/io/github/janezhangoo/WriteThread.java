package io.github.janezhangoo;

public class WriteThread extends DemoThread{

    public WriteThread(String name, FileExample file) {
        super(name, file);
    }

    @Override
    public void run() {
        printState();
    }
}
