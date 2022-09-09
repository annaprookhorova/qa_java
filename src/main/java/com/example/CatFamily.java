package com.example;
import java.util.List;

public interface CatFamily {
    int getKittens();

    List<String> getFood(String animalKind) throws Exception;
}
