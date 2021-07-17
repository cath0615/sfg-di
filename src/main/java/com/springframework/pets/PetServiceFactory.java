package com.springframework.pets;

/**
 * Created by jt on 2/20/21.
 */
//pretend the petService is a third party utility and we use Java
//configuration to provide some functinality we want to use
public class PetServiceFactory {

    public PetService getPetService(String petType){
        switch (petType){
            case "dog":
                return new DogPetService();
            case "cat":
                return new CatPetService();
            default:
                return new DogPetService();
        }
    }
}
