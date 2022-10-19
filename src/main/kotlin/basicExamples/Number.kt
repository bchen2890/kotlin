package basicExamples

fun main(args: Array<String>) {
    val oneInt = 1
    val billion = 1000000000 // Long
    val oneLong = 1L
    val oneByte: Byte = 1
    val oneDouble = 1.0
    val oneFloat = 1.0f
    val hexaDecimal = 0x0f
    val binary = 0b00001001
    val sn = 1.2e5
    val withUnderscore = 1_000_000
    println("Types")
    println(oneInt)
    println(billion)
    println(oneLong)
    println(oneByte)
    println(oneDouble)
    println(oneFloat)
    println(hexaDecimal)
    println(binary)
    println(sn)
    println(withUnderscore)

    println("Arithmetical operations")
    println(3 + 2)
    println(1_200_000L - 1L)
    println(3.14 * 0.4)
    println(8 / 3)
    println(8.0 / 3)

    println("Bitwise operations")
    println(1 shl 2)
    println(binary shr 2)
    println(hexaDecimal ushr 1)
    println(binary and hexaDecimal)
    println(binary or hexaDecimal)
    println(binary xor hexaDecimal)
    println(binary.inv())

}