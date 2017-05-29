package com.themobilelife.kotlintest;

import akka.http.javadsl.server.HttpApp
import akka.http.javadsl.server.Route

// For this simple example we can use Kotlin's object system instead of a class
object App : HttpApp() {
    override fun route() : Route =
        path("hello", { get { complete("Hello from Kotlin + Akka HTTP!") } })
}

fun main(args: Array<String>) {
    App.startServer("0.0.0.0", 8080)
}