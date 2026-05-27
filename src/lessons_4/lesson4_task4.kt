package lessons_4

fun main() {
    val day = 5

    val isEven = day % 2 == 0
    val isDayForArmsAndAbdominal = !isEven
    val isDayForLegsAndBack = isEven

    println(
        "Упражнения для рук: $isDayForArmsAndAbdominal\n\n" +
                "Упражнения для ног: $isDayForLegsAndBack\n\n" +
                "Упражнения для спины: $isDayForLegsAndBack\n\n" +
                "Упражнения для пресса: $isDayForArmsAndAbdominal"
    )
}