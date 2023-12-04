package com.wirekind.thread.creation.example2;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new NewThread("New Worker Thread");

        thread.start();
    }

    private static class NewThread extends Thread {

        public NewThread(String name) {
            this.setName(name);
        }

        @Override
        public void run() {
            System.out.println("Hello from " + this.getName());
        }
    }
}