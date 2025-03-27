package term2;


class Animal {
    public void makeSound() {
        System.out.println("The animal makes a sound");
    }
}


class Dog extends Animal {

    @Override
    public void makeSound() {
        System.out.println("The dog barks: Woof! Woof!");
    }
}


public class InheritanceDemo {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        myAnimal.makeSound();

        Dog myDog = new Dog();
        myDog.makeSound();
        Animal ref = new Dog(); 
        ref.makeSound();
    }
}
