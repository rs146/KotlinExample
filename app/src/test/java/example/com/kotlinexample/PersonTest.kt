package example.com.kotlinexample

import org.junit.Assert.*
import org.junit.Before
import org.junit.Test

class PersonTest {

    val person = Person()

    @Before
    fun setUp() {
        person.firstName = "Jim"
        person.surname = "Fox"
    }

    @Test
    fun testGetFirstName() {
        assertEquals("Jim", person.firstName)
    }

    @Test
    fun testGetLastName() {
        assertEquals("Fox", person.surname)
    }

    @Test
    fun testGetFullName() {
        assertEquals("Jim Fox", person.getFullName())
    }

    @Test
    fun languageTest() {
        assertEquals("Hello Jim!", person.greetPerson("EN"))
    }

    @Test
    fun italianTest() {
        assertEquals("Ciao Jim!", person.greetPerson("IT"))
    }

    @Test
    fun undefinedTest() {
        assertEquals("Can't greet you in ZA yet", person.greetPerson("ZA"))
    }
}