class Car(private val engine: Engine,private val wheel: Wheel) {

    fun start(){
        engine.start()
        wheel.start()
    }
}