package ch10.sub4ReplaceConditionalWithPolymorphism.after;

public class NorwegianBlueParrot extends AfterBird {

    public NorwegianBlueParrot(AfterBird bird) {
        super(bird.name, bird.type, bird.numberOfCoconuts, bird.voltage, bird.isNailed);
    }

    public NorwegianBlueParrot(String name, String type, int numberOfCoconuts, int voltage, boolean isNailed) {
        super(name, type, numberOfCoconuts, voltage, isNailed);
    }

    public String plumage() {
        return (this.voltage > 100) ? "그을렸다" : "예쁘다";
    }

    public int airSpeedVelocity() {
        return (this.isNailed) ? 0 : 10 + this.voltage / 10;
    }
}
