package lessons_3

fun main() {
    val serverConf = "D2-D4;0"
    val items = serverConf.split(';', '-')

    val from = items[0]
    val to = items[1]
    val moveNum = items[2].toInt()

    println(from)
    println(to)
    println(moveNum)
}