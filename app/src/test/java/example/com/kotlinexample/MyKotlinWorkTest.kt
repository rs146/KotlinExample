package example.com.kotlinexample

import org.junit.Test

import org.junit.Assert.*

class MyKotlinWorkTest {

    val sut = MyKotlinWork()

    @Test
    fun testToJson() {
        assertEquals("[1, 2, 3, 4, 5]", sut.toJSON(listOf(1, 2, 3, 4, 5)))
    }

    @Test
    fun useOfForLoop() {
        val items= listOf("apple", "banana", "kiwi")
        for (item in items) {
            println(item)
        }
    }

    @Test
    fun forLoopIndexes() {
        val items = listOf("apple", "banana", "kiwi")
        for (skd in items.indices) {
            println("item at $skd is ${items[skd]}")
        }
    }

    @Test
    fun collectionFilters() {
        val fruits = listOf("apple", "banana", "kiwi", "orange", "strawberry", "pineapple", "avocado", "anko", "melon", "pomegranate", "beer")

        fruits.filter { it.startsWith("a") || it.startsWith("b") }
                .sortedBy { it }
                .map { it.toUpperCase() }
                .forEach { println(it) }
    }
}