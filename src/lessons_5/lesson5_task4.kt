package lessons_5

const val REGISTERED_LOGIN = "Zaphod"
const val REGISTERED_PASSWORD = "PanGalactic"

fun main() {
    println("Введите имя пользователя:")
    val inputLogin = readln()

    when (inputLogin) {
        REGISTERED_LOGIN -> {
            println("Пользователь зарегистрирован. Введите пароль:")
            val inputPassword = readln()
            if (inputPassword == REGISTERED_PASSWORD) {
                println("Добро пожаловать на борт")
            } else {
                println("Неправильный пароль")
            }
        }
        else -> println("Такого пользователя нет. Желаете зарегистрироваться?")
    }
}