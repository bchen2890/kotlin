package basicExamples

fun main(args: Array<String>) {
    val str = "hello world 123!"
    for (c in str)
        println(c)
    println("Uppercase: " + str.uppercase())
    println("Escape sequences: ")
    println("\t"+str)
    println(str+"\n")
    println("\'"+str)
    println("\""+str)
    println("\\"+str)
    println("\$"+str)
    val text = """
        for (c in "foo")
            print(c)
    """
    println(text)
    println("""
    |Tell me and I forget.
    |Teach me and I remember.
    |Involve me and I learn.
    |(Benjamin Franklin)
    """.trimMargin())

    println("String templates")
    println("str = $str")
    println("str.length = ${str.length}")



}