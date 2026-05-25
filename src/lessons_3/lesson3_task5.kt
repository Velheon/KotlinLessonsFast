package lessons_3

fun main() {
    val serverConf = "D2-D4;0"
    val items = serverConf.split(';')
    val moveNum = items[1].toInt()

    val move = items[0].split('-')
    val from = move[0]
    val to = move[1]

    println(from)
    println(to)
    println(moveNum)
}