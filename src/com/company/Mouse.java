package com.company;

public class Mouse extends Animal {
    public Mouse() {
        super();
        System.out.println("Now I am a Mouse?");
    }

    @Override
    public String sleep() {
        return "A mouse sleeps...";
    }

    @Override
    public String eat() {
        return "A mouse eats...CHEESE";
    }

    public String hole() {
        return "A mouse hides in its hole!";
    }
}
