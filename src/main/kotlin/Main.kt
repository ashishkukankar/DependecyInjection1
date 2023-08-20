fun main(array: Array<String>) {
    val engine = ElectricEngine()
    val wheel = MRFWheel()
    val car = Car(engine,wheel)
    car.start()
}