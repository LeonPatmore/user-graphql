package com.leonpatmore.graphql_demo

import org.springframework.graphql.data.method.annotation.Argument
import org.springframework.graphql.data.method.annotation.QueryMapping
import org.springframework.graphql.data.method.annotation.SchemaMapping
import org.springframework.stereotype.Controller

@Controller
class UserController {

    @QueryMapping
    fun user(@Argument id: Long) : User {
        return User(id)
    }

    @SchemaMapping(typeName = "User", field = "address")
    fun getAddress(user: User) : UserAddress {
        return UserAddress("a", "b")
    }

}

data class UserAddress(val postcode: String, val firstLine: String)

data class UserName(val first: String, val last: String)

data class User(val id: Long, val address: UserAddress? = null, val name: UserName? = null)
