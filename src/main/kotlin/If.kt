fun main(){
    val condition = true

    if(condition){
        println("this block to be executed if condition is true")
    }else{
        println("this block to be executed if condition is false")
    }

    val timeOpen = 8
    val timeClose = 12
    val timeNow = 7

    val classStatus =
        if(timeNow >= timeClose){
            "Class already closed"
        } else if(timeNow >= timeOpen){
            "Class is open"
        } else {
            "Class is not open yet"
        }

    println(classStatus)
}