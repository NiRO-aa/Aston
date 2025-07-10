package aston.hometask.fifth.Adapter;

public class Adaptee {

    private String description;

    public Adaptee(String description) {
        this.description = description;
    }

    public String getDoubleDescriptionString() {
        return description + description;
    }

    public void setNewDescriptionString(String description) {
        this.description = description;
    }

}
