// practice problem compare numbers
fun main() {
    println(compare(300, 200))
    println(compare(300, 300))
    println(compare(200, 220))
}

fun compare(x: Int, y: Int): Boolean {
	if (x > y) {
        return true
    } 
    return false
}