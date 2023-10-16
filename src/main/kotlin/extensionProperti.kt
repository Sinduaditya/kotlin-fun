
fun main(){
    val dicodingCow = AnimalName("Sapi", 1.8, 2, true)

    println(dicodingCow.getAnimalInfo)
}
class AnimalName(var name:String, var weight:Double, var age: Int, var isMamal:Boolean)

val AnimalName.getAnimalInfo : String
    get() = "Nama : ${this.name}, Berat : ${this.weight}, Umur : ${this.age}, Mamalia : ${this.isMamal}"