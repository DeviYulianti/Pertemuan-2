fun main() {
    /*
    Kalkulator Sederhana Menggunakan Percabangan IF-ELSE IF,
    kalklator ini terdapat 4 pilihan operator yaitu tambahan,
    pengurangan, perkalian, divisi/pembagian.
     */
    println("Welcome to our calculator")
    println("Enter the first number:")
    val a = readLine()!!.toDouble()
    println("Enter the second number:");
    val b = readLine()!!.toDouble()

//    pemilihan operasi, terdapat tambahan, pengurangan, perkalian, divisi/pembagian
    println("Choose one of the following operations:")
    println("1 - addition")
    println("2 - subtraction")
    println("3 - multiplication")
    println("4 - division")

    val choice = readLine()!!.toInt()
    var result = 0.0
    if (choice == 1) { //ketika anda memilih operator 1 maka proses atau operator yang di jalankan adalah tambah atau penjumlahan.
        result = a + b
    } else if (choice == 2) {//ketika anda memilih operator 2 maka proses atau operator yang di jalankan adalah pengurangan.
        result = a - b
    } else if (choice == 3) {//ketika anda memilih operator 3 maka proses atau operator yang di jalankan adalah perkalian.
        result = a * b
    } else if (choice == 4) {//ketika anda memilih operator 4 maka proses atau operator yang di jalankan adalah pembagian.
        result = a / b
    }
    if ((choice > 0) && (choice < 5)) {
        println("result: $result")
    } else {
        println("Invalid choice")//ini akan muncul ketika anda memilih selain 1,2,3,4
    }
    println("Thank you for using our calculator.")
}