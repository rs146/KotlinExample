package example.com.kotlinexample

import org.junit.Test
import org.junit.Assert.*

class InOutCovariantTest {

    @Test
    fun testOut() {
        val example = Example()
        val concreteSource = ConcreteSource()
        example.example(concreteSource)
    }

    @Test
    fun testIn() {
        val comparable = ConcreteMyComparable("Ted")
        assertEquals(0, comparable.compareTo("Ted"))
    }
}