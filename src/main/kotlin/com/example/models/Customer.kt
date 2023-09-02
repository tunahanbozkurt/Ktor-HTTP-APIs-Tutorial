package com.example.models

import kotlinx.serialization.Serializable

@Serializable
data class Customer(
    val id: String,
    val firstName: String,
    val lastName: String,
    val email: String
)

val customerStorage = mutableListOf<Customer>().apply {
    add(
        Customer(
            id = "0",
            firstName = "Customer 1 First Name",
            lastName = "Customer 1 Last Name",
            email = "customer1@example.com"
        )
    )
    add(
        Customer(
            id = "1",
            firstName = "Customer 2 First Name",
            lastName = "Customer 2 Last Name",
            email = "customer2@example.com"
        )
    )
    add(
        Customer(
            id = "2",
            firstName = "Customer 3 First Name",
            lastName = "Customer 3 Last Name",
            email = "customer3@example.com"
        )
    )
}