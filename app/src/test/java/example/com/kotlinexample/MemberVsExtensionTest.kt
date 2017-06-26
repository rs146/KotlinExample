package example.com.kotlinexample

import org.junit.Test

class MemberVsExtensionTest {

    @Test
    fun testOfMemberVsExtensionFunc() {
        val memberVsExtension = MemberVsExtension()
        memberVsExtension.foo()
    }
}