package example.com.kotlinexample

import org.junit.Assert
import org.junit.Test

class ChildTest {

    @Test
    fun doFooBoo() {
        val child = Child()
        child.foo()
        child.boo()
        Assert.assertEquals("prop with impl", child.propertyWithImplementation)
        println(child.prop)
    }
}