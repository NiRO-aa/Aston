package aston.hometask.third;

import java.util.Arrays;

public enum Choice {
    WRITE("1"),
    READ("2"),
    CLOSE("");

    private final String type;

    private Choice(String type) {
        this.type = type;
    }

    public static Choice from(String type) {
        return Arrays.stream(Choice.values())
                .filter(choice -> type.equals(choice.getType()))
                .findFirst().orElse(Choice.CLOSE);
    }

    public String getType() {
        return type;
    }
}
