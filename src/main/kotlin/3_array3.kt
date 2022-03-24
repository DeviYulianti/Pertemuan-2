fun main() {
    /*
    Kotlin memiliki kelas khusus untuk membuat array dengan tipe primitive tanpa adanya fitur
  boxing seperti ByteArray , ShortArray , IntArray dan banyak lagi.
     */
    val x: IntArray = intArrayOf(1, 2, 3)
    x[0] = x[1] + x[2]
    x.forEach { print(it.toString() + ' ') }
    print('\n')
// array integer yang memiliki size 5
    val byteArray = ByteArray(5)
    byteArray.forEach { print(it.toString() + ' ') }
    print('\n')
// contohnya inisialisasikan nilai dalam array dengan konstanta
// Array int ukuran 5 dengan nilai [42, 42, 42, 42, 42]
    val shortArray = ShortArray(5) { 42 }
    shortArray.forEach { print(it.toString() + ' ') }
    print('\n')
// misalnya inisialisasi nilai-nilai dalam array menggunakan lambda
// Array int ukuran 5 dengan nilai [0, 1, 2, 3, 4] (nilai diinisialisasi ke nilai indeksnya)
    var intArray = IntArray(5) { it * 1 }
    intArray.forEach { print(it.toString() + ' ') }
    print('\n')
}