
// properties in kotlin vs fields in java (like in groovy, produced bytecode contains getter / setter)
// primary constructor, optional body definition
// data keyword -> automatic generation of toString / equals / hashCode

data class Customer(val name: String, val email: String)

fun main(args: Array<String>) {

    val customer = Customer ("Hello", "World")

    // will print : Customer(name=Hello, email=World)
    println(customer)
}