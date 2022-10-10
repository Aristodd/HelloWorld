fun main(){
//    var i = 0
//    while (true){
//        println("Break $i")
//        i++
//        if (i > 500) {
//            break
//        }
//    }
//    val c = 2
//    for (b in 1..10){
//        println("Sayang... ")
//
//        if (b == c){
//            println("Putus!")
//            break
//        }
//    }

//    val listInt = listOf(1, 2, null, 4, 5, null, 7)
//
//    for (i in listInt){
//        if (i == null) continue
//        println(i)
//    }

    println("Print odd numbers")
    for (i in 1..20){
        if (i%2 == 0){
            continue
        }
        println("$i is an odd number")
    }
}