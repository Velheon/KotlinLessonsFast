package lessons_5

fun main() {
    val userLogin = "Zaphod"
    val userPassword = "PanGalactic"

    println("Введите имя пользователя и пароль")
    val inputLogin = readln()
    val inputPassword = readln()

    when (inputLogin) {
        userLogin -> {
            if (inputPassword == userPassword) {
                println("Добро пожаловать на борт")
            } else {
                println("Неправильный пароль")
            }
        }
        else -> println("Такого пользователя нет. Желаете зарегистрироваться?")
    }
}