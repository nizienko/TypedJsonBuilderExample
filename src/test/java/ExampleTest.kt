import org.junit.jupiter.api.Test

class ExampleTest {
    @Test
    fun test1() {
        firstProperty eq "test"
        secondProperty eq 3
        println(jsonBuilder)
    }
}

val jsonBuilder = mutableMapOf<String, Any>()

class SomeProperty<T>(val name: String)

infix fun<T: Any> SomeProperty<T>.eq(value: T) {
    jsonBuilder[this.name] = value
}

val firstProperty = SomeProperty<String>("Test")
val secondProperty = SomeProperty<Int>("Test2")