package ch10.sub4ReplaceConditionalWithPolymorphism.after;

public class EuropeanSwallow extends AfterBird {

    public EuropeanSwallow(AfterBird bird) {
        super(bird.name, bird.type, bird.numberOfCoconuts, bird.voltage, bird.isNailed);
    }

    public EuropeanSwallow(String name, String type, int numberOfCoconuts, int voltage, boolean isNailed) {
        super(name, type, numberOfCoconuts, voltage, isNailed);
    }

    public String plumage() {
        return "보통 이다";
    }

    public int airSpeedVelocity() {
        return 35;
    }
}
