package jvm;

import sun.misc.Launcher;

import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        ClassLoader classLoader = Launcher.getLauncher().getClassLoader();
        System.out.println(systemClassLoader);
    }
}
