package example.com.kotlinexample

class Person(var firstName: String = "Ted", val surname: String = "Jsk") {

    var children: MutableList<Person> = ArrayList()

    constructor(firstName: String, surname: String, parent:Person) : this(firstName, surname) {
        parent.children.add(this)
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