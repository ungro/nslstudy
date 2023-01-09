// 関数の定義
fun double(n: Int): Int = n * 2

// returnのある関数
fun sum(ints: List<Int>): Int {
    var sum = 0
    for (i in ints) {
        sum += i
    }
    return sum
}

// 戻り値のない関数
fun hello(name: String): Unit {
    println("Hello,$name")
}

// デフォルト値を設定している関数
fun defaultHello(name: String = "world") {
    println("Hello,$name")
}

fun main(args: Array<String>) {
    var got = double(123)
    println(got)

    got = sum(listOf(4, 5, 6))
    println(got)

    var gotHello = hello("Taro")
    println(gotHello)

    gotHello = defaultHello()
    println(gotHello)
}