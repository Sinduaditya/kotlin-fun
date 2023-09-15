fun main (){
    val user = setUser("Sindu", 19)
    println(user)

    printUser("Sindu aditya ")
}


//memanggil set user
fun setUser(name: String, age: Int) = "Your name is $name, and your age is $age years old"

fun printUser(name: String){
    println("Your name is $name")
}
