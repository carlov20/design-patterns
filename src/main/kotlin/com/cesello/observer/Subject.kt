package com.cesello.observer

abstract class Subject {

    private val observers: MutableList<Observer> = ArrayList()

    abstract fun setState(state: String)

    abstract fun getState(): String

    fun attach(observer: Observer) = observers.add(observer)

    fun detach(observer: Observer) = observers.remove(observer)

    fun notifyObservers() = observers.forEach { observer -> observer.update() }
}