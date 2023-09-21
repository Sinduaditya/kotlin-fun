fun main() {
    val openOffice = 8
    val now = 7

    //expression menyimpan hasil nya dalam sebuah variabel
    val print = if (openOffice < now) "Hello mau manu apa" else "maaf kami tutup"

    //statement tidak menyimpan hasil nya
    if (openOffice < now){
        println("Office Alredy Open")
    } else {
        println("office Closed")
    }

    print(print)
}

