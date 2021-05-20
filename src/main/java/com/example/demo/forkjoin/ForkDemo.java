package com.example.demo.forkjoin;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.RecursiveTask;

public class ForkDemo {

    private static class MyTask extends RecursiveTask<Integer> {

        int[] innerSrc;

        public MyTask(int[] innerSrc){
            this.innerSrc = innerSrc;
        }

        @Override
        protected Integer compute() {
//            if (innerSrc.length )
            return null;
        }
    }

    public static void main(String[] args) throws IOException {
        File file = new File("..");
        System.out.println(file.getPath());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getCanonicalPath());
    }

}
