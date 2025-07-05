package aston.hometask.fourth;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class OneTwoThreads {

    public static void main(String[] args) {
        Task task1 = new Task(1);
        Task task2 = new Task(2);

        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);

        thread1.start();
        thread2.start();
    }

    private static class Task implements Runnable {

        private static Lock lock = new ReentrantLock();

        private int number;

        public Task(int number) {
            this.number = number;
        }

        @Override
        public void run() {
            try {
                while (!Thread.interrupted()) {
                    lock.lock();
                    System.out.println(number);
                    Thread.sleep(500);
                    lock.unlock();
                    Thread.sleep(200);
                }
            } catch (InterruptedException exception) {
                throw new RuntimeException(exception);
            }
        }

    }

}
