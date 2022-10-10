fun main() {
    val hasil = setUser("Budi", 21)

    println(hasil)
}

fun setUser(name: String, age: Int): String {
    return "Nama kamu adalah $name, dan umur kamu adalah $age tahun."
}