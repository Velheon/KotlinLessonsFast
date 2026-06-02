package lessons_6

fun main() {
    println("Введите время в секундах:")
    val seconds = readln().toInt()
    var counterSeconds = seconds

    while (counterSeconds > 0) {
        println("Осталось секунд: ${counterSeconds--}")
        Thread.sleep(1000)
    }

    println("Время вышло")
}