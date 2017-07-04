package example.com.kotlinexample

interface Base {
    fun print()
}

class BaseImpl(val x: Int) : Base {

    override fun print() {
        print(x * x)
    }
}

class Derived(b: Base) : Base by b
