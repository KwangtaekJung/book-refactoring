package ch10.sub4ReplaceConditionalWithPolymorphism;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Before {

    public static void main(String[] args) {

        List<BeforeBird> beforeBirds = new ArrayList<>();
        beforeBirds.add(new BeforeBird("Name1", "유럽 제비", 2, 100, true));
        beforeBirds.add(new BeforeBird("Name2", "아프리카 제비", 1, 50, true));
        beforeBirds.add(new BeforeBird("Name3", "노르웨이 파랑 앵무", 4, 200, false));
        beforeBirds.add(new BeforeBird("Name4", "한국 제비", 3, 500, false));

        System.out.println(plumages(beforeBirds));
        System.out.println(speeds(beforeBirds));
    }

    public static Map<String, String> plumages(List<BeforeBird> beforeBirds) {
        return beforeBirds.stream()
                .collect(Collectors.toMap(b -> b.name, b -> plumage(b)));
    }

    public static Map<String, Integer> speeds(List<BeforeBird> beforeBirds) {
        return beforeBirds.stream()
                .collect(Collectors.toMap(b -> b.name, b -> airSpeedVelocity(b)));
    }

    public static String plumage(BeforeBird beforeBird) {
        switch (beforeBird.type) {
            case "유럽 제비":
                return "보통이다";
            case "아프리카 제비":
                return (beforeBird.numberOfCoconuts > 2) ? "지쳤다" : "보통이다";
            case "노르웨이 파랑 앵무":
                return (beforeBird.voltage > 100) ? "그을렸다" : "예쁘다";
            default:
                return "알 수 없다";
        }
    }

    public static int airSpeedVelocity(BeforeBird beforeBird) {
        switch (beforeBird.type) {
            case "유럽 제비":
                return 35;
            case "아프리카 제비":
                return 40 -2 * beforeBird.numberOfCoconuts;
            case "노르웨이 파랑 앵무":
                return (beforeBird.isNailed) ? 0 : 10 + beforeBird.voltage / 10;
            default:
                return 0;
        }
    }

}