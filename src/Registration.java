public class Registration {
    static int nextRegNo = 1001;
    private int regNo;
    private Car car;
    private CarType carType;
    private Owner owner;
    
    public Registration(Car car,CarType carType, Owner owner){
        regNo = nextRegNo;
        this.car = car;
        this.carType = carType;
        this.owner = owner;
        nextRegNo++;
    }
    
    public String toString(){
        return String.format ("%-7d %s %s %s",
                regNo, owner.toString(), car.toString(), carType.toString());
    }
}
