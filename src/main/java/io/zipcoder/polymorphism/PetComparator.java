package io.zipcoder.polymorphism;

import java.util.Comparator;

public class PetComparator implements Comparator <Pet> {
    @Override
    public int compare(Pet o1, Pet o2) {

        if(o1.getClass().getSimpleName().equals(o2.getClass().getSimpleName())) {

            return  o1.getName().compareTo(o2.getName());
       }
       else {

           return o1.getClass().getSimpleName().compareTo(o2.getClass().getSimpleName());
       }

    }
}
