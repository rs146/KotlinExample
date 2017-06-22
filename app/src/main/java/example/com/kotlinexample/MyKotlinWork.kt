package example.com.kotlinexample

/**
 * Test my Kotlin work.
 */
class MyKotlinWork {
    fun toJSON(collection:Collection<Int>):String {
        val sb = StringBuilder()
        sb.append("[")
        val iterator = collection.iterator()
        while (iterator.hasNext()) {
            val element = iterator.next()
            sb.append(element)
            if (iterator.hasNext()) {
                sb.append(", ")
            }
        }
        sb.append("]")
        return sb.toString()
    }

    companion object {
        fun provideList() : List<String> = listOf("Ted", "Max", "Rex", "Donald", "Ronald", "Duo")
    }
}