package aston.hometask.fifth.Strategy;

public class Context {

    private Changer changer;

    public Context setChanger(Changer changer) {
        this.changer = changer;
        return this;
    }

    public int change(int num) {
        return changer.change(num);
    }

}
