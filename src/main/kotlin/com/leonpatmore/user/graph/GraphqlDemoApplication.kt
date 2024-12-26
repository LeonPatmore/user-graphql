package com.leonpatmore.user.graph

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.jpa.repository.config.EnableJpaRepositories

@SpringBootApplication
@EnableJpaRepositories(basePackages = ["com.leonpatmore.user.graph"])
class GraphqlDemoApplication

fun main(args: Array<String>) {
	runApplication<GraphqlDemoApplication>(*args)
}
