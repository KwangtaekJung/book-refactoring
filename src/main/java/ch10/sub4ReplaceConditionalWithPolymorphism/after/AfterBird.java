package ch10.sub4ReplaceConditionalWithPolymorphism.after;

public class AfterBird {

    public String name;
    public String type;

    public int numberOfCoconuts;
    public int voltage;
    public boolean isNailed;

    public AfterBird(String name, String type, int numberOfCoconuts, int voltage, boolean isNailed) {
        this.name = name;
        this.type = type;
        this.numberOfCoconuts = numberOfCoconuts;
        this.voltage = voltage;
        this.isNailed = isNailed;
    }

    public String plumage() {
        return "알 수 없다";
    }

    public int airSpeedVelocity() {
        return 0;
    }
}
