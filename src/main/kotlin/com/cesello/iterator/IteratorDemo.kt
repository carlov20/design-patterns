package com.cesello.iterator

fun main() {
    val repo = BikeRepository()

    repo.addBike("Cervelo")
    repo.addBike("Scott")
    repo.addBike("Fuji")

    val bikeIterator = repo.iterator()

    while(bikeIterator.hasNext()) {
        println(bikeIterator.next())
    }
}