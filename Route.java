public class Route {
    private String startPickUp;
    private String destination;
    private int price;

    public Route(String startPickUp, String destination, int price) {
        this.startPickUp = startPickUp;
        this.destination = destination;
        this.price = price;
    }

    public void setStartPickUp(String startPickUp) {
        this.startPickUp = startPickUp;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getStartPickUp() {
        return startPickUp;
    }

    public String getDestination() {
        return destination;
    }

    public int getPrice() {
        return price;
    }
}
