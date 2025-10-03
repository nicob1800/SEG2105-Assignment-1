import java.time.Instant;

public class Bike extends LandVehicle{
    public static final double MAX_WEIGHT = 200.0; // Kg
    public static final double MAX_SPEED = 60.0; // km/h

    public final Instant registrationTime;

    private static int count = 0;

    public Bike(){
        this(0.0, 0.0);
    }


    public Bike(double emptyWeight, double cruiseSpeed){
        super(emptyWeight, cruiseSpeed);
        this.registrationTime = Instant.now();
        count++;
    }

    @Override
    public String getVehicleType(){
        return "Bike";
    }

    @Override
    public double getMaxWeight(){
        return MAX_WEIGHT;
    }

    @Override
    public double getMaxSpeed(){
        return MAX_SPEED;
    }

    @Override
    public double getMinSpeed(){
        return MAX_SPEED * 0.1;
    }

    @Override
    public Instant getRegistrationTime(){
        return registrationTime;
    }

    public static int count(){
        return count;
    }

    @Override
    public void start(){

    }

    @Override
    public void move(){
        
    }

    @Override
    public void stop(){

    }

    @Override
    public void dump(){
        System.out.println("--- Bike ---");
        System.out.printf("id            : %d\n", getId());
        System.out.printf("emptyWeight   : %.2f kg\n", getEmptyWeight());
        System.out.printf("cruiseSpeed   : %.2f km/h\n", getCruiseSpeed());
        System.out.printf("MAX_WEIGHT    : %.2f kg\n", getMaxWeight());
        System.out.printf("MAX_SPEED     : %.2f km/h\n", getMaxSpeed());
        System.out.printf("MIN_SPEED     : %.2f km/h\n", getMinSpeed());
        System.out.printf("REG_TIME      : %s\n", getRegistrationTime().toString());
    }
}