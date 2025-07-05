package aston.hometask.fourth;

public class LiveLock {

    public static void main(String[] args) {
        Task task1 = new Task("Task-1");
        Task task2 = new Task("Task-2");

        task1.setTask(task2);
        task2.setTask(task1);

        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);

        thread1.start();
        thread2.start();
    }

    private static class Task implements Runnable {

        private String name;
        private Task task;
        private boolean isActive;

        public Task(String name) {
            this.name = name;
            isActive = true;
        }

        public void setTask(Task task) {
            this.task = task;
        }

        @Override
        public void run() {
            try {
                System.out.println(name + " was started!");
                while (task.isActive) {
                    System.out.println(name + " is waiting the interruption of another Task...");
                    Thread.sleep(1000);
                }
                isActive = false;
                System.out.println(name + " was finished!");
            } catch (InterruptedException exception) {
                System.out.println(name + " was interrupted!");
            }

        }

    }

}
