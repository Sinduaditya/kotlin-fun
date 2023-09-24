fun main (){
    val numberList = listOf(1,2,3,4,5,6,7,8,9,10)
    val sortList = listOf('s', 'i', 'n', 'd', 'u')
    val firstOddNumber = numberList.find { it % 2 == 1 }
    val firstOrNullNumber = numberList.firstOrNull { it % 2 == 3}
    val evenList = numberList.filter{ it % 2 == 0}
    val evenNotlist = numberList.filterNot { it % 2 == 0 }
    val evenMap = numberList.map { it * 5 }
    val evenCount = numberList.count()
    val sorted = sortList.sorted()
    val sum = numberList.sum() // menambahkan semua isinya namun hanya berlaku untuk tipe data angka
    println(evenList)
    println(evenNotlist)
    println(evenMap)
    println(evenCount)
    println(sorted)
    println(firstOddNumber)
    println(firstOrNullNumber) // jika tidak ada akan menghasilkan nilai null
    println(sum)
}
