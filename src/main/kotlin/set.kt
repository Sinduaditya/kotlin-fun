/*
* objek turunan kedua setelah list adalah set sebuah collection yang mampu menampung
* nilai yang unik, berguna ketika anda menginginkan data yang tidak ama atau terduplikasi
*
* */

fun main(){
    val integerSet = setOf(1,2,3,4,5)
    val mutableSet = mutableSetOf(1, 2, 4, 2, 1, 5)
//mutableSet[2] = 6 // tidak bisa mengubah set immutable
    mutableSet.add(6) // menambah item di akhir set
    mutableSet.remove(1) //menghapus item yang memiliki nilai 1

    println(mutableSet)
    println(integerSet)
}