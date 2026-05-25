package lessons_4


const val WEIGHT_MIN_AVERAGE = 35
const val WEIGHT_MAX_AVERAGE = 100
const val VOLUME_AVERAGE = 100
fun main() {
    var weight = 20
    var volume = 80
    println("Груз с весом $weight кг и объемом $volume л соответствует категории 'Average':" + " ${WEIGHT_MIN_AVERAGE < weight && weight <= WEIGHT_MAX_AVERAGE && volume < VOLUME_AVERAGE}")

    weight = 50
    volume = 100
    println("Груз с весом $weight кг и объемом $volume л соответствует категории 'Average':" + " ${WEIGHT_MIN_AVERAGE < weight && weight <= WEIGHT_MAX_AVERAGE && volume < VOLUME_AVERAGE}")
}