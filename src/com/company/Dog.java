package com.company;

public class Dog extends Animal {
    public Dog() {
        super();
        System.out.println("Now I am a Dog!");
    }

    @Override
    public String sleep() {
        return "A dog sleeps...";
    }

    @Override
    public String eat() {
        return "A dog eats...cats!";
    }

    public String bark() {
        return "bark...?";
    }

    public String dig() {
        return "A dog digs up dirt!";
    }

}
