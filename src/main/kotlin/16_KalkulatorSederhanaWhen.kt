fun main() {
    println("Welcome to our calculator")
    println("Enter the first number:");//mencetak nilai pertama
    val a = readLine()!!.toDouble()
    println("Enter the second number:")//mencetak nilai setelah kedua
    val b = readLine()!!.toDouble()

//    pemilihan operator
    println("Choose one of the following operations:")
    println("1 - addition") //penjumlahan
    println("2 - subtraction") // pengurangan
    println("3 - multiplication") //perkalian
    println("4 - division") //pembagian
    val choice = readLine()!!.toInt()
    var result = 0.0
    when (choice) {
        1 -> result = a + b
        2 -> result = a - b
        3 -> result = a * b
        4 -> result = a / b
    }
    if ((choice > 0) && (choice < 5)) {
        println("Result: $result")
    } else { //ini akan di jalankan jika pilihan yang di masukkan salah
        println("Invalid choice")
    }
    println("Thank you for using our calculator.")
}