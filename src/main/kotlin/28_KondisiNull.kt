fun main() {
    //Pemeriksaan Kondisi Null
    var maybeNumber: Int? = 15
    if (maybeNumber != null)
        println(maybeNumber * 2)
    else
        println("The entered value isn't a number")
}