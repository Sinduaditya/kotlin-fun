class Car{
    var name: String = "Porsche" // property accessor
}

fun main(){
    val carName = Car()
    println("Mobil ${carName.name}") //getter
    carName.name = "Lamborgini" // setter
    println("Mobil ${carName.name}")
}
