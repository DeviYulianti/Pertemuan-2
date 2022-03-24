/*
Parameter fungsi bisa memiliki nilai default yang membolehkan pemanggil fungsi untuk
menghilangkan beberapa argumen ketika dipanggil.
 */
fun main() {
    //panggil tanpa argumen
    connectToDb()
    println()
//panggil dengan 2 argumen
    connectToDb("sqlserver", "nelia")
}
fun connectToDb(hostname: String = "localhost",
                username: String = "mysql",
                password:String = "secret") {
    println("hostname : $hostname")
    println("username : $username")
    println("password : $password")
}