import javax.xml.crypto.Data

fun main (){
// nama variabel   Nama class dengan parameter  
    val dataUser = DataUser("Sindu",18)
    val dataUser2 = DataUser("Aditya", 20)
    val dataUser3 = DataUser("Janadi", 19)
    val dataUser4 = dataUser.copy() //copy class
    val dataUser5 = dataUser2.copy(age = 18) // change


    println(dataUser4)
    println(dataUser5)
}