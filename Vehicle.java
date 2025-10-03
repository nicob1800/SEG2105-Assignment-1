import java.time.Instant;

public abstract class Vehicle implements Printable{

    //Attributes
    private int id;
    private double emptyWeight;
    private double cruiseSpeed;

    public abstract double getMaxWeight();
    public abstract double getMaxSpeed();
    public abstract double getMinSpeed();
    public abstract Instant getRegistrationTime();
    public abstract String getVehicleType();
    public abstract void start();
    public abstract void move();
    public abstract void stop();

    public void operate(){
        start();
        move();
        stop();
    }

    @Override
    public void dump(){
        System.out.println("ID: " + id);
        System.out.println("Empty Weight: " + emptyWeight);
        System.out.println("Cruise Speed: " + cruiseSpeed);
    }


    // Constant limiters
    public static final int MAX_WEIGHT = 10000;
    public static final int MIN_SPEED = 20;
    public static final int MAX_SPEED = 200;
    
    private static int nextID = 0;

    public Vehicle(double emptyWeight, double cruiseSpeed){
        this.id = nextID++;
        this.emptyWeight = emptyWeight;
        this.cruiseSpeed = cruiseSpeed;

    }

    //Setters

    public void setCruiseSpeed(double cruiseSpeed){
        if (cruiseSpeed >= getMinSpeed() && cruiseSpeed <= getMaxSpeed()){
            this.cruiseSpeed = cruiseSpeed;
        }else if (cruiseSpeed < getMinSpeed()){
            throw new IllegalArgumentException("cruiseSpeed must be > MIN_SPEED (" + getMinSpeed() + ")");
        }else if(cruiseSpeed > getMaxSpeed()){
            throw new IllegalArgumentException("cruiseSpeed must be < MAX_SPEED (" + getMaxSpeed() + ')');
        }
        
    }

    public void setEmptyWeight(double emptyWeight){
        if(emptyWeight >= 0 && emptyWeight <= getMaxWeight()){
            this.emptyWeight = emptyWeight;
        }else if (emptyWeight < 0){
            throw new IllegalArgumentException("Empty weight must be > 0");
        }else if (emptyWeight > getMaxWeight()){
            throw new IllegalArgumentException("Empty Weight must be <= MAX_Weight (" + getMaxWeight() + ')');
        }
    }

    public void setCruiseSpeed(){
        this.cruiseSpeed = getMaxSpeed() * 0.3;
    }

    public void setEmptyWeight(){
        this.emptyWeight = getMaxWeight() * 0.3;
    }


    //Getters

    public double getCruiseSpeed(){
        return this.cruiseSpeed;
    }

    public double getEmptyWeight(){
        return this.emptyWeight;
    }

    public int getId(){
        return id;
    }

}