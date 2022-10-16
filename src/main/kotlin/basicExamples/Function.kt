package basicExamples

fun printMessage(message: String) {
    println(message)
}
fun printMessageWithPrefix(message: String, prefix: String = "Log") {
    println("$prefix: $message")
}
fun square(x: Int): Int {
    return x * x;
}

fun square2(x: Int) = x * x

infix fun Int.x(x: Int) = this * x

fun main(args: Array<String>) {
    printMessage("A function that takes a parameter of type String and return no value")
    printMessageWithPrefix("A function that takes a optional parameter with default value")
    printMessage("A function that returns an integer: " + square(2));
    printMessage("A single-expression function " + square2(5));
    printMessageWithPrefix("Calling a function with named arguments", prefix = "Info" )
    printMessage("Using infix notation " + (3 x 2));
}