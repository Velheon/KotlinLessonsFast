package lessons_5

fun main() {
    val lotteryNum1 = (0..42).random()
    val lotteryNum2 = (0..42).random()

    println("Введите лотерейный номер 1:")
    val userNum1 = readln().toInt()
    println("Введите лотерейный номер 2:")
    val userNum2 = readln().toInt()

    val hasAnyMatch = (lotteryNum1 == userNum1) || (lotteryNum2 == userNum1) ||
            (lotteryNum2 == userNum2) || (lotteryNum1 == userNum2)
    val isMainPrize = (lotteryNum1 == userNum1 && lotteryNum2 == userNum2) ||
            (lotteryNum1 == userNum2 && lotteryNum2 == userNum1)

    if (isMainPrize) {
        println("Поздравляем! Вы выиграли главный приз!")
    } else if (hasAnyMatch) {
        println("Вы выиграли утешительный приз!")
    } else {
        println("Неудача!")
    }

    println("Победные числа: $lotteryNum1 и $lotteryNum2")
}