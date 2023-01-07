package state

class Walking: TravelMode {
    override fun getEta(): Int {
        println("Calculating ETA (walking)")
        return 4
    }

    override fun getDirection(): Int {
        println("Calculating direction (walking)")
        return 4
    }

}