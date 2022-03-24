fun main() {
    /*
    Kotlin mendukung tradisional break dan continue, sama seperti bahasa pemrograman Java.
Kegunaan dari break dan continue adalah :
break : untuk menghentikan proses perulangan ke penutup terdekat dalam suatu blok program.
continue : proses untuk melanjutkan perulangan ke penutup terdekat dalam suatu blok program.
     */

    var x:Int
    println("Example of Break and Continue in For-Loop")
    for(x in 1..10) {
        if(x == 8) break // maka di 8 akan di berhentikan
        if(x == 3) continue // nilai yang tidak di masukkan.
        print("$x ")
    }
    print('\n')
}