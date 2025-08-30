//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        Registry Design Pattern
//
//        The gaming industry use the Registry design pattern
//
//        Once a Character needs to be designed
//        Once imported, a character needs to modify the sprites
//        So here we can once import from db and make some modifications and use it

        HumanRegistory humanRegistory = new HumanRegistory();
        Human masterElf = humanRegistory.get(RaceType.Elf);
        masterElf.setName("Master else senior");
        Human masterOrc = humanRegistory.get(RaceType.Orc);
        Human masterZombie = humanRegistory.get(RaceType.Zombie);
        masterZombie.setName("Waker");
        masterZombie.setIntelligence(99);
        System.out.println("Master Elf: " + masterElf);
        System.out.println("Master Orc: " + masterOrc);
        System.out.println("Master Zombie: " + masterZombie);
    }
}