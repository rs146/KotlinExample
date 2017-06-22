package example.com.kotlinexample

abstract class Animal {
    open val limbs: Int
    get() = 5

    abstract fun makeNoise()
}