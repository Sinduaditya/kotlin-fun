fun main(){
    //vaarag variabel argument
    val number = sumNumbers(10,20,30,40,50)
    print(number)
}

fun sumNumbers(vararg number: Int) : Int {
    return number.sum()
}