package com.cesello.iterator;

import java.util.Iterator;

public class IteratorJDemo {

    public static void main(String[] args) {

        BikeRepositoryJ repo = new BikeRepositoryJ();

        repo.addBike("Cervelo");
        repo.addBike("Scott");
        repo.addBike("Fuji");


        Iterator<String> bikeIterator = repo.iterator();

//        while(bikeIterator.hasNext()) {
//            System.out.println(bikeIterator.next());
//        }

        for (String bike : repo) {
            System.out.println(bike);
        }
    }
}
