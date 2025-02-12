class Animal {
    protected String name;
    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void makeSound() {
        System.out.println(name + " издает звук.");
    }

    public void eat() {
        System.out.println(name + " ест.");
    }
}

class Dog extends Animal {
    private String breed;

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println(name + " (" + breed + ") лает: Гав-гав!");
    }
}

class Cat extends Animal {
    private boolean hasFur;

    public Cat(String name, int age, boolean hasFur) {
        super(name, age);
        this.hasFur = hasFur;
    }

    @Override
    public void makeSound() {
        System.out.println(name + " мяукает: Мяу!");
    }
}

public class Animal_main {
    public static void main(String[] args) {
        Animal genericAnimal = new Animal("Животное", 5);
        Dog myDog = new Dog("Бобик", 3, "Лабрадор");
        Cat myCat = new Cat("Мурка", 2, true);

        genericAnimal.makeSound();
        genericAnimal.eat();

        myDog.makeSound();
        myDog.eat();

        myCat.makeSound();
        myCat.eat();
    }
}
