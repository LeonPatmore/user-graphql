package com.leonpatmore.user.graph

import jakarta.persistence.Entity
import jakarta.persistence.Id
import org.springframework.graphql.data.method.annotation.Argument
import org.springframework.graphql.data.method.annotation.QueryMapping
import org.springframework.graphql.data.method.annotation.SchemaMapping
import org.springframework.stereotype.Controller

@Controller
class UserController(val userNameRepository: UserNameRepository) {

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

@Entity
data class UserName(@Id val id: Long = 0, val first: String? = null, val last: String? = null)

data class User(val id: Long, val address: UserAddress? = null, val name: UserName? = null)
