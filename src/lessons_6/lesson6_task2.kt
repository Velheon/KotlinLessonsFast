package lessons_6

fun main() {
    println("Введите время в секундах:")
    val seconds = readln().toLong()
    Thread.sleep(1000 * seconds)

    print("Прошло $seconds секунд")
}