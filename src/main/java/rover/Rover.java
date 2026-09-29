package rover;

/**
 * STEP 7 · A Rover OWNS two Servos. That is the filled diamond on the diagram.
 *
 *      ┌────────────────────────────────┐
 *      │             Rover              │
 *      ├────────────────────────────────┤
 *      │ - name: String                 │
 *      │ - left: Servo                  │
 *      │ - right: Servo                 │
 *      ├────────────────────────────────┤
 *      │ + getName(): String            │
 *      │ + getLeftServo(): Servo        │
 *      │ + getRightServo(): Servo       │
 *      │ + steerLeft(int): void         │
 *      │ + steerRight(int): void        │
 *      └───────────────◆────────────────┘
 *                      │ owns 2
 *                    Servo
 *
 * README Step 7 gives you the whole class. Type it in below.
 */
public class Rover {

    // ▼ README · Step 7.
    private final String name;
    private final Servo left;
    private final Servo right;
    private final int capacity;
    private int charge;

    public Rover(String name , int batteryCapacity) {
        this.name = name;
        this.left = new Servo("left");
        this.right = new Servo("right");
        this.capacity = batteryCapacity;
        this.charge = batteryCapacity;
    }

    public String getName() {
        return name;
    }

    public Servo getLeftServo() {
        return left;
    }

    public Servo getRightServo() {
        return right;
    }

    public void steerLeft(int degrees) {
        left.turnTo(degrees);
    }

    public void steerRight(int degrees) {
        right.turnTo(degrees);
    }
    //Part B
    public void centerAll(){
        left.turnTo(90);
        right.turnTo(90);
    }

    //Part C


    public int getCharge() {
        return charge;
    }
    public void drain(int amount){
        charge -= amount;
        if (charge < 0){
            charge = 0;
        }
    }
    public int batteryPercent(){
        return charge * 100/capacity;
    }

    //Part D
    public boolean hasName(String other){
        return name.equals(other);
    }
    //Part E
    public String toString(){
        return name + " [" + left + ", "+ right + "]";
    }
}
