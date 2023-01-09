fun lamdacotains(ints: List<Int>, predicate: (Int) -> Boolean): Boolean {
    for (i in ints) {
        if (predicate(i)) return true
    }
    return false
}

fun main(args: Array<String>) {
    //ラムダ式記述
    println(lamdacotains(listOf(2, 4, 6), { 5 < it }))
    println(lamdacotains(listOf(2, 4, 7), { it % 3 == 0 }))

    /*高階関数最後の引数がラムダ式の場合、引数リストの外に出してもよい*/
    println(lamdacotains(listOf(2, 4, 6)) { 5 < it })
    println(lamdacotains(listOf(2, 4, 7)) { it % 3 == 0 })

    //無名関数の場合
    println(lamdacotains(listOf(2, 4, 6), fun (n: Int): Boolean = 5 < n))
    println(lamdacotains(listOf(2, 4, 7), fun(n: Int): Boolean = n % 3 == 0))
}