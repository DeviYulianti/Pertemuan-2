fun main() {
    println("Enter a number between 10-20:")
    //inisialisasi variabel a
    val a = readLine()!!.toInt()
    if (a >= 10 && a <= 20) {
        println("The condition has been met.")
    } else { //kondisi jika anda salah memasukkan nilai sesuai range
        println("You did it wrong.")
    }
    println("\nEnter a number between 10-20 or 30-40:")
    //inisialisasi variabel b
    val b = readLine()!!.toInt()
    if (((b >= 10) && (b <= 20)) || ((b >=30) && (b <= 40))) {
        println("The condition has been met.")
    } else { //kondisi jika anda salah memasukkan nilai sesuai range
        println("You did it wrong.")
    }
}
