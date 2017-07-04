package example.com.kotlinexample

import org.junit.Test

class DerivedTest {

    @Test
    fun testDerived() {
        val b = BaseImpl(10)
        Derived(b).print()
    }
}