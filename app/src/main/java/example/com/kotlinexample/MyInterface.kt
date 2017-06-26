package example.com.kotlinexample

interface MyInterface {

    val prop: Int

    val propertyWithImplementation: String
        get() = "prop with impl"

    fun boo()

    fun foo() {
        println("Foo")
    }
}