fun main(){
//    val rangeInt = 1..10
//    println("Step: " + rangeInt.step)
//    println(rangeInt.toList())

//    val rangeInt = 1.rangeTo(10)
//    println("Step: " + rangeInt.step)
//    print(rangeInt.toList())

//    val rangeInt = 1..10 step 2
//    println("Step: " + rangeInt.step)
//    print(rangeInt.toList())

//    var i=4
//    if (i in 1.rangeTo(10)){
//        println("Value $i is available in Range")
//    }

    var i = 20
    if (i !in 10.downTo(1)) {
        println("Value $i is not available in Range")
    }

}