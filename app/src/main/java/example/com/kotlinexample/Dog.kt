package example.com.kotlinexample

class Dog : Animal() {
    override val limbs: Int
        get() = 4

    override fun makeNoise() {
        val strBuilder = StringBuilder()
        val ingified = strBuilder.ingify("Bark")
        println(ingified)
    }

    fun StringBuilder.ingify(input: String) : String {
        return input + "ing"
    }
}