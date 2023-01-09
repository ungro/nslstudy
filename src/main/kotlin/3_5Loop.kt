fun main(args: Array<String>) {
    //while
    var count = 3
    while(0< count--){
        println("うはは")
    }

    //do-whileではdoブロック内の変数をwhileの条件式で使うことができる
    do {
        println("わはは")
        val repeat = Math.random() < 0.5
    }while (repeat)

    //for文
    for(i in 1..10){
        println("i = $i")
    }

    for(i in 5 downTo 1 step 2){
        println("i = $i")
    }
}