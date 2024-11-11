public class SubscribersPassengers extends Passenger {

    public SubscribersPassengers(String name, String id) {
        super(name, id);
    }

    @Override
    public void reserveCar(Car car) throws Exception {
     car.capacity();
     reservedCar=car;
     super.setTripCost( car.getFixedRout().getPrice()*0.50);
    }



}
