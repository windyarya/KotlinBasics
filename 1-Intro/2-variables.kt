fun main() {
    // Integer Data Type
    // declare variable
    val count: Int = 2  //val is like constant in other programming language
    val count1 = 4       //we can also declare variable like this, Kotlin automatically interpret this as an Int.

    println("You have $count unread messages.")
    println(count)

    println("You have $count1 unread messages.")
    println(count1)

    println("You have ${count + count1} total messages in your inbox.")

    // because val is like constant, we cant change the initial value of val. To do that we need to use var instead of val.
    var count2 = 5
    println("This is the first var: $count2")
    count2 = 10
    println("This is the value of count2 after we assign new value: $count2")

    // Double Data Type
    val trip1 = 3.20    // we can also use val trip1: Double = 3.20
    val trip2 = 4.10
    val trip3 = 1.72
    val totalTripLength = trip1 + trip2 + trip3
    println("$totalTripLength miles left to destination")

    // String Data Type
    val nextMeeting = "Next meeting is: "
    val date = "January 1"
    val reminder = nextMeeting + date + " at work"
    println(reminder)

    // Boolean Data Type
    val notificationsEnabled: Boolean = false
    println("Are notifications enabled? " + notificationsEnabled)
}