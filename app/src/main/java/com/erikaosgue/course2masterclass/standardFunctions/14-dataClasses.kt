package com.erikaosgue.course2masterclass.standardFunctions

fun main() {
    val customers = arrayListOf<Customer>()
    customers.add(Customer("Alice", "alice@gmail.com", 3))
    customers.add(Customer("Andrew", "andrew@gmail.com", 1))
    customers.add(Customer("Kraken", "kraken@gmail.com", 6))
    customers.add(Customer("Staicy", "staicy@gmail.com", 7))
    println(customers)

    val newCustomer = customers[1].copy(email="andrew_22@gmail.com")
    customers.add(newCustomer)
    println(customers)

    sendEmail(customers)

}

fun sendEmail(customers: ArrayList<Customer>) {
    customers.forEach{ customer ->
        println("Sending an email to the ${customer.email}")
    }
}
data class Customer(
    val name: String,
    val email: String,
    val productsBought: Int
)