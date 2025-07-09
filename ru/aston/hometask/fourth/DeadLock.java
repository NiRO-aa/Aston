package aston.hometask.fourth;

public class DeadLock {

    public static void main(String[] args) {
        Task task1 = new Task("Task-1");
        Task task2 = new Task("Task-2");

        task1.setTask(task2);
        task2.setTask(task1);

        new Thread(task1).start();
        new Thread(task2).start();
    }

    private static class Task implements Runnable {

        private String name;
        private Task task;

        public Task(String name) {
            this.name = name;
        }

        public void setTask(Task task) {
            this.task = task;
        }

        @Override
        public void run() {
            System.out.println(name + " was started!");
            System.out.println(name + " is working");
            block(task);
            System.out.println(name + " was finished!");
        }

        private synchronized void block(Task task) {
            try {
                Thread.sleep(1000);
                task.block(this);
            } catch (InterruptedException exception) {
                System.out.println(name + " was interrupted.");
            }
        }

    }

}
