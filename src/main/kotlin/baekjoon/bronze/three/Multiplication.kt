package baekjoon.bronze.three

// https://www.acmicpc.net/problem/2588
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