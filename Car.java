public class Car {
    private String code;
    private Route fixedRout ;
    private int maxCapacity;

    public Car(String code, Route fixedRout, int maxCapacity) {
        this.code = code;
        this.fixedRout = fixedRout;
        this.maxCapacity = maxCapacity;
    }

    public String getCode() {
        return code;
    }

    public Route getFixedRout() {
        return fixedRout;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setFixedRout(Route fixedRout) {
        this.fixedRout = fixedRout;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }
public void capacity () throws Exception{
        if(maxCapacity==0){
            throw new Exception("car reach max capacity , for car code: " + getCode());
        }}

}
