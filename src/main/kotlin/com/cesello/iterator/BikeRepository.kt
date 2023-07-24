package com.cesello.iterator

class BikeRepository(private var bikes: Array<String?> = arrayOfNulls(10), private var index: Int = 0) {

    fun addBike(bike: String) {
        if(index == bikes.size) {
            val largerBikes: Array<String?> = arrayOfNulls(bikes.size + 5)
            System.arraycopy(bikes, 0, largerBikes, 0, bikes.size)
            bikes = largerBikes
        }

        bikes[index] = bike
        index++
    }

    fun iterator(): Iterator<String> {
        return (object: Iterator<String> {
            private var currentIndex = 0

            override fun hasNext(): Boolean = currentIndex < bikes.size && bikes[currentIndex] != null

            override fun next(): String = bikes[currentIndex++]!!

        })
    }
}