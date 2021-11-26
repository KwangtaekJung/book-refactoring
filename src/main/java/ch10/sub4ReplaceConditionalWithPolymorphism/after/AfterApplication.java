package ch10.sub4ReplaceConditionalWithPolymorphism.after;

import ch10.sub4ReplaceConditionalWithPolymorphism.BeforeBird;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AfterApplication {

    public static void main(String[] args) {
        List<AfterBird> afterBirds = new ArrayList<>();
        afterBirds.add(new AfterBird("Name1", "유럽 제비", 2, 100, true));
        afterBirds.add(new AfterBird("Name2", "아프리카 제비", 1, 50, true));
        afterBirds.add(new AfterBird("Name3", "노르웨이 파랑 앵무", 4, 200, false));
        afterBirds.add(new AfterBird("Name4", "한국 제비", 3, 500, false));

        System.out.println(afterBirds.stream().map(AfterApplication::plumage).collect(Collectors.toList()));
        System.out.println(afterBirds.stream().map(AfterApplication::airSpeedyVelocity).collect(Collectors.toList()));
    }

    public static String plumage(AfterBird bird) {
        return createBird(bird).plumage();
    }

    public static int airSpeedyVelocity(AfterBird bird) {
        return createBird(bird).airSpeedVelocity();
    }

    public static AfterBird createBird(AfterBird bird) {
        switch(bird.type) {
            case "유럽 제비":
                return new EuropeanSwallow(bird);
            case "아프리카 제비":
                return new AfricaSwallow(bird);
            case "노르웨이 파랑 앵무":
                return new NorwegianBlueParrot(bird);
            default:
                return bird;
        }
    }
}
