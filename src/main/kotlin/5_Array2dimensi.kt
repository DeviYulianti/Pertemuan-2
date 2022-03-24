fun main() {
    /*
    array 2 dimensi yaitu array yang memiliki 2 dimensi. yaitu di
    dalam array ada array lagi.Variabel array dideklarasikan dengan
    mencantumkan tipe dan nama variable yang diikuti dengan banyaknya
    lokasi memori yang ingin dibuat. Array dua dimensi merupakan array
    yang terdiri dari m buah baris dan n buah kolom.
     */

    //inisialisasi a 2D array
    var cinema = arrayOf<Array<Int>>()
    for (i in 0..4) {
        var array = arrayOf<Int>()
        for (j in 0..4) {
            array += 0
        }
        cinema += array
    }

    for (array in cinema) {
        for (value in array) {
            print("$value ")
        }
        println()
    }
// Mengisi data
    cinema[2][2] = 1
    for (i in 1..3) {
        cinema[3][i] = 1
    }
    for (i in 0..4) {
        cinema[4][i] = 1
    }
    println()
    for (array in cinema) {
        for (value in array) {
            print("$value ")
        }
        println()
    }
}