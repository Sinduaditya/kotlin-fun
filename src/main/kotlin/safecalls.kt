fun main(){
//Safe Calls dan Elvis Operator
    val text: String? = null
    text?.length
//Elvis Operator (?:) Elvis operator memungkinkan kita untuk menetapkan default value atau nilai dasar jika objek bernilai null.
    val textLength = if (text != null) text.length else 7

/*
* String template bisa menambahkan objek dan sebuah expression dengan if hanya dengan menggunakan simbol $
*
* */
    val hour = 1
    println("office is open at $hour AM")
    print("Office ${if (hour < 7) "already close" else "is open"}")
}