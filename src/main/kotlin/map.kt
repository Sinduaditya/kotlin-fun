fun main (){
val capital = mapOf(
        "Jakarta" to "Indonesia",
        "London" to "England",
        "New Delhi" to "India"
)

    println(capital["Jakarta"])
    println(capital.getValue("Jakarta"))
    /*
    * ketika tidak menggunakan getValue maka akan mengembalikan nilai null bila tidak ada data berbeda dengan menggunakan getValue
    * konsol akan memberikan sebuah exception
    * */

}
