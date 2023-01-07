package state

class Driving: TravelMode {
    override fun getEta(): Int {
        System.out.println("Calculating ETA (driving)");
        return 1;
    }

    override fun getDirection(): Int {
        System.out.println("Calculating Direction (driving)");
        return 1;
    }
}