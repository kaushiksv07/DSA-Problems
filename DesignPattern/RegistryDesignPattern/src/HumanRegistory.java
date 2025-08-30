import java.util.HashMap;

public class HumanRegistory {
    HashMap<RaceType,Human> humans = new HashMap<>();

    public HumanRegistory() {
        Human human1 = new Human("PrototypeElf", "Green", 70);
        Human human2 = new Human("PrototypeOrc", "White", 77);
        Human human3 = new Human("PrototypeZombee", "Pale", 80);
        humans.put(RaceType.Elf, human1);
        humans.put(RaceType.Orc, human2);
        humans.put(RaceType.Zombie, human3);
    }
    public void add(String key, Human human) {
        humans.put(RaceType.valueOf(key), human);
    }

    public Human get(RaceType raceType) {
        Human protyType = humans.get(raceType);
        if (protyType == null) {
            throw new IllegalArgumentException("No such Human");
        }
        return protyType.copy();
    }
}
