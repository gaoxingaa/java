package io.github.janezhangoo;

public class DemoThread extends Thread{
    private FileExample file;
    public DemoThread(String name, FileExample file){
        setName(name);
        this.file = file;
    }

    public void printState() {
        System.out.println(getName() + " " + getState());
    }

    @Override
    public synchronized void run() {
        printState();
        try {
            sleep(3000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
            printState();
        }
    }
}
