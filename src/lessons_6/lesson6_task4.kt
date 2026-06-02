package lessons_6

fun main() {
    val guessNumber = (1..9).random()
    var attemptCount = 5

    while (attemptCount > 0) {
        println("Угадайте число от 1 до 9:")
        val userInput = readln().toInt()
        if (guessNumber == userInput) {
            println("Это была великолепная игра!")
            break
        } else {
            attemptCount--
            println("Неверно. Оставшееся количество попыток: $attemptCount")
        }
    }

    if (attemptCount == 0) {
        println("Было загадано число $guessNumber")
    }
}