package lessons_4

const val MIN_CREW = 55
const val MAX_CREW = 70
const val ENOUGH_BOXES = 50
fun main() {
    val isUnbroken = readln().toBoolean()
    val crew = readln().toInt()
    val boxes = readln().toInt()
    val isGoodWeather = readln().toBoolean()
    // В сценарии, где корабль целый, погодные условия не важны
    val canDepart = (isUnbroken && MIN_CREW <= crew && crew <= MAX_CREW && boxes > ENOUGH_BOXES) ||
            (!isUnbroken && crew == MAX_CREW && isGoodWeather && boxes >= ENOUGH_BOXES)

    println("Корабль может отправиться: $canDepart")
}