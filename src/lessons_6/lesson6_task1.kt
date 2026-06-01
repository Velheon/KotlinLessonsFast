package lessons_6

fun main() {
    println("Создайте логин:")
    val userLogin = readln()
    println("Создайте пароль:")
    val userPassword = readln()

    while (true) {
        println("Введите логин:")
        val inputLogin = readln()
        if (inputLogin != userLogin) {
            println("Логин введен неверно. Попробуйте снова")
            continue
        }

        println("Введите пароль:")
        val inputPassword = readln()
        if (inputPassword != userPassword) {
            println("Пароль введен неверно. Попробуйте снова")
            continue
        }

        println("Авторизация прошла успешно")
        break
    }
}