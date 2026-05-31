package lessons_5

const val AGE_OF_MAJORITY = 18

fun main() {
    val currentYear = 2026

    println("Введите год вашего рождения:")
    val userBirthYear = readln().toInt()
    val userAge = currentYear - userBirthYear

    if (userAge >= AGE_OF_MAJORITY) {
        println("Показать экран со скрытым контентом")
    } else {
        println("Вернуться на главный экран")
    }
}