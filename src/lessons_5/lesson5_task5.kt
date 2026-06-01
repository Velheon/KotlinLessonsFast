package lessons_5

fun main() {
    val lotteryNumbers = listOf(
        (0..42).random(),
        (0..42).random(),
        (0..42).random()
    )

    println("Введите 3 лотерейных числа:")
    val userNumbers = listOf(
        readln().toInt(),
        readln().toInt(),
        readln().toInt()
    )

    val matchCount = lotteryNumbers.intersect(userNumbers).size
    when (matchCount) {
        3 -> println("Угаданы 3 числа. Джекпот!")
        2 -> println("Угаданы 2 числа. Крупный приз!")
        1 -> println("Угадано 1 число. Утешительный приз!")
        else -> println("Вы не угадали ни одного числа")
    }

    println("Выигрышные числа: ${lotteryNumbers.joinToString()}")
}