/*
Ekspresi lambda selalu dikelilingi oleh tanda blok „{}‟ deklarasi parameter berada dalam blok
yang memiliki opsional type annotation pada bagian tubuh blok ditandai dengan tanda „->‟. Jika
tipe nilai kembalian dari fungsi bukan unit maka nilai kembalian diduga merupakan baris akhir
dari program atau ekspresi dalam tubuh lambda tersebut.
 */
fun main() {
    println(MyFunction("Rekayasa Perangkat Lunak"))
//Lambda Function
    val mylambda :(String)->Unit = {s:String->print(s)}
    val v:String = "Jurusan Teknik Informatika"
    mylambda(v)
//Inline Function
    myFun(v,mylambda) //melewati lambda sebagai parameter fungsi lain
}
fun MyFunction(x: String): String {
    var c:String = "Hey!! Welcome To ---"
    return (c+x)
}
fun myFun(a:String, action:(String)->Unit) { //passing lambda
    print("\nHeyyy!!!")
    action(a)// panggilan ke fungsi lambda
}