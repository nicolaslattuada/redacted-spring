package com.example.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@Retention(AnnotationRetention.SOURCE)
@Target(AnnotationTarget.CLASS, AnnotationTarget.FIELD)
annotation class Redacted

data class User(val name: String, @Redacted val phoneNumber: String)

@SpringBootApplication
class DemoApplication

fun main(args: Array<String>) {
	println(User("Hello", "world"))
	runApplication<DemoApplication>(*args)
}
