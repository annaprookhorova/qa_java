package com.example;

import java.util.List;

public class Lion {

    boolean hasMane;

    private CatFamily catFamily;

    public Lion(String sex) throws Exception {
        if ("Самец".equals(sex)) {
            hasMane = true;
        } else if ("Самка".equals(sex)) {
            hasMane = false;
        } else {
            throw new Exception("Используйте допустимые значения пола животного - самец или самка");
        }
    }

    public Lion(String sex, CatFamily catFamily) throws Exception {
        this(sex);
        this.catFamily = catFamily;
    }

    public int getKittens() {
        return catFamily.getKittens();
    }

    public boolean doesHaveMane() {
        return hasMane;
    }

    public List<String> getFood() throws Exception {
        return catFamily.getFood("Хищник");
    }
}
