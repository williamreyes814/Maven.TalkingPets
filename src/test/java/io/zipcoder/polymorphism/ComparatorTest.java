package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;

public class ComparatorTest {

    @Test
    public void ComparatorTest(){
        Cat cat1 = new Cat("Ben");
        Dog dog1 = new Dog("Dave");
        Hamster ham1 = new Hamster("Hammy");

        ArrayList<Pet> myList = new ArrayList<>();
        myList.add(ham1);
        myList.add(cat1);
        myList.add(dog1);

        Collections.sort(myList, new PetComparator());
        Assert.assertEquals(cat1, myList.get(0));
        Assert.assertEquals(dog1, myList.get(1));
        Assert.assertEquals(ham1, myList.get(2));
    }

    @Test
    public void ComparatorSameTest(){
        Cat cat1 = new Cat("Ben");
        Dog dog1 = new Dog("Dave");
        Dog dog2 = new Dog("Abe");
        Hamster ham1 = new Hamster("Hammy");

        ArrayList<Pet> myList = new ArrayList<>();
        myList.add(ham1);
        myList.add(cat1);
        myList.add(dog1);
        myList.add(dog2);


        Collections.sort(myList, new PetComparator());
        Assert.assertEquals(cat1, myList.get(0));
        Assert.assertEquals(dog2, myList.get(1));
        Assert.assertEquals(dog1, myList.get(2));
        Assert.assertEquals(ham1, myList.get(3));
    }
}
