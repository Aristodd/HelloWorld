fun main(){
//    for (i in 1..20){
//        println("Value is $i")
//    }

//    val days = arrayOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
//    for (day in days){
//        println(day)
//    }

//    val days = arrayOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
//    for ((index, value) in days.withIndex()){
//        println("value $value with index $index")
//    }

//    val days = arrayOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
//    days.forEach{ value ->
//        println("Day is $value")
//    }

    val days = arrayOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    days.forEachIndexed{
        index, value ->
        println("Day $value with index: $index")
    }
}