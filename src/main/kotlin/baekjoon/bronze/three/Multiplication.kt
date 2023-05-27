package baekjoon.bronze.three

fun main() {
    val first = readln().toInt()
    val second = readln()

    val result = arrayListOf<Int>()

    second.forEachIndexed { index, c ->
        result.add(c.digitToInt() * first)
    }
    result.reverse()

    result.forEach {
        println(it)
    }

    println(first * second.toInt())
}