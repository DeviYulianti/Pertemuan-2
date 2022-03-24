fun main(){
    /*
    Map (atau kamus) : adalah sebuah set pasangan kunci dan nilai
    (key-value). Kuncibersifat unik dan hanya memiliki satu nilai.
    Sedangkan nilai yang ada pada Map dapatbernilai ganda/sama.
     */

// Peta<K, V> bukan pewaris dari antarmuka Koleksi;
/*
Peta menyimpan pasangan nilai kunci (atau entri);
kunci unik, tetapi kunci yang berbeda dapat dipasangkan dengan nilai yang sama.
*/
    val numbersMap = mapOf("key1" to 1, "key2" to 2, "key3" to 3, "key4" to 1)
    println("All keys: ${numbersMap.keys}") //mencetak semua kunci
    println("All values: ${numbersMap.values}") // mencetak semua nilai
    if ("key2" in numbersMap) println("Value by key \"key2\": ${numbersMap["key2"]}")
    if (1 in numbersMap.values) println("The value 1 is in the map")
    if (numbersMap.containsValue(1)) println("The value 1 is in the map") // same as previous

//dua peta yang berisi pasangan yang sama adalah sama terlepas dari urutan pasangan
    val anotherMap = mapOf("key2" to 2, "key1" to 1, "key4" to 1, "key3" to 3)
    println("The maps are equal: ${numbersMap == anotherMap}")

    //MutableMap adalah Peta dengan operasi penulisan peta, misalnya,
    //Anda dapat menambahkan pasangan nilai kunci baru atau memperbarui nilai yang terkait dengan kunci yang diberikan
    val mutableMap = mutableMapOf("one" to 1, "two" to 2)
    mutableMap.put("three", 3)
    mutableMap["one"] = 11
    println(mutableMap)
    val readWriteMap = hashMapOf("foo" to 1, "bar" to 2)
    println(readWriteMap["foo"]) // prints "1"
}