fun main() {
    val user = "Иван"
    var time = "день"
    var hello = "Добрый $time, $user"
    println(hello)

    time = "вечер"
    hello = "Добрый $time, $user"
    println(hello)
}