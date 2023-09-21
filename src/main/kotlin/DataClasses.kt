/*
* Data classs
* */

class User(val name: String, val age: Int ) {
    override fun toString(): String {
        return "User(name: $name, age: $age)"  // menambahkan secara manual
    }
} // class biasa tidak menggunakan toString jadi harus membuat tostring nya secara manual
data class DataUser(val name: String, val age: Int) //data class secara otomatis menghasilkan toString() saat menjalankannya

fun main (){
    val user = User("Sindu", 18)
    val dataUSer = DataUser("Aditya", 17)


    //kelebihan lain dari data class adalah bisa menggunakan equalsto
    val dataUser = DataUser("nrohmen", 17)
    val dataUser2 = DataUser("nrohmen", 17)
    val dataUser3 = DataUser("dimas", 24)

    println(dataUser.equals(dataUser2))
    println(dataUser.equals(dataUser3))


    println(user)
    println(dataUSer)
}