package io.zipcoder.polymorphism;

import java.util.HashMap;

public class Hamster extends Pet {

    public String speak() {

        String speak = "Squeek";

        return speak;
    }

    public Hamster(){
        setName("Default Name");

    }

    public Hamster(String name){

       setName(name);
    }

}
