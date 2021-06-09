public class Dog {
    String dogName;

    public String getName () {
        return dogName;
    }
    public void setName (String name) {
        dogName = name;
    }

    public void sayWoof() {
        System.out.println("Гав!");
    }

    public void givePaw() {
        System.out.printf("%s дал лапу", getName());
    }

    public static void main (String[] args) {
        Dog dog = new Dog ();
        dog.dogName = "Рекс";
        dog.sayWoof();
        dog.givePaw();
    }
}
