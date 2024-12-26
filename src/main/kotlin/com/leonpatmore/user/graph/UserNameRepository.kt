package com.leonpatmore.user.graph;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;
import org.springframework.graphql.data.GraphQlRepository;

@GraphQlRepository
interface UserNameRepository : JpaRepository<UserName, Long>, QueryByExampleExecutor<UserName>
