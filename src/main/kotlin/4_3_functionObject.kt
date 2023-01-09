fun succ(n:Int): Int {
    return n+1
}

fun main(args: Array<String>) {
    //関数オブジェクト
    val myFunction:(Int) -> Int = ::succ
    val got = myFunction(2)
    println(got)
}