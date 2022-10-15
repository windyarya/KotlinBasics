fun main() {
    birthdayGreeting()
    birthdayGreeting1()
    val greeting = birthdayGreeting2()
    println(greeting)
    println(birthdayGreeting2())
    println(birthdayGreeting3("Young"))
    println(birthdayGreeting4("Young", 4))
    println(birthdayGreeting4(name = "Rex", age = 2))
    println(birthdayGreeting4(age = 2, name = "Rex"))
    println(birthdayGreeting5(age = 2))
}

fun birthdayGreeting() {
    println("Happy Birthday, Rover!")
    println("You are now 5 years old!")
}

fun birthdayGreeting1(): Unit {
    println("Happy Birthday, Rover!")
    println("You are now 5 years old!")
}

fun birthdayGreeting2(): String {
    val nameGreeting = "Happy Birthday, Rover!"
    val ageGreeting = "You are now 5 years old!"
    return "$nameGreeting\n$ageGreeting"
}

fun birthdayGreeting3(name: String): String {
    val nameGreeting = "Happy Birthday, $name!"
    val ageGreeting = "You are now 5 years old!"
    return "$nameGreeting\n$ageGreeting"
}

fun birthdayGreeting4(name: String, age: Int): String {
    val nameGreeting = "Happy Birthday, $name!"
    val ageGreeting = "You are now $age years old!"
    return "$nameGreeting\n$ageGreeting"
}

fun birthdayGreeting5(name: String = "Rover", age: Int): String {
    return "Happy Birthday, $name!\nYou are now $age years old!"
}