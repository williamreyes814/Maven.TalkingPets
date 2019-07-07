package io.zipcoder.polymorphism;

import java.util.ArrayList;

/**
 * Created by leon on 11/6/17.
 */
public class MainApplication {

    public static void main(String[] args) {
        InputHandler input = new InputHandler();
        input.assignNamesAndTypes();
        ArrayList<Pet> ListOfpets = new ArrayList<Pet>();

        for (int i = 0; i < input.getNumberOfPets(); i++) {

            switch(input.getPetTypes().get(i)){

                case "dog":{
                    ListOfpets.add(new Dog(input.getPetNames().get(i)));
                    break;
                }

                case "cat": {
                    ListOfpets.add(new Cat(input.getPetNames().get(i)));
                    break;
                }

                case "hamster": {
                    ListOfpets.add(new Hamster(input.getPetNames().get(i)));
                    break;
                }

                default:
                    ListOfpets.add(null);

            }

        }

        for(Pet pet : ListOfpets){
            if(pet != null) {
                System.out.println(pet.getName());
                System.out.println(pet.speak());


            }
        }
    }

}
