package lessons_3

fun main() {
    val num = 6
    val table = """
        $num * 1 = ${(num * 1).toString().padStart(2, '0')}
        $num * 2 = ${(num * 2).toString().padStart(2, '0')}
        $num * 3 = ${(num * 3).toString().padStart(2, '0')}
        $num * 4 = ${(num * 4).toString().padStart(2, '0')}
        $num * 5 = ${(num * 5).toString().padStart(2, '0')}
        $num * 6 = ${(num * 6).toString().padStart(2, '0')}
        $num * 7 = ${(num * 7).toString().padStart(2, '0')}
        $num * 8 = ${(num * 8).toString().padStart(2, '0')}
        $num * 9 = ${(num * 9).toString().padStart(2, '0')}
    """.trimIndent()

    println(table)
}