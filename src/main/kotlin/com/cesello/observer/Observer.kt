package com.cesello.observer

abstract class Observer(val subject: Subject) {

    abstract fun update()
}