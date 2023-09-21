fun main(){
//    val number = listOf(1,"test", true)  tidak bisa di ganti namun kotlin menyiapkan yang namanya mutabeloflist
    val anyList = mutableListOf(1,"test",true)
    anyList.add('d') // menambah item di akhir list
    anyList.add(1, "love") // menambah item pada indeks ke-1
    anyList[3] = false // mengubah nilai item pada indeks ke-3
    anyList.removeAt(0) // menghapus item pada indeks ke-0
//    println(number)
    println(anyList)
}


