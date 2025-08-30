public class Human implements ProtoType<Human>{
    String name;
    String color;
    int intelligence;

    public Human(String name, String color, int intelligence) {
        this.name = name;
        this.color = color;
        this.intelligence = intelligence;
    }

    public Human(Human human) {
        this.name = human.name;
        this.color = human.color;
        this.intelligence = human.intelligence;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", intelligence=" + intelligence +
                '}';
    }

    @Override
    public Human copy() {
        return new Human(this);
    }
}
