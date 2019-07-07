package io.zipcoder.polymorphism;

import java.util.Comparator;

public abstract class Pet implements Comparable <Pet> {
    public abstract String speak();
    private String name;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Pet o) {
      if(name.compareTo(o.getName()) == 0) {  // compares name of current object to name of object that we're passing in.

          return getClass().getSimpleName().compareTo(o.getClass().getSimpleName());
      }
      else {
          return name.compareTo(o.getName());
      }
    }
}
