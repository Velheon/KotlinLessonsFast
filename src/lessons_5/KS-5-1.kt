package lessons_5

fun main() {
    val a = 5
    val b = 9
    val correctAns = a + b

    println("Для входа в программу решите пример:\n" + "$a + $b =")
    val userAns = readln().toInt()

    if (correctAns == userAns) {
        println("Добро пожаловать!")
    } else {
        println("Доступ запрещен.")
    }
}