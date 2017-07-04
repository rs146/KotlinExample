package example.com.kotlinexample

abstract class Source<out T> {

    // this can return type T in functions because it's a producer of T
    abstract fun nextT(): T
}

class ConcreteSource : Source<String>() {

    override fun nextT(): String {
        return "Hello"
    }

}

class Example {

    fun example(strs: Source<String>) {
        // this is possible because it's declared as out
        val objects: Source<Any> = strs
        println(objects.nextT())
    }
}


abstract class MyComparable<in T> {

    // this is a consumer of T therefore cannot return T but take in T as parameter to functions defined here
    abstract fun compareTo(other: T) : Int
}

class ConcreteMyComparable(val inputString: String) : MyComparable<String>() {

    override fun compareTo(other: String): Int {
        return inputString.compareTo(other)
    }
}
