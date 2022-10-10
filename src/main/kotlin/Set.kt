fun main(){
//    val setA = setOf(1, 2, 4, 2, 1, 5)
//    val setB = setOf(1, 2, 4, 5)
//    println(setA == setB)
//
//    println(4 in setA)

    val list1 = listOf(1, 1, 2, 3, 5, 8, -1)
    val list2 = setOf(1, 1, 2, 2, 3, 5)
    val list3 = mutableSetOf(6, 7)

    val intersect = list1 intersect list2
    val union = list1 union  list2 union list3

    println(intersect)
    println(union)


    val setItems = mutableSetOf(1, 2, 3, 5, 1, 4)
    setItems.add(6)
    setItems.remove(2)

    print(setItems)
}