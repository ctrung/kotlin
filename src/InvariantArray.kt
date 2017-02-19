fun main(args: Array<String>) {

    // unlike Java where they are covariant, arrays in Kotlin are invariant
    val arrayOfStrings = arrayOf("one", "two", "three")

    // the following produces a type mismatch error
    // val arrayOfObjects: Array<Object> = arrayOfStrings

}