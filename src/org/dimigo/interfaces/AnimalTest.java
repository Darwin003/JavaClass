package org.dimigo.interfaces;

import org.dimigo.inheritance.Animal;
import org.dimigo.inheritance.Cat;
import org.dimigo.inheritance.Dog;
import org.dimigo.inheritance.Tiger;

public class AnimalTest {
    public static void main(String[] args) {
//        Animal a = new Animal("동물");
//        System.out.println(a);
//        a.bark();
//
//        Animal d = new Dog("멍멍이");
//        System.out.println(d);
//        d.bark();   //Animal의 bark
////        d.wag();
//
//        Animal c = new Cat("야옹이");
//        System.out.println(c);
//
//
//        c.bark();               //Cat의 bark()
////        c.scratch();
//
//        Animal t = new Tiger("호돌이");
//        System.out.println(t);
//        t.bark();           // Tiger의 bark()
////        t.hunt();

//        Animal[] animals = {
//                new Animal("동물"),
//                new Dog("멍멍이"),
//                new Cat("야옹이"),
//                new Tiger("호돌이")
//        };
//
//        for(Animal a : animals) {
//            System.out.println(a);
//            a.eat();
//            a.sleep();
//            a.bark();
//        }
//
//
//        Animal dog = new Dog("멍멍이");
//        dog.eat();
//        dog.sleep();
//        //dog.wag();
//        ((Dog) dog).wag();
//        Dog dog2 = (Dog) dog;
//        dog2.wag();
//
//
//        Animal cat = new Cat("야옹이");
//        ((Cat) cat).scratch();
//
//    }
//
//    private static void doAction(Animal a)
//    {
//        if(a instanceof Cat)
//        {
//            Cat c = (Cat) a;
//            c.scratch();
//        } else if(a instanceof Dog) {
//            ((Dog) a).wag();
//        }



        IAnimal[] animals = {
                new Duck(), new Cow(), new Pig()
        };

        System.out.println("평화로운 동물들");
        for(IAnimal animal : animals)
        {
            animal.eat();
        }
        System.out.println("늑대가 나타났다!");
        for(IAnimal animal : animals)
        {
            animal.bark();;
        }
    }
}
