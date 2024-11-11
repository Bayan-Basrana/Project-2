import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


    //routes
    Route route1 = new Route("Alhamra(Riyadh)", "Alolaya(Riyadh)", 50);
    Route route2 = new Route("AlMalazz(Riyadh)", "AlAziziah(Riyadh)", 70);

    //Cars
    Car car1 = new Car("001", route1, 5);
    Car car2 = new Car("002", route2, 0);
    Car car3= new Car("003",route2,2);
    ArrayList<Passenger> passengers = new ArrayList<>();

    Passenger subscribers = new SubscribersPassengers("Bayan", "1255");
    Passenger nonSubscribers = new Non_SubscribersPassengers("Ahmed", "5684", true);
    Passenger nonSubscribers2= new Non_SubscribersPassengers("Mohammed","2468",false);
    //add passengers to the array
         passengers.add(subscribers);
         passengers.add(nonSubscribers);
         passengers.add(nonSubscribers2);
        try {
    subscribers.reserveCar(car1);
        } catch (Exception e) {
            System.out.println(e.getMessage() );
        }

        try{
            nonSubscribers.reserveCar(car2);
        } catch (Exception e) {
            System.out.println(e.getMessage() );
        }
        try{
    nonSubscribers2.reserveCar(car3);
        } catch (Exception e) {
            System.out.println(e.getMessage() );
        }



        // display information
        for (Passenger p :passengers) {
            p.displayInfo();
            System.out.println();}
    }
}