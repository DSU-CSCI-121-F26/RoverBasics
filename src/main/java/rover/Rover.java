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

    public Rover(String name) {
        this.name = name;
        this.left = new Servo("left");
        this.right = new Servo("right");
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

}
