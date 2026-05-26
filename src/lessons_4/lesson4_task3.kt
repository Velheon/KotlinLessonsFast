package lessons_4

const val FAVORABLE_HUMIDITY = 20
const val WINTER_SEASON = "Зима"

fun main() {
    val isSunny = true
    val isTentOpen = true
    val humidity = 20
    val season = "Зима"

    val favorableConditions = isSunny && isTentOpen
            && humidity == FAVORABLE_HUMIDITY && season != WINTER_SEASON

    println("Благоприятные ли условия сейчас для роста бобовых? $favorableConditions")
}