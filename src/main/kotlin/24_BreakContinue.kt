fun main() {
    /*
    break : untuk menghentikan proses perulangan ke penutup terdekat dalam suatu blok program.
continue : proses untuk melanjutkan perulangan ke penutup terdekat dalam suatu blok program.
Apapun ekspresi di Kotlin dapat ditandai dengan label. Label memiliki bentuk sebuah identifier
yang diikuti oleh tanda @ sebagai contoh : abc@, foo@, loop@.
     */

    //Continue & Break Label
    println("Example of Break and Continue Label")
    myLabel@ for(x in 1..10) { // menerapkan label khusus
        if(x == 5) {
            println("I am inside if block with value"+x+"\n-- hence it will close the operation")
            break@myLabel // menentukan label
        } else {
            println("I am inside else block with value"+x)
            continue@myLabel
        }
        println("Not Print")
    }
}