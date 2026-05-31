package lessons_5

const val AGE_OF_MAJORITY = 18
const val CURRENT_YEAR = 2026

fun main() {
    println("Введите год вашего рождения:")
    val userBirthYear = readln().toInt()
    val userAge = CURRENT_YEAR - userBirthYear

    if (userAge >= AGE_OF_MAJORITY) {
        println("Показать экран со скрытым контентом")
    } else {
        println("Вернуться на главный экран")
    }
}