fun main(args: Array<String>){
    /*
    Salah satu kesalahan yang banyak ditemukan pada bahasa pemrograman adalah pengaksesan
terhadap anggota referensi null dan akan menghasilkan pesan kesalahan null reference exception,
di Java sering disebut dengan Null Pointer Exception (NPE). Kotlin type system bertujuan untuk
menghilangkan NPE dari kode program. Kotlin tidak mengizinkan pemberian nilai null secara tidak sah.
Untuk dapat memberikan nilai null pada suatu variabel dapat dilakukan dengan cara menambahkan tanda ?
diakhir tipe data.
     */
//Nullable types
    var maybeNumber: Int? = 15
    maybeNumber = null
    println("maybeNumber: $maybeNumber ${maybeNumber?.hashCode()}")
}