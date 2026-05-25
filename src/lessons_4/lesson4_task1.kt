package lessons_4

const val TABLE_COUNT = 13
fun main() {
    val reservedTableToday = 13
    val reservedTableTomorrow = 9

    val isFreeToday = reservedTableToday < TABLE_COUNT
    val isFreeTomorrow = reservedTableTomorrow < TABLE_COUNT

    println(
        "[Доступность столиков на сегодня: $isFreeToday], \n" +
        "[Доступность столиков на завтра: $isFreeTomorrow]"
    )
}