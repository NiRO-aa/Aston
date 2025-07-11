package aston.hometask.fifth.Strategy;

public class Starter {

    public static void main(String[] args) {
        Context context = new Context();

        context.setChanger(new ChangerOne());
        System.out.println(context.change(5));

        context.setChanger(new ChangerTwo());
        System.out.println(context.change(5));
    }

}
