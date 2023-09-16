fun main() {
    val text: String? = null //diberi tanda tanya agar nilai null tetap di jalankan output :null
//    val text: String = null mengakibatkan compile eror karena tidak boleh null
    println(text)
    /*intArrayOf() : IntArray
booleanArrayOf() : BooleanArray
charArrayOf() : CharArray
longArrayOf() : LongArray
shortArrayOf() : ShortArray
byteArrayOf() : ByteArray*/
    val array = arrayOf(1 , 3, 5, 7) //membuat array dengan menggunakan arrayOf()
    val mixArray = arrayOf(1 , 2, 3, "Sindu", true)
    val intArray = intArrayOf(1 , 2, 3, 4, 5, 6) // jika hanya tipe int saja yang ingin di masukkan
    intArray[2] = 11 //melakukan perubahan data
    println(intArray[2])
    println(mixArray[2])
    println(array[3])
}