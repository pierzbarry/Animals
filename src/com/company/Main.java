package com.company;

// What just happened?
// Comment your understanding of object-oriented programming from the four classes created above.
// Where is the method executing encapsulation? Inheritance? Or polymorphism?
//
// Create 2 more animal classes (i.e. Dog, Mouse, etc.) and extend the animal class to verify your understanding.

public class Main {

        public static void main(String[] args) {

            Animal a = new Animal();
            print(a.eat());
            print(a.sleep());
            System.out.println();

            Cat c = new Cat();
            print(c.eat());
            print(c.sleep());
            print(c.purr());
            System.out.println();

            Bird b = new Bird();
            print(b.eat());
            print(b.sleep());
            print(b.fly());
            System.out.println();

            Dog d = new Dog();
            print(d.eat());
            print(d.sleep());
            print(d.bark());
            print(d.dig());;
            System.out.println();

            Mouse m = new Mouse();
            print(m.eat());
            print(m.sleep());
            print(m.hole());
        }

        private static void print(String s) {
            System.out.println(s);
        }
}
