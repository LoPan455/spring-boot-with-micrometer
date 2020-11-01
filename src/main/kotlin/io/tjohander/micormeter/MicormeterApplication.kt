package io.tjohander.micormeter

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MicormeterApplication

fun main(args: Array<String>) {
	runApplication<MicormeterApplication>(*args)
}
