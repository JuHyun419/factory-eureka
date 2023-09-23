package com.factory.factoryeureka

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer

@EnableEurekaServer
@SpringBootApplication
class FactoryEurekaApplication

fun main(args: Array<String>) {
    runApplication<FactoryEurekaApplication>(*args)
}
