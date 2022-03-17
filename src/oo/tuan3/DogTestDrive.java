package oo.tuan3;

public class DogTestDrive {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.name = "Lucy";
        dog.setSize(4);// = -1;

        System.out.println("Dog Name: " + dog.name);
        System.out.println("Dog Size: " + dog.getSize());
    }
    
}
