/*
  * Int 32 bit ( menyimpan nilai yang besar )
  * long 64 bit (menyimpan nilai numerik yang lebih besar)
  * short 16 bit (sebuah bilangan bulat yang hanya dapat menyimpan nilai)
  * byte 8 bit (membaca dan menulis data dari sebuah stream file atau jaringan.)
  * double 64 bit ( sama dengan long namun bisa membaca 15-17 angka di blkng koma )
  * float 32 bit ( sama seperti double namun hanya menyimpan 6-7 diblkng koma )
  * toByte(): Byte | toShort(): Short | toInt(): Int toLong(): Long | toFloat(): Float | toDouble(): Double | toChar(): Char
  *
  *
  * */
//fun main(){
//   val numberOne: Int = 30
//    val numberTwo: Int = 2
//
//    println(numberOne / numberTwo)
//
//    println(15 * 20 + 2)
//    print((2+30) * 4) // jka ingin pertambahn yang di kerjakan dahulu maka di beri kurung pada penggunaan penjumlahan terebut
//}

fun main(){
    val stringNumber = "23"
    val intNumber = 14
    val test = print(intNumber + stringNumber.toInt())

    print(test)
}