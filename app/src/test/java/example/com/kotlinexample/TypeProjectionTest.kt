package example.com.kotlinexample

import org.junit.Test

import org.junit.Assert.*

class TypeProjectionTest {

    @Test
    fun copy() {
        val int: Array<Int> = arrayOf(1, 2, 3)
        val any = Array<Any>(3) { "" }
        val typeProj = TypeProjection<Int>(int)
        typeProj.copy(int, any)
        for (i in any.indices) {
            println(any[i])
        }
        assertEquals(3, any.size)
    }

}