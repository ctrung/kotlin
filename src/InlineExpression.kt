fun main(args: Array<String>) {

    val a = 1
    val b = 0

    val max = if(a < b ) b else a
    println (max)

    val toString = when(max) {
        0 -> "zero"
        1 -> "one"
        else -> "other"
    }
    println (toString)
}