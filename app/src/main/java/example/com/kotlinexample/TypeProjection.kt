package example.com.kotlinexample

class TypeProjection<T>(val array: Array<T>) {

    fun get(index: Int) : T {
       return array[index]
    }

    fun set(index: Int, value: T) {
        array[index] = value
    }

    /**
     * Here we have said with "out" tht from is a restricted (projected) array. Same principle applies with in too.
     * Out corresponds to Array<? extends Object>. In would correspond to Array<? super String>.
     */
    fun copy(from: Array<out Any>, to: Array<Any>) {
        assert(from.size == to.size)
        for (i in from.indices) {
            to[i] = from[i]
        }
    }
}

