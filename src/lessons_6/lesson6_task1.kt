package lessons_6

fun main() {
    println("Создайте логин:")
    val userLogin = readln()
    println("Создайте пароль:")
    val userPassword = readln()

    var inputLogin: String
    var inputPassword: String

    do {
        println("Введите логин:")
        inputLogin = readln()

        println("Введите пароль:")
        inputPassword = readln()
    } while (inputLogin != userLogin || inputPassword != userPassword)

    println("Авторизация прошла успешно")
}