//単純な高階関数
fun succ2(n: Int): Int {
    return n + 1
}

//ちょっと複雑な高階関数
fun cotains(ints: List<Int>, predicate: (Int) -> Boolean): Boolean {
    for (i in ints) {
        if (predicate(i)) return true
    }
    return false
}
fun isGreaterThan5(n: Int): Boolean = 5 < n
fun isMultipleOf3(n: Int): Boolean = n % 3 == 0

fun twice(n: Int, f: (Int) -> Int): Int = f(f(n))

fun main(args: Array<String>) {
    //単純な高階関数
    val got = twice(2, ::succ2)
    println(got)

    //ちょっと複雑な高階関数
    println(cotains(listOf(2,4,6),::isGreaterThan5))
    println(cotains(listOf(2,4,6),::isMultipleOf3))
}