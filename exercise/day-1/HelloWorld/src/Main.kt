//fun main() {
////    val grades = 90
////
////    if (grades >= 90) {
////        println("A")
////    } else if (grades >= 80) {
////        println("B")
////    } else if (grades >= 70) {
////        println("C")
////    } else if (grades >= 60) {
////        println("D")
////    } else {
////        println("F")
////    }
////
////// Outputs "Thursday" (day 4)
//
////    var salary = 100000.0F
////    var yearWork = 6
////    var Bonus: Float
////
////    if (yearWork > 5) {
////        Bonus = salary * 0.2F
////    } else if ( yearWork > 2 || yearWork < 5) {
////        Bonus = salary * 0.1F
////    } else {
////        Bonus = 0.0F
////    }
////
////    println(Bonus)
//
////    var totalAmount = 100F
////    var finalPrice: Float
////    var discountPrice: Float
////
////    if (totalAmount >= 200) {
////        discountPrice = totalAmount * 0.3F
////        finalPrice = totalAmount - discountPrice
////    } else if (totalAmount > 100 || totalAmount < 200) {
////        discountPrice = totalAmount * 0.2F
////        finalPrice = totalAmount - discountPrice
////    } else if (totalAmount < 100 || totalAmount > 50) {
////        discountPrice = totalAmount * 0.1F
////        finalPrice = totalAmount - discountPrice
////    } else {
////        finalPrice = totalAmount
////    }
////
////    println(finalPrice)
//
//}

val availableSeats = arrayOf(1, 2, 3, 4, 5)

fun reserveSeat(name: String, seatNumber: Int) {
    val seatIndex = seatNumber - 1

    if (availableSeats[seatIndex] != 0) {
        availableSeats[seatIndex] = 0  // Mark the seat as reserved by setting it to 0
        println("$name reserved seat $seatNumber.")
        println(availableSeats[seatIndex])
    } else {
        println("Seat $seatNumber is already reserved.")
    }
}

fun main() {
    reserveSeat("John", 2)
    reserveSeat("Sarah", 2)
}

//fun reserveSeat(name: String, seatNumber: Int) {
//    val availableSeats = arrayOf(1, 2, 3, 4, 5)
//
//    // Subtract 1 from seatNumber to get the correct index in the array
//    val seatIndex = seatNumber - 1
//
//    if (availableSeats[seatIndex] != 0) {
//        availableSeats[seatIndex] = 0  // Mark the seat as reserved by setting it to 0
//        println("$name reserved seat $seatNumber.")
//    } else {
//        println("Seat $seatNumber is already reserved.")
//    }
//}
