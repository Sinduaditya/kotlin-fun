fun main(){
    10.printInt()
    print("\n")
    println(10.plusThree())
    //memanggil extension properties
    println(10.slice)
}
// extension function
fun Int.printInt(){
    print("value $this")
}
//extension function yang mengembalikan nilai
fun Int.plusThree():Int{
    return this + 3
}

//extension properties
val Int.slice: Int
    get() = this / 2

