/*
List adalah sebuah koleksi terurut yang dapat menyimpan
elemen yang sama lebih dari satu kali.
 */
fun main(args:Array<String>){
    val numbers = listOf("one", "two", "three", "four")
    println("Number of elements: ${numbers.size}") //mencetak julah elemen
    println("Third element: ${numbers.get(2)}")// mencetak elemen ke tiga
    println("Fourth element: ${numbers[3]}")//mencetak elemen keempat
    println("Index of element \"two\" ${numbers.indexOf("two")}")//mencetak index dari elemen 2, index di mulai dari nol

//  Elemen daftar (termasuk nol) dapat diduplikasi
    val bob = Person("Bob", 31)
    val people = listOf<Person>(Person("Adam", 20), bob, bob)
    val people2 = listOf<Person>(Person("Adam", 20), Person("Bob", 31), bob)
    println(people == people2)
    bob.age = 32
    println(people == people2)
}

