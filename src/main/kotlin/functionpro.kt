/*
* Function with named argumen and default argumen
* */
fun main() {
    //menggunakan named argument agar tidak melakukan kesalahan saat memanggil parameter dengan fungsi yang cukup kompleks
    // dan kita bisa mengubah posisinya
    val fullNameChange = getFullName(middle = "Is", first = "Study", last = "Awesome")
    val fullName = getFullName(first = "Kotlin", middle = "Is", last = "Awesome")
    val fullNameDefault = getFullNameDefault(last = "Adalah Seorang Programmer")
    println(fullName)
    println(fullNameChange)
    println(fullNameDefault) // tetap dapat terisi dengan menggunakan default value
}

// default argumen  Ketika kita telah menetapkan nilai default,
// kita tak perlu khawatir saat lupa melampirkan sebuah argumen.
// Tentunya ini menghindari kita dari eror. Meskipun begitu, kita tetap bisa melampirkan sebuah argumen.
fun getFullNameDefault(
    first: String = "Sindu",
    middle: String = "Aditya",
    last: String ="Janadi"): String {
    return "$first $middle $last"
}
fun getFullName(first: String, middle: String, last: String): String {
    return "$first $middle $last"
}