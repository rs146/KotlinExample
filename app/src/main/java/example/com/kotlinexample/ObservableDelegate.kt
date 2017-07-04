package example.com.kotlinexample

import kotlin.properties.Delegates

class ObservableUser {
    var name: String by Delegates.observable("no name") {
        property, oldValue, newValue ->
        println("$oldValue -> $newValue")
    }
}