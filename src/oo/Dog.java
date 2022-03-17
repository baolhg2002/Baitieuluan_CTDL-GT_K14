package oo;

public class Dog {
    int size;
    String breed;
    String name;

    void bark(){
        if (size > 14){
            System.out.println("Ruff! Ruff!");
        }
        else{
            System.out.println("Yip! Yip!");
        }
    }

    void setBigger(){
        size += 5;
    }

    void walk(){
        System.out.println("Walking...");
        this.bark();
    }
}    