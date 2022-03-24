fun main() {
    //Pemanggilan yang aman (Safe Calls)
//?.let
    var maybeNumber: Int? = 15
    maybeNumber?.let { println(it) }
//The ?. chaining
//student?.teacher?.supervisor?.name = "Seymour Skinner"
}