package com.vaeldung

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class VaeldungServiceApplication

fun main(args: Array<String>) {
	runApplication<VaeldungServiceApplication>(*args)
}
