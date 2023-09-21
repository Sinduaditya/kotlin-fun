//when expression di
// gunakan ketika memiliki kondisi lebih dari dua
//jika hanya di bawah dua maka mengguanakan if
fun main(){
    val value = 7

    //range
    val number = 1..20

// juga bisa di buat expression
    val prob = when (value) {
        in number -> println("Value in the range")
        !in number -> println("Value is outside the range")
        // jika menggunakan else maka sama semperti
        7 -> println("Ini adalah nomer 7")
        8 -> {
            println("Delapan") //curly braces
            "Nilainya adalah 8"
        }
        9 -> println("Ini adalah nomer 9")
        else -> println("Tidak ada nomer yang di maksud")
    }

    println(prob)

    val anyType: Any = 100L // bisa di gunakan jika lebih dari 2 kondisi
    when (anyType) {
        is Long -> println("the value has a Long type")
        is Int -> println("the value has a Int type")
        is Double -> println("the value has a Double type")
        else -> println("undefined")
    }

}