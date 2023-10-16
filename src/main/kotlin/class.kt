class Animal(val name: String,val weight: Double, val age: Int, val isMamal: Boolean){
    val food = "Ikan sarden"
    fun eat(){
        println("$name makan!")
    }
    fun sleep(){
        println("$name tidur!")
    }
    fun behavior(){
        println("$name suka makan makanan seperti $food!")
    }
}

fun main(){
    val dicodingCat = Animal("Miaw Sindu",5.2,12,true)
    println("Nama : ${dicodingCat.name}, Berat ${dicodingCat.weight}, Umur: ${dicodingCat.age}, Mamalia: ${dicodingCat.isMamal}")
    dicodingCat.eat()
    dicodingCat.sleep()
    dicodingCat.behavior()
}