package com.themobilelife.kotlintest;

import akka.http.javadsl.server.HttpApp
import akka.http.javadsl.server.Route

object App : HttpApp() {
    override fun route() : Route = route(
        path("/hello", { get { complete("Hello from Akka HTTP!") } })
    )
}

fun main(args : Array<String>) {
    App.startServer("0.0.0.0", 8080)
}