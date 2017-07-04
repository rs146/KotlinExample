package example.com.kotlinexample

import org.junit.Assert.*
import org.junit.Test

class F1DriverTest {

    @Test
    fun testF1Driver() {
        val msc = F1Driver(mapOf(
                "name" to "Michael Schumacher",
                "age" to 37,
                "team" to "Ferrari",
                "points" to 77
        ))

        assertEquals("Michael Schumacher", msc.name)
        assertEquals(37, msc.age)
        assertEquals("Ferrari", msc.team)
        assertEquals(77, msc.points)
    }
}