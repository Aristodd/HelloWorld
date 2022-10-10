fun main(){

//    val numberList = mutableListOf("One", "Two", "Three")
//    println(numberList)
//
//    numberList.remove("Two")
//    println(numberList)

    val numberList = mutableListOf(false, "One", 2, 3.5)
    println(numberList)

    numberList.remove(false)
    numberList.set(0, 1)
    numberList[2] = 3
    numberList.add(3, 4)

    println(numberList)
}