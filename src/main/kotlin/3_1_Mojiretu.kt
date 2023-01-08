fun main(args: Array<String>) {

    //
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

    val strs: Array<String> = arrayOf("foo","bar","bat")
    strs[2] = "qut"
    println(strs[2])
    strs[1] = "abc"
    println(strs[1])

    //明示的な型の指定を省略もできる
    val strs2 =arrayOf("foo","bar","bat")
    println(strs2[0])
}