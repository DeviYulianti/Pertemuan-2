fun main() {
    //membuat tabel perkalian menggunakan forloop
    println("Tabel perkalian sederhana menggunakan loop:")
    for (i in 1..10) {
        print("$i ")
    }
    println()
    for (i in 1..10) {  //nilai i mempunyai range 1-10 dikalikan 2
        print("${i * 2} ")
    }
    println()
    for (i in 1..10) {  //nilai i mempunyai range 1-10 dikalikan 3
        print("${i * 3} ")
    }
    println()
    for (i in 1..10) { // nilai i mempunyai range 1-10 dikalikan 4
        print("${i * 4} ")
    }
    println()
    for (i in 1..10) {  //nilai i mempunyai range 1-10 dikalikan 5
        print("${i * 5} ")
    }
    println()
    for (i in 1..10) {  //nilai i mempunyai range 1-10 dikalikan 6
        print("${i * 6} ")
    }
    println()
    for (i in 1..10) {  //nilai i mempunyai range 1-10 dikalikan 7
        print("${i * 7} ")
    }
    println()
    for (i in 1..10) {  //nilai i mempunyai range 1-10 dikalikan 8
        print("${i * 8} ")
    }
    println()
    for (i in 1..10) {  //nilai i mempunyai range 1-10 dikalikan 9
        print("${i * 9} ")
    }
    println()
    for (i in 1..10) {  //nilai i mempunyai range 1-10 dikalikan 10
        print("${i * 10} ")
    }
    println("\n\nBerikut adalah tabel perkalian sederhana menggunakan loop bersarang:")
    for (i in 1..10) {
        for (j in 1..10) {
            print("${i * j} ")
        }
        println()
    }
}