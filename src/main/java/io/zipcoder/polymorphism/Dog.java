package io.zipcoder.polymorphism;

public class Dog extends Pet {
    public String speak() {

        String speak = "Woof";

        return speak;
    }

    public Dog(){
        setName("Default name");
    }
    public Dog(String name){
        setName(name);

    }
}
