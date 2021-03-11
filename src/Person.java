public class Person {

    private String name;
    private int weight;

    public Person(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public void talk(String text) {
        System.out.println(text);
    }

    public void eat() {
        System.out.println("mampf");
    }

    public void fight() {
        System.out.println("schlegl");
    }

    public void die() {
        System.out.println("uff");
    }

}
