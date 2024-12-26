package com.leonpatmore.user.graph

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.graphql.data.query.QueryByExampleDataFetcher
import org.springframework.graphql.execution.RuntimeWiringConfigurer

@Configuration
class GraphQlConfig {
    @Bean
    fun runtimeWiringConfigurer(repository: UserNameRepository) : RuntimeWiringConfigurer = RuntimeWiringConfigurer {
        it.type("Query") {
            it.dataFetcher("userName", QueryByExampleDataFetcher.builder(repository).single())
            it.dataFetcher("userNames", QueryByExampleDataFetcher.builder(repository).scrollable())
        }
        it.type("User") {
            it.dataFetcher("name", QueryByExampleDataFetcher.builder(repository).single())
        }
    }
}
