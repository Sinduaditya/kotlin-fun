fun main () {
    val rangeInt = 1..10 step 2
    rangeInt.forEach{
        print("$it ")
    }

//    val rangeTo = 1.rangeTo(10)
//    val downTo = 10.downTo(1)
//    println(rangeTo)
//    println(downTo)
    println(rangeInt.step)
}