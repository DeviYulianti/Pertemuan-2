fun main() {
    returnLoop()
}
/*
Keyword return berguna untuk keluar dari fungsi dan
mengembalikan suatu nilai kepada pemanggil fungsi.
 */
fun returnLoop(){
    var x:Int
    println("Example of return in For-Loop")
    for(x in 1..10) {
        if(x < 5) {
            print("${x - 1} ")
        }else {
            return
        }
        print("$x ")
    }
    print("Tidak akan pernah dieksekusi")
}