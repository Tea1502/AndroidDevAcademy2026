package examples.classes

class Car(private val engine: Engine) {

    fun drive() {
        engine.start()
        println("The car is moving!")
    }
}