/*
Return dari function ini berguna untuk mendefinisikan apakah function kita
memiliki return atau tidak. Jika memiliki return, maka kita perlu
mendefinisikan tipe data apa yang dihasilkan oleh function yang kita buat.
Jika function kita memiliki return, maka pastikan untuk memanggil syntax
return di akhir dari functionnya.
 */
fun main(args: Array<String>) {
    val listNumber = listOf(1,2,3,4,5,6)
    println("Jumlah nilai pada elemen listNumber = ${getSum(listNumber)}")
}
fun getSum(values: List<Int>) : Int { // return type is Int
    var total = 0;
    for (i in values) total += i
    return total // return value
}