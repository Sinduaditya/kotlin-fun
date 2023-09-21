fun main() {
    /*
    * Memetakan objek menjadi beberapa variabel
    *
    * */
    val dataUser = DataUser("Sindu", 19) //object

//    val (name, age) = dataUser atau bisa langsung mengabungkan nya seperti ini
    val name = dataUser.component1() // variabel name
    val age = dataUser.component2()  // variabel age

    println("Hallo nama saya $name dan saya berumur $age")
}
