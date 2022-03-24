/*
Kita tidak dapat bekerja dengan variabel maybeNumber dan s2 seperti biasanya karena kedua
variabel tersebut mungkin saja memiliki nilai null. Untuk memanggil dan menggunakannya
dengan aman, maka tambahkan operator !! yang fungsinya melewatkan pemeriksaan nilai null.
 */

fun main() {
    var maybeNumber: Int? = 15
    maybeNumber = null
    println(maybeNumber * 2)

    var s1 = "Hello"
    var s2: String? = "World"
    println(s1.length)
    println(s2.length)
}