////Function
fun main(){
   //dengan beberapa kondisi
    val name = "Sindu"
    val openHours = 8
    val now = 1
    val office: String
    office = if (now > openHours){
        "Welcome to Office $name"
    } else if (now == openHours) {
        "Wait a minute $name, Office will be open"
    } else {
        "Office is closed"
    }

    print(office)
}

//boolean

//fun main(){
//    val officeClose = 20
//    val nowOp = 22
//    val isOpen = nowOp < officeClose
//
//    //return false
//    if (!isOpen) {
//        print("office is close")
//    } else {
//        print("Office is open") //output
//    }

//    val isOpen = if (nowOp >= officeClose && nowOp <= officeClose){
//        "true"
//    } else {
//        "false"
//    }
//
//    print("office is open ? : $isOpen")
//}

