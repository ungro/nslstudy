fun main(args: Array<String>) {
    /* String */
    val str: String = "Kotlin is fun!"
    println(str.length) //文字列の長さを返すプロパティ

    println(str.isBlank()) //文字列がブランクであるかどうかを判定するメソッド

    println(str.toUpperCase()) //大文字に変換した文字列を返すメソッド

    println(str.toLowerCase()) //小文字に変換した文字列を返すメソッド

    println(str.reversed()) //逆順にした文字列

    //そのまま出力するraw String
    val messege = """私の
        名前は
        山田太郎です。
    """
    println(messege)

    val trimMessege = """私の
        |名前は
        |山田花子です。
    """.trimMargin()
    println(trimMessege)

    /* Array */
    val strs: Array<String> = arrayOf("foo", "bar", "bat")
    strs[2] = "qut"
    println(strs[2])
    strs[1] = "abc"
    println(strs[1])

    //明示的な型の指定を省略もできる
    val strs2 = arrayOf("foo", "bar", "bat")
    println(strs2[0])

    /* List */
    val ints: List<Int> = listOf(1, 2, 3)
    println(ints)

    //明示的な型の指定を省略もできる
    val ints2 = listOf(4, 5, 6)
    println(ints2)

    //変更可能なリスト
    val liststrs: MutableList<String> = mutableListOf("hoge")
    println(liststrs)
    liststrs[0] = "star"
    println(liststrs)
    liststrs.add("hoke")
    println(liststrs)

    /* サブクラスゆえの注意点 */
    val a: MutableList<Int> = mutableListOf(1, 2, 3)
    val b: List<Int> = a
    println(b)

    //aに要素を追加すると
    a.add(5)

    //bにも影響を与える
    println(b)

    //ダウンキャストして要素追加も可能
    (b as MutableList<Int>).add(100)
    println(b)

    /* Map */
    val numberMutableMap = mutableMapOf("one" to 1)
    val numberMap: Map<String, Int> = numberMutableMap
    println(numberMap)

    numberMutableMap["two"] = 2
    println(numberMap)

    /* Range */
    val rangelist = (1..10).toList()
    println(rangelist[9])

    //変数ageに14を代入
    val age = 14
    //それぞれの変数に整数の範囲を代入
    val num1 = 7..12
    val answer1 = age in num1
    println(answer1)

    //デクリメント
    println((5 downTo 1).toList())
    //stepで刻む値を設定可能
    println((5 downTo 2 step 2).toList())
}