package example.com.kotlinexample

class F1Driver(val map: Map<String, Any?>) {
    val name: String by map
    val age: Int by map
    val team: String by map
    val points: Int by map
}