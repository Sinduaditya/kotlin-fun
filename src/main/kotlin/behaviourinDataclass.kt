

fun main(){
    data class DataUser(val name: String,val age: Int){
        fun intro(){
            println("Hallo perkenalkan nama saya $name dan saya berumur $age tahun")
        }
    }

    
    val dataUser = DataUser("Janadi", 23)
    dataUser.intro()
}