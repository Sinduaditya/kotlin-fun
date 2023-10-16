import kotlin.reflect.KProperty

class DelegationName(){
    private var value: String = "Default"

    operator fun getValue(classRef: Any?, property: KProperty<*>) : String {
        println("Fungsi ini sama seperti getter untuk properti ${property.name} pada $classRef")
        return value
    }

    operator fun setValue(classRef: Any?,property: KProperty<*>,newValue: String){
        println("Fungsi ini sama seperti setter untuk properti ${property.name} pada class $classRef")
        println("Nilai ${property.name} dari : $value akan berubah menjadi $newValue")
        value = newValue
    }
}

class Hewan {
    var name: String by DelegationName()
}

fun main(){
    val animal = Hewan()
    animal.name = "Kucing"
    println("Nama Hewan : ${animal.name}")
}
