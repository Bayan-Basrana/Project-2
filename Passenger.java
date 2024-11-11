public abstract class Passenger {
    private String name;
    private String id;
    private double tripCost;
    Car reservedCar;

    public Passenger(String name, String id) {
        this.name = name;
        this.id = id;

    }

    public void setTripCost(double tripCost) {
        this.tripCost = tripCost;
    }

    public double getTripCost() {
        return tripCost;
    }

    public abstract void reserveCar(Car car)
            throws Exception;

    public  void displayInfo (){
        if (reservedCar!= null){
        System.out.println(" passenger name: " + name);
        System.out.println(" passenger ID: " + id);
        System.out.println(" reserved car code: " + reservedCar.getCode());
            System.out.println("Route from: "+ reservedCar.getFixedRout().getStartPickUp() + " to: "+ reservedCar.getFixedRout().getDestination());
        System.out.println("route price: "+ reservedCar.getFixedRout().getPrice());
        System.out.println(" Trip price: " + tripCost);}

    }

}
