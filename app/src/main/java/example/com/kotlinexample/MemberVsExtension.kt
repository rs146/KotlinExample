package example.com.kotlinexample

class MemberVsExtension {

    fun foo() {
        println("member")
    }

    fun MemberVsExtension.foo() {
        println("extension")
    }
}