class `36_Fungsi` {
}/*
Fungsi di Kotlin dideklarasikan menggunakan keyword fun. Fungsi dapat ditulis dalam 3 tempat
yaitu : 1) dalam sebuah kelas, seperti method di Java ia sering disebut member functions; 2)
diluar kelas, ia disebut top-level function; 3) dan didalam fungsi lainnya, ia disebut local
functions. Aturan penulisan fungsi sama dengan Java yaitu 1) hindari menggunakan reserved
word 2) tidak boleh dimulai dengan angka 3) tidak mengandung spesial karakter.
 */
fun main(args: Array<String>) {
    displayMessage("Rekayasa Perangkat Lunak", 10);
}
fun displayMessage(msg: String, count: Int) {
    var counter = 1
    while(counter <= count ) {
        println("$msg $counter")
        counter++
    }
}