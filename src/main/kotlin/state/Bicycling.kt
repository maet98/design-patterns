package state

class Bicycling: TravelMode {
    override fun getEta(): Int {
        System.out.println("Calculating ETA (bicycling)");
        return 2;
    }

    override fun getDirection(): Int {
        System.out.println("Calculating direction (bicycling)");
        return 2;
    }
}