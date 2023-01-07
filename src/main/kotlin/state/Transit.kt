package state

class Transit: TravelMode {
    override fun getEta(): Int {
        println("Calculating ETA (transit)")
        return 3
    }

    override fun getDirection(): Int {
        println("Calculating direction (transit)")
        return 3
    }

}