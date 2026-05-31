package lessons_5

fun main() {
    val number1 = (0..10).random()
    val number2 = (0..10).random()
    val correctAns = number1 + number2

    println("Для входа в программу решите пример:\n$number1 + $number2 =")
    val userAns = readln().toInt()

    if (correctAns == userAns) {
        println("Добро пожаловать!")
    } else {
        println("Доступ запрещен.")
    }
}