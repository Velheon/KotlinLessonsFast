package lessons_4

fun main() {
    val isSunny = true
    val isTentOpen = true
    val humidity = 20
    val season = "Зима"

    val favorableConditions = isSunny && isTentOpen && humidity == 20 && season != "Зима"

    println("Благоприятные ли условия сейчас для роста бобовых? $favorableConditions")
}