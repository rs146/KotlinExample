package example.com.kotlinexample

class Dog : Animal() {
    override val limbs: Int
        get() = 4

    override fun makeNoise() {
        println("Bark")
    }
}