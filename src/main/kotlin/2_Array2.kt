fun main() {
    val  asc = Array(5){
        i ->(i *i).toString()
    }
    asc.forEach { println(it) }
}