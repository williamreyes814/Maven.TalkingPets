package io.zipcoder.polymorphism;

import java.security.PublicKey;

public class Cat extends Pet {


    public String speak() {
        String speak = "meow";
        return speak;
    }

    public Cat(){
        setName("Default Name");
    }

    public Cat(String name){
        setName(name);
    }
}
