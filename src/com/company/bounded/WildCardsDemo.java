package com.company.bounded;

import java.util.ArrayList;
import java.util.List;

public class WildCardsDemo {
    public static void main(String[] args) {
        List<Pigeon> list1 = new ArrayList<>();
        list1.add(new Pigeon());
        list1.add(new Pigeon());
        print(list1);


        List<Animal> list2 = new ArrayList<>();
        list2.add(new Cat());
        list2.add(new Sparrow());
        print(list2);

        List<?> list =new ArrayList<>();
        list.add(null);
        System.out.println(list);

        List<Animal> list3= new ArrayList<>();
        //list3.add(new Pigeon());
    }

    // Upper wildcard
    public static void print(List<? extends Animal> list) {
        System.out.println(list);
    }

    // Lower wildcard
    public static void print1(List<? super Pigeon> list) {
        System.out.println(list);
    }

    // Unbounded wildcard
    public static void print2(List<?> list) {
        System.out.println(list);
    }
}
