fun main(){
    val safeText: String? = null
    val safeTextLength = safeText?.length ?: 0

    println(safeTextLength)

    var dateOut: String? = null
    var status = "Booked"

    status = "Checkout"

    if(status.equals("Checkout")){
        dateOut = "28/10/2022 12:05:00"
    }

    println(dateOut)
}