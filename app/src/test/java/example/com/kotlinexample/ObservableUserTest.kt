package example.com.kotlinexample

import org.junit.Assert.*
import org.junit.Test

class ObservableUserTest {

    @Test
    fun testObservableUser() {
        val user = ObservableUser()
        user.name = "first"
        user.name = "second"
    }
}