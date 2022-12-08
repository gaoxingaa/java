package io.github.janezhangoo;

import java.lang.management.ManagementFactory;
import com.sun.management.ThreadMXBean;

public class ThreadManager {

    public static void main(String[] args){
        String test = "The java.lang.management package is a package in the Java Standard Edition (SE) that provides management interfaces for the JVM and its components. This package contains classes and interfaces that can be used to monitor and manage the performance of a Java SE application.\n" +
                "\n" +
                "The com.sun.management package is a package in the Java Development Kit (JDK) that provides additional management interfaces that are specific to the Sun Microsystems implementation of the Java SE platform. This package contains classes and interfaces that can be used to access information and monitor the performance of a Java application on a Sun Microsystems JVM.\n" +
                "\n" +
                "In general, the java.lang.management package contains the standard management interfaces for the JVM and its components, while the com.sun.management package contains additional, non-standard management interfaces that are specific to the Sun Microsystems implementation of the Java SE platform.\n" +
                "\n" +
                "In Java 11 and later versions, the com.sun.management package has been removed, and the classes and interfaces it contained have been moved to the java.lang package. This means that you can use the java.lang package to access the management interfaces that were previously available in the com.sun.management package.";

        System.out.println(test);
        // Get the thread MX bean
        ThreadMXBean threadMXBean = (ThreadMXBean) ManagementFactory.getThreadMXBean();

        // Get the ID of the current thread
        long threadId = Thread.currentThread().getId();

        // Get the name of the current thread
        String threadName = threadMXBean.getThreadInfo(threadId).getThreadName();

        // Get the state of the current thread
        Thread.State threadState = threadMXBean.getThreadInfo(threadId).getThreadState();


        // Get the amount of memory the thread is using
        long threadMemory = threadMXBean.getThreadAllocatedBytes(threadId);

        // Print the amount of memory the thread is using
        System.out.println("Thread memory usage: " + threadMemory + " bytes");

        // Print the thread info
        System.out.println("Thread ID: " + threadId);
        System.out.println("Thread name: " + threadName);
        System.out.println("Thread state: " + threadState);

    }
}
