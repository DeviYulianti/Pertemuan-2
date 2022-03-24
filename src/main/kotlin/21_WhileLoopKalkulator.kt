fun main() {
    /*
    Penerapan While-Loop dalam Kalkulator Sederhana
     */
    println("Welcome to our calculator")
    var goOn = "yes"
    while (goOn == "yes") {
        println("Enter the first number")
        val a = readLine()!!.toDouble() // pemanggilan nilai pertama bertipe double
        println("Enter the second number:")
        val b = readLine()!!.toDouble() // pemanggilan nilai kedua bertipe double

//        pemilihan operator
        println("Choose one of the following operations:")
        println("1 - addition")
        println("2 - subtraction")
        println("3 - multiplication")
        println("4 - division")
        val choice = readLine()!!.toInt()
        var result: Double = 0.0
        when (choice) {
            1 -> result = a + b // jika memilih 1 maka akan otomatis menjumlahkan nilai pertama dan kedua
            2 -> result = a - b // jika memilih 2 maka akan otomatis mengurangi nilai pertama dan kedua
            3 -> result = a * b // jika memilih 3 maka akan otomatis mengkalikan nilai pertama dan kedua
            4 -> result = a / b // jika memilih 4 maka akan otomatis membagikan nilai pertama dan kedua
        }
        if ((choice > 0) && (choice < 5)) {
            println("Result: $result")
        } else { // ini akan di jalankan jika value yang di masukkan tidak sesuai pilihan
            println("Invalid choice")
        }
        println("Would you like to make another calculation? [yes/no]")
        goOn = readLine()!!
    }
    println("Thank you for using our calculator.")
}