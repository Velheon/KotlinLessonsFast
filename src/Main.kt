fun main() {
    val userName = "Иван"
    val letter = """
    |Привет, $userName!
    Ваш заказ принят.
    |Спасибо за покупку.
""".trimMargin()

    println(letter)
}