public class Non_SubscribersPassengers extends Passenger {
private boolean  discountCoupon;
    public Non_SubscribersPassengers(String name, String id, boolean discountCoupon) {
        super(name, id);
        this.discountCoupon=discountCoupon;
    }

    @Override
    public void reserveCar(Car car) throws Exception {
        car.capacity();
        reservedCar=car;
        if (discountCoupon){
        super.setTripCost( car.getFixedRout().getPrice()*0.1);}
        else
        {
            super.setTripCost( car.getFixedRout().getPrice());}

    }

    }


