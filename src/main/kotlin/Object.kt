//class NDP {
//    class Infinite{
//        fun welcome() = "Welcome to The Infinite Learning!"
//    }
//}

class Nongsa{
    private val welcomeMessage: String = "Welcome to the Infinite Learning"
    inner class Infinite{
        fun welcome() = welcomeMessage
    }
}

fun main(){
//    val helloCompany = NDP.Infinite().welcome()
//    println(helloCompany)

    val obj = Nongsa().Infinite()
    println(obj.welcome())
}