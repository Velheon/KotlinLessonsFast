package lessons_4

fun main() {
    val day = 4
    val isDayForArmsAndAbdominal = day % 2 == 1
    val isDayForLegsAndBack = !isDayForArmsAndAbdominal

    println(
        "Упражнения для рук: $isDayForArmsAndAbdominal\n\n" +
                "Упражнения для ног: $isDayForLegsAndBack\n\n" +
                "Упражнения для спины: $isDayForLegsAndBack\n\n" +
                "Упражнения для пресса: $isDayForArmsAndAbdominal"
    )
}