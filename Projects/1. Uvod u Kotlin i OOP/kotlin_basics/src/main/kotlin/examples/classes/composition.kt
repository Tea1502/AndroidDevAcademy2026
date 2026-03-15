package examples.classes

fun runCompositionExample() {
    val v8Engine = Engine(horsePower = 450)
    val ecoEngine = Engine(horsePower = 120)

    val sportsCar = Car(v8Engine)
    val cityCar = Car(ecoEngine)

    println("Sports car")
    sportsCar.drive()

    println("City car")
    cityCar.drive()
}