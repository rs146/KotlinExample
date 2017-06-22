package example.com.kotlinexample

import junit.framework.Assert.assertEquals
import org.junit.Test

class AnimalTest {

    @Test
    fun dogLimbsTest() {
        val dog = Dog()
        assertEquals(4, dog.limbs)
        dog.makeNoise()
    }

    @Test
    fun catMakeNoise() {
        val cat = Cat()
        cat.makeNoise()
    }
}