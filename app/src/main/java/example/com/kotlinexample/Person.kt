package example.com.kotlinexample

class Person {
    var firstName: String = ""
    set(value) {
        field = value
    }
    var surname: String = ""
    set(value) {
        field = value
    }

    fun getFullName(): String {
        return firstName + " " + surname
    }

    fun greetPerson(language: String): String {
        return when (language) {
            "EN" -> "Hello $firstName!"
            "FR" -> "Salut $firstName!"
            "IT" -> "Ciao $firstName!"
            else -> "Can't greet you in $language yet"
        }
    }
}