package state

class DirectionService(
    var travelMode: TravelMode
) {
    fun getEta(): Int {
        return travelMode.getEta()
    }

    fun getDirection(): Int {
        return travelMode.getDirection()
    }
}