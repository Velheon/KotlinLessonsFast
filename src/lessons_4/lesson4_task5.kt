package lessons_4

const val MIN_CREW = 55
const val MAX_CREW = 70
const val ENOUGH_BOXES = 50
fun main() {
    val isUnbroken = false
    val crew = 50
    val box = 50
    val isGoodWeather = true
    val canDepart = (isUnbroken && MIN_CREW <= crew && crew <= MAX_CREW && box > ENOUGH_BOXES) ||
            (!isUnbroken && crew == MAX_CREW && isGoodWeather && box >= ENOUGH_BOXES)

    println("Корабль может отправиться: $canDepart")
}