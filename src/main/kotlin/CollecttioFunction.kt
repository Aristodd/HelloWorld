fun main(){
//    val numberList = listOf(1, 2, 3, 4, 5)
//
//    val evenList = numberList.filter { it % 2 == 0 }
//    val notEvenList = numberList.filterNot { it % 2 == 0 }
//
//    println(evenList)
//    println(notEvenList)

//    val numberList = listOf(1, 2, 3, 4, 5)
//    val names = listOf("Joko", "Siti", "Edo", "Eko")
//
//    val hurufKapital = names.map { name -> name.uppercase() }
//    println(hurufKapital)
//
//    val multipliedBy5 = numberList.map { it * 5 }
//
//    println(multipliedBy5)

//    val days = arrayOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
//
//    val totalDays = days.count()
//    println(totalDays)

//    val numberList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
//    val oddNumber = numberList.find { it%2 == 1 }
//    val firstOrNullNumber = numberList.firstOrNull{it%2 ==3}
//    val lastOrNullNumber = numberList.lastOrNull{it%2 ==1}
//
//    println(numberList)
//    println(oddNumber)
//    println(firstOrNullNumber)
//    println(lastOrNullNumber)

//    val days = arrayOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
//
//    val firstData = days.first()
//    val latestData = days.last()
//
//    println(firstData)
//    println(latestData)
//
//    val numberList = listOf(1, 2, 3, 6, 5, 4)
//
//    val total = numberList.sum()
//    println(total)

    val numberList = listOf(1, 2, 3, 6, 5, 4)
    val hackerChar = listOf('h', 'a', 'c', 'k', 'e', 'r')

    val ascendingSort1 = numberList.sorted()
    val ascendingSort2 = hackerChar.sorted()
    val descendingSort1 = numberList.sortedDescending()
    val descendingSort2 = hackerChar.sortedDescending()

    println(ascendingSort1)
    println(ascendingSort2)
    println(descendingSort1)
    println(descendingSort2)
}