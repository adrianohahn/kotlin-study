package intro

fun printMessage(message: String) {
    println("this is my $message")
}

fun printMessageWithPrefix(message: String, prefix: String = "Info") {
    println("[$prefix] $message")
}

fun sum(x: Int, y: Int): Int {
    return x + y
}

fun multiply(x: Int, y: Int) = x * y


fun main() {
    println("Functions") // Functions
    printMessage("Hello") // This is my Hello
    printMessageWithPrefix("Watch out", "Warning") // [Warning] Watch Out
    printMessageWithPrefix("All right") // [Info] All right
    printMessageWithPrefix(prefix = "Log", message = "This is a log")

    println(sum(1,2))
    println(sum(6, 5))

    println(multiply(3, 6))

    printMessage("Goodbye") // This is my Goodbye
}