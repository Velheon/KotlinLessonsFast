package lessons_4

fun main() {
    val weightMinAverage = 35
    val weightMaxAverage = 100
    val volumeAverage = 100

    var weight = 20
    var volume = 80
    println("Груз с весом $weight кг и объемом $volume л соответствует категории 'Average': ${weightMinAverage < weight && weight <= weightMaxAverage && volume < volumeAverage}")

    weight = 50
    volume = 100
    println("Груз с весом $weight кг и объемом $volume л соответствует категории 'Average': ${weightMinAverage < weight && weight <= weightMaxAverage && volume < volumeAverage}")
}