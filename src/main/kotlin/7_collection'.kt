fun main() {
    /*
    array multidimensi adalah array yang memiliki
    banyak dimensi.
     */

//    deklarasi floor/lantai
    var cinemas = arrayOf<Array<Array<Int>>>()
    for (i in 0..2) {
        var cinema = arrayOf<Array<Int>>()
        for (j in 0..4) {
            var array = arrayOf<Int>()
            for (k in 0..4) {
                array += 0
            }
            cinema += array
        }
        cinemas += cinema
    }
    cinemas[1][2][3] = 1 // lantai/floor 1, baris 2, kolom 3, dimulai dari nilai index yaitu nol(0)
    var floor = 1
    for (cinema in cinemas) {
        println("Floor: $floor")
        floor += 1
        for (array in cinema) {
            for (value in array) {
                print("$value ")
            }
            println()
        }
        println("-----------------")
    }
}