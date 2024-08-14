package com.template_clean_architecture

import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
@ComponentScan("com.template_clean_architecture")
@EnableAutoConfiguration
class BootApplication

fun main(args: Array<String>) {
	runApplication<BootApplication>(*args)
}
