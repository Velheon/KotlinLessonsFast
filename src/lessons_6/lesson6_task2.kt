package lessons_6

fun main() {
    println("Введите время в секундах:")
    val seconds = readln().toInt()
    var counter = seconds

    while (counter > 0) {
        Thread.sleep(1000)
        counter--
    }

    print("Прошло $seconds секунд")
}