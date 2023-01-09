fun main(args: Array<String>) {
    //if式
    val result = if (true) "True" else "False"
    println(result)

    //when式
    val key = 4
    val result2 = (when (key) {
        1 -> "one"
        2 -> "two"
        3 -> "three"
        else -> "unknown"
    }).also {
        println(it)
    }

    val result3 = (when (key) {
        1 -> "one"
        in 2..5 -> "between two and five"
        else -> "unknown"
    }).also {
        println(it)
    }
}