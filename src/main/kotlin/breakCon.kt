fun main(){
    val listOfInt = listOf(1,2,3,null,5,null,7)
    for(i in listOfInt){
        if (i == null) continue //maka akan melewatkan nilai yang akan bernilai null
        print(i)
    }
}