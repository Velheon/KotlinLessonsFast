package lessons_6

fun main() {
    var attemptCount = 3

    while (attemptCount > 0) {
        val number1 = (1..9).random()
        val number2 = (1..9).random()
        val correctAns = number1 + number2

        println("Для входа в программу решите пример:\n$number1 + $number2 =")
        val userAns = readln().toInt()

        if (correctAns == userAns) {
            println("Добро пожаловать!")
            break
        } else {
            attemptCount--
            println("Капча решена неверно. Оставшееся количество попыток: $attemptCount")
        }
    }

    if (attemptCount == 0) {
        println("Доступ запрещен")
    }
}