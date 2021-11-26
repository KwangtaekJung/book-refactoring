package ch10.sub4ReplaceConditionalWithPolymorphism.after;

public class AfricaSwallow extends AfterBird {

    public AfricaSwallow(AfterBird bird) {
       super(bird.name, bird.type, bird.numberOfCoconuts, bird.voltage, bird.isNailed);
    }

    public AfricaSwallow(String name, String type, int numberOfCoconuts, int voltage, boolean isNailed) {
        super(name, type, numberOfCoconuts, voltage, isNailed);
    }

    public String plumage() {
        return (this.numberOfCoconuts > 2) ? "지쳤다" : "보통이다";
    }

    public int airSpeedVelocity() {
        return 40 -2 * this.numberOfCoconuts;
    }
}
