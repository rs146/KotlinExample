package example.com.kotlinexample

import org.junit.Test

import org.junit.Assert.*

class UserTest {

    @Test
    fun copy() {
        val user = User("Mr T Bone", 21)
        val olderUser = user.copy("Mr T Bone", 22)

        assertEquals(user.name, olderUser.name)
        assertNotEquals(user.age, olderUser.age)

        // use of gen. toString() in data classes
        println(user)
        println(olderUser)
    }

}