# RoverBasics — everything on Thursday's test, in a program that runs

**CSCI-121 · Week 5 · Assigned Mon Sep 21 · Due Sun Sep 27, 11:59 PM**

There are **no tests in this project.** Not one. You will not write a test, read a
test, or run a test.

You run the program, you read what it prints, and you compare it to this page.

That is deliberate. Every Java thing you have built since week 3 has been a test file
somebody handed you, and several of you told me the *tests* were the confusing part
rather than the Java. So we are taking them out and going back to the thing that
actually matters this week: **you, writing Java, watching it run.**

## The lab has two halves

| | | |
|---|---|---|
| **Part 1** | **Follow along** · steps 1–9 | Every line is printed below. You type it in and run it. **Nothing is left for you to invent.** |
| **Part 2** | **Stretch** · goals A–F | You get the rules and the output. **You write the code.** |

**Part 1 is the assignment.** If you type all nine steps, run them, and open the pull
request, you have done the lab. It is meant to be finishable by everyone, in one
sitting, with nobody to ask.

**Part 2 is where the actual practice is.** Do as much as you can. If you get through
A, B and C you are in good shape. Nobody is expected to finish all six.

---

## The rule for the whole lab

> **Write down what you think it will print. Then run it.**

There is a box at every step. Fill it in. Nobody grades the prediction and nobody
checks whether you got it right.

It matters because **Thursday's test is exactly this** — I show you six lines of Java
and you tell me what they print. There is no computer in the room on Thursday. If the
only way you can answer is to run it, you cannot answer it.

Getting a prediction **wrong** and then seeing why is worth more than getting it right.

> **Type the code. Do not paste it.** The typing is most of the point — it is where you
> find out that Java wants a semicolon, that `String` is capitalised, and that a `char`
> uses single quotes. Pasting eight steps takes four minutes and teaches you nothing.

---

## Setup — do this once

> ## ⚠️ Fork it. Do not clone this repository.
>
> **You cannot push to this repo** — you do not have permission, and you should not. A
> fork is *your own copy on GitHub*, which you can push to and which I can read.
> **No fork, no way to hand anything in.**
>
> This is the single most common way work gets lost in this class.

### Step 1 · Fork it, in the browser

Click **Fork** at the top right of **this page** — *not* "Use this template", and not the
green **Code** button yet.

When it finishes you are looking at a **different page**. The name at the top should read:

```
your-username / RoverBasics
  forked from DSU-CSCI-121-F26/RoverBasics
```

**If the name still says `DSU-CSCI-121-F26`, the fork did not happen.** Stop and do it
again. Everything below depends on this.

### Step 2 · Clone YOUR fork

Use the green **Code** button *on your own page*, or type it with your username in it:

```bash
git clone https://github.com/YOUR-USERNAME/RoverBasics.git
cd RoverBasics
```

Put your actual GitHub username where it says `YOUR-USERNAME`. There is no account called
`YOUR-USERNAME`.

### Step 3 · Check it, before you write a line of code

```bash
git remote -v
```

Read what it prints. It **must** contain **your** username. If it says
`DSU-CSCI-121-F26`, you cloned mine — delete the folder, go back to step 1, and start
again. Anything you write in the wrong folder is work I will never see.

### Step 4 · Run it

```bash
./mvnw compile exec:java          # Windows:  mvnw.cmd compile exec:java
```

You should see exactly this, and nothing else:

```
=== RoverBasics ===

--- Step 1: what a rover is made of ---
```

That is correct. Step 1 is empty — that is where you start.

> **The first run downloads Maven and takes a minute or two.** After that it is instant.
> Get it out of the way before you sit down to work.

**In IntelliJ:** File → Open → pick the `RoverBasics` folder → Trust Project. If there
is no green ▶ next to `main`, right-click `pom.xml` → Maven → Reload project.

---

## How Part 1 works

`src/main/java/rover/Main.java` has one method per step. In `main()` at the
top, only step 1 is switched on:

```java
step1Variables();
// step2Battery();
// step3Strings();
```

Each method has a marker showing where your code goes:

```java
private static void step1Variables() {
    System.out.println();
    System.out.println("--- Step 1: what a rover is made of ---");

    // ▼ README · Step 1. Type it below this line.

}
```

**One step at a time.** Type it, run it, check it against this page, and only then
delete the `//` in front of the next step in `main()`.

> **Stuck for more than ten minutes on one step?** Leave it, go to the next one, bring
> it to Wednesday's section. Do not lose a night to one line.

---

## Every video so far — 1 h 42 m

These are the *Bro Code* modules the schedule has listed since week 1. **Nothing tracks
whether you watched them**, and no quiz or exam question depends on one. They are a
second explanation — someone typing Java and running it, which is exactly what lecture,
aimed at design judgement, deliberately is not.

If a topic in this lab does not land, the video for it is in this table.

| Week | Modules | Covers | Runtime | Used in |
|---|---|---|---|---|
| 1 | **#39** Object-oriented programming | what an object even is | 9:51 | the whole lab |
| 2 | **#2** Variables · **#3** User input · **#13** String methods | types, `Scanner`, `String` | 38:50 | steps 1, 3, 4 |
| 3 | **#40** Constructors · **#41** Overloaded constructors | constructors | 16:44 | steps 5, 6 |
| 4 | **#42** Array of objects | arrays that hold objects | 10:00 | step 8 |
| 5 | **#26** Methods · **#27** Overloaded methods · **#28** Variable scope | **methods** | 26:30 | step 9 |

**Full course:** <https://www.youtube.com/watch?v=xTtL8E4LzTQ>

It is one long video. The **#numbers are the chapter markers** — open the chapter list in
the video description, or drag along the timeline until the title matches. The runtime
column is for the whole row, not each module.

> **Behind on all of them?** Do not sit down and watch an hour and 42 minutes. Watch
> **#39** (10 minutes), then start the lab, and pull up a row only when the step it is
> attached to gives you trouble.

---

# PART 1 · FOLLOW ALONG

# MONDAY — steps 1 to 4

*Do these in place of Monday's section. Roughly 40 minutes.*

---

## Step 1 · Variables have types

In Python you write `wheels = 6` and Python works out what it is. In Java **you say what
kind of thing it is first**, and after that the variable can only ever hold that kind of
thing.

Five variables below. Four are **primitives**, one is an **object** — knowing which is
which is worth points on Thursday.

**Type this into `step1Variables()`:**

```java
String name = "Sparky";
int wheels = 6;
double topSpeed = 0.75;
boolean headlightsOn = false;
char missionCode = 'B';

System.out.println("name         = " + name);
System.out.println("wheels       = " + wheels);
System.out.println("topSpeed     = " + topSpeed);
System.out.println("headlightsOn = " + headlightsOn);
System.out.println("missionCode  = " + missionCode);

System.out.println("missionCode + 1       = " + (missionCode + 1));
System.out.println("(char)(missionCode+1) = " + (char) (missionCode + 1));
```

Note `'B'` in **single** quotes. A `char` is one character and uses single quotes; a
`String` is text of any length and uses double quotes. Swapping them will not compile.

> **Predict first.**
> `missionCode + 1` prints ................ `____`
> `(char)(missionCode + 1)` prints ........ `____`

<details>
<summary><b>Expected output</b> — open after you have run it</summary>

```
--- Step 1: what a rover is made of ---
name         = Sparky
wheels       = 6
topSpeed     = 0.75
headlightsOn = false
missionCode  = B
missionCode + 1       = 67
(char)(missionCode+1) = C
```

`'B'` **is the number 66.** Add 1 and you have 67. Java prints an `int` as a number, so
you get `67`. You only get a letter back when you cast it to `char`.

</details>

---

## Step 2 · Integer division, and the bug it causes

**This is the most reliable way to get a wrong answer in Java** that compiles perfectly,
runs fine, and never warns you.

A 300 mAh battery with 150 mAh in it is half full. You are going to write that
percentage three ways: the wrong way, the right way, and the exact way.

**Type this into `step2Battery()`:**

```java
int capacity = 300;
int charge   = 150;

int wrong = charge / capacity * 100;
int right = charge * 100 / capacity;
double exact = (double) charge * 100 / capacity;

System.out.println("capacity = " + capacity + ", charge = " + charge);
System.out.println("wrong = " + wrong + "%");
System.out.println("right = " + right + "%");
System.out.println("exact = " + exact + "%");

int smallCapacity = 3;
int smallCharge   = 2;

int twoThirds = smallCharge * 100 / smallCapacity;
double twoThirdsExact = (double) smallCharge * 100 / smallCapacity;

System.out.println("2 of 3 as an int    = " + twoThirds + "%");
System.out.println("2 of 3 as a double  = " + twoThirdsExact + "%");
System.out.println("Java did not round. It chopped.");
```

Look at `wrong` and `right`. **Same three numbers, same operators, different order.**

> **Predict first.** `charge` is 150, `capacity` is 300.
> `charge / capacity * 100` gives ......... `____`
> `charge * 100 / capacity` gives ......... `____`

<details>
<summary><b>Expected output</b></summary>

```
--- Step 2: how full is the battery? ---
capacity = 300, charge = 150
wrong = 0%
right = 50%
exact = 50.0%
2 of 3 as an int    = 66%
2 of 3 as a double  = 66.66666666666667%
Java did not round. It chopped.
```

`150 / 300` is not `0.5`. Both sides are `int`, so Java does **integer division** and
throws the fraction away — it is `0`. Then `0 * 100` is `0`.

The fix is not a different operator, it is a different **order**: multiply while the
number is still big.

And `66` is not carelessly rounded — Java **chops**, always toward zero, and never looks
at what it is throwing away. `(double)` on one side is what makes the whole expression
keep its decimals.

</details>

---

## Step 3 · Strings are objects, and they never change

Two things here are on the test.

**`toUpperCase()` does not shout at your variable.** It builds a *new* String and hands
it back. If you do not catch the result, nothing happens at all.

**`==` and `.equals()` ask different questions.** `==` asks *"are these the same
object?"*; `.equals()` asks *"do these hold the same text?"*

**Type this into `step3Strings()`:**

```java
String label = "Rover Sparky";

System.out.println("label            = " + label);
System.out.println("label.length()   = " + label.length());
System.out.println("label.charAt(6)  = " + label.charAt(6));
System.out.println("label.substring(6) = " + label.substring(6));

label.toUpperCase();

System.out.println("after toUpperCase(), label = " + label);

String shouty = label.toUpperCase();

System.out.println("shouty = " + shouty);

String typedByHand = new String("Rover Sparky");

boolean sameObject = label == typedByHand;
boolean sameText = label.equals(typedByHand);

System.out.println("label == typedByHand      -> " + sameObject);
System.out.println("label.equals(typedByHand) -> " + sameText);
```

That bare `label.toUpperCase();` on its own line is **not a typo.** It is there so you
can watch it do nothing.

> **Predict first.**
> After the bare `label.toUpperCase();`, `label` is ....... `____`
> `label == typedByHand` is .............................. `____`
> `label.equals(typedByHand)` is ......................... `____`

<details>
<summary><b>Expected output</b></summary>

```
--- Step 3: strings ---
label            = Rover Sparky
label.length()   = 12
label.charAt(6)  = S
label.substring(6) = Sparky
after toUpperCase(), label = Rover Sparky
shouty = ROVER SPARKY
label == typedByHand      -> false
label.equals(typedByHand) -> true
```

`new String("Rover Sparky")` is the same twelve characters in a **different object**.
`==` compares the objects and says no. `.equals()` compares the characters and says yes.

This is why `==` on Strings is a bug that works by accident sometimes and fails the rest
of the time. Use `.equals()`.

</details>

---

## Step 4 · Reading what somebody types

This is the only step that needs an **import**. Put this line at the very top of
`Main.java`, just under `package rover;`:

```java
import java.util.Scanner;
```

**Type this into `step4Input()`:**

```java
Scanner in = new Scanner(System.in);

System.out.print("Name your rover: ");
String roverName = in.nextLine();

System.out.print("How many wheels? ");
int wheelCount = in.nextInt();

System.out.println(roverName + " reporting for duty on " + wheelCount + " wheels.");
```

Run it, and **type your answers** when it stops and waits. Type `Sparky`, press Enter,
type `6`, press Enter.

> **Predict first.** The two prompts use `print`, not `println`.
> Do they appear on one line or two? ....... `____`

<details>
<summary><b>Expected output</b> — typing "Sparky" then "6"</summary>

```
--- Step 4: ask the operator ---
Name your rover: How many wheels? Sparky reporting for duty on 6 wheels.
```

One line. `System.out.print` does **not** add a line break; `System.out.println` does.
That is the whole difference between them, and it is a test question.

</details>

---

# TUESDAY — steps 5 to 9

*Do these in place of Tuesday's lecture.*

## Watch these first — about 53 minutes

Three rows from the video table near the top of this page:

| Week | Modules | For | Runtime |
|---|---|---|---|
| 3 | **#40** Constructors · **#41** Overloaded constructors | steps 5 and 6 | 16:44 |
| 4 | **#42** Array of objects | step 8 | 10:00 |
| 5 | **#26** Methods · **#27** Overloaded methods · **#28** Variable scope | step 9 | 26:30 |

If you are short on time, **#40 and #26 are the two that matter most** — they are the
ones steps 5 and 9 lean on hardest.

Nothing tracks whether you watched. Steps 5–9 are much harder if you did not.

---

## Step 5 · Your first class, from a diagram

Open **`src/main/java/rover/Servo.java`**. The UML box and the four rules are at the top
of that file. This is the same class we built together at the projector on Sep 15, and
it is the exact shape of Skill Builder 3 and Skill Builder 4.

**Type this into `Servo.java`,** where the marker is:

```java
private final String name;
private int angle;

public Servo(String name) {
    this.name = name;
    this.angle = 90;
}

public String getName() {
    return name;
}

public int getAngle() {
    return angle;
}

public void turnTo(int degrees) {
    if (degrees > 180) {
        angle = 180;
    } else if (degrees < 0) {
        angle = 0;
    } else {
        angle = degrees;
    }
}

public boolean isCentered() {
    return angle == 90;
}

@Override
public String toString() {
    return getName() + " @ " + getAngle();
}
```

**Two things in there are on the test.**

`this.angle = 90;` — a field you never assign is **not empty**. It gets a default, and
for an `int` that default is `0`. Delete that line and a new servo starts at 0 instead
of centered.

`this.name = name;` — the parameter and the field have the same name. Writing
`name = name;` **compiles, and does nothing at all** — it assigns the parameter to
itself. `this.` is what tells them apart. That bug cost us ten minutes in class.

**Then type this into `step5FirstClass()`:**

```java
Servo mast = new Servo("Mast");

System.out.println("name         = " + mast.getName());
System.out.println("starts at    = " + mast.getAngle());
System.out.println("isCentered() = " + mast.isCentered());

mast.turnTo(45);
System.out.println("after turnTo(45)  = " + mast.getAngle());

mast.turnTo(240);
System.out.println("after turnTo(240) = " + mast.getAngle());

mast.turnTo(-40);
System.out.println("after turnTo(-40) = " + mast.getAngle());
```

> **Predict first.**
> A new `Servo("Mast")` reports `getAngle()` of ..... `____`
> After `turnTo(240)`, `getAngle()` is .............. `____`

<details>
<summary><b>Expected output</b></summary>

```
--- Step 5: one servo ---
name         = Mast
starts at    = 90
isCentered() = true
after turnTo(45)  = 45
after turnTo(240) = 180
after turnTo(-40) = 0
```

</details>

---

## Step 6 · Two constructors, one class

Video #41. Add a **second** constructor to `Servo` — same name, different parameter
list. That is **overloading**.

**Type this into `Servo.java`, just under the first constructor:**

```java
public Servo(String name, int startingAngle) {
    this.name = name;
    turnTo(startingAngle);
}
```

Look at that second line. It does **not** re-check 0 and 180. It calls `turnTo`, which
already knows the rule. Writing the `if/else` a second time would mean two copies of one
rule, and one day you would fix only one of them.

**Then type this into `step6TwoConstructors()`:**

```java
Servo a = new Servo("Arm");
Servo b = new Servo("Boom", 30);

System.out.println(a.getName() + " starts at " + a.getAngle());
System.out.println(b.getName() + " starts at " + b.getAngle());

Servo c = new Servo("Cheat", 500);
System.out.println(c.getName() + " starts at " + c.getAngle());
```

> **Predict first.** `new Servo("Cheat", 500).getAngle()` is ..... `____`

<details>
<summary><b>Expected output</b></summary>

```
--- Step 6: a second constructor ---
Arm starts at 90
Boom starts at 30
Cheat starts at 180
```

The second constructor is not a back door. `500` goes through `turnTo` like everything
else and lands at 180.

</details>

---

## Step 7 · One object owning another — and two names for one object

Open **`src/main/java/rover/Rover.java`**. A `Rover` **owns** two `Servo`s.

**Type this into `Rover.java`:**

```java
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
```

**The line that matters most is `this.left = new Servo("left");`**

Writing `private final Servo left;` makes a **place** for a servo. It does not make a
servo. Until the constructor says `new`, that place holds `null`, and the first thing to
touch it dies:

```
Exception in thread "main" java.lang.NullPointerException:
    Cannot invoke "rover.Servo.getAngle()" because "..." is null
```

That is not a mystery — the message names the field you forgot. **Two servos means two
`new`s.** Pointing both fields at one servo looks fine until you steer left and the
right one moves too.

Also notice `steerLeft` is **one line**, and it does not mention 180. The Rover does not
know the limit and must not learn it. It asks the servo.

**Then type this into `step7Composition()`:**

```java
Rover sparky = new Rover("Sparky");

System.out.println("left  starts at " + sparky.getLeftServo().getAngle());
System.out.println("right starts at " + sparky.getRightServo().getAngle());

sparky.steerLeft(30);
System.out.println("after steerLeft(30):  left = "
        + sparky.getLeftServo().getAngle()
        + ", right = " + sparky.getRightServo().getAngle());

Servo borrowed = sparky.getLeftServo();
borrowed.turnTo(120);

System.out.println("borrowed.getAngle()            = " + borrowed.getAngle());
System.out.println("sparky.getLeftServo().getAngle = "
        + sparky.getLeftServo().getAngle());
System.out.println("Same object? " + (borrowed == sparky.getLeftServo()));

Rover other = new Rover("Bolt");
System.out.println("Bolt's left servo is still at " + other.getLeftServo().getAngle());
```

> **Predict first.** There is **no `new`** on the `Servo borrowed = ...` line.
> `borrowed.getAngle()` is ......................... `____`
> `sparky.getLeftServo().getAngle()` is ............ `____`

<details>
<summary><b>Expected output</b></summary>

```
--- Step 7: a rover owns two servos ---
left  starts at 90
right starts at 90
after steerLeft(30):  left = 30, right = 90
borrowed.getAngle()            = 120
sparky.getLeftServo().getAngle = 120
Same object? true
Bolt's left servo is still at 90
```

One `new`, one object. `borrowed` is not a copy — it is a **second name for the same
servo.** Turning it turns the rover's servo, because they are the same thing.

`Bolt` is a different rover with its own two servos, which is why it is still at 90.

</details>

---

## Step 8 · An array of objects

Video #42.

**Type this into `step8ArrayOfObjects()`:**

```java
Servo[] servos = new Servo[4];

System.out.println("servos.length = " + servos.length);
System.out.println("servos[0]     = " + servos[0]);

for (int i = 0; i < servos.length; i++) {
    servos[i] = new Servo("S" + i);
}

for (int i = 0; i < servos.length; i++) {
    System.out.println(servos[i]);
}
```

**Look hard at what `servos[0]` prints before the loop.** Making the array did not make
any servos — it made four empty places, exactly like the `Rover`'s field in step 7.

> **Predict first.** Straight after `new Servo[4]`:
> `servos.length` is ....... `____`
> `servos[0]` is ........... `____`

<details>
<summary><b>Expected output</b></summary>

```
--- Step 8: four servos in an array ---
servos.length = 4
servos[0]     = null
S0 @ 90
S1 @ 90
S2 @ 90
S3 @ 90
```

`length` on an array has **no parentheses**. On a String it does — `label.length()`.
Java is inconsistent about this and it is a favourite exam question.

The second loop prints `S0 @ 90` and not `rover.Servo@7c729a55` because `Servo` has a
`toString()`. That is what `toString` is for.

</details>

---

---

## Step 9 · Methods of your own

**You have been writing methods this whole lab without being told.** Every
`step1Variables()`, `step2Battery()` and so on is a method. So is every `getAngle()` and
`turnTo()` on `Servo`. This step makes four on purpose and names the parts.

A method is a named piece of work that **takes things in** (parameters) and **hands
something back** (a return value). `void` means it hands nothing back.

**Type this into `step9Methods()`:**

```java
System.out.println("percent(150, 300) = " + percent(150, 300));
System.out.println("percent(2, 3)     = " + percent(2, 3));
System.out.println("percent(150)      = " + percent(150));

Servo mast = new Servo("Mast");
mast.turnTo(20);
System.out.println("before centerIt   = " + mast.getAngle());
centerIt(mast);
System.out.println("after  centerIt   = " + mast.getAngle());

Servo boom = new Servo("Boom");
boom.turnTo(20);
System.out.println("before replaceIt  = " + boom);
replaceIt(boom);
System.out.println("after  replaceIt  = " + boom);

// System.out.println(runningTotal);
```

**And type these four methods below `step9Methods()`** — inside the class, but *outside*
that method. A method never goes inside another method.

```java
private static int percent(int part, int whole) {
    int runningTotal = part * 100;
    return runningTotal / whole;
}

private static int percent(int part) {
    return percent(part, 300);
}

private static void centerIt(Servo s) {
    s.turnTo(90);
}

private static void replaceIt(Servo s) {
    s = new Servo("Replacement");
    s.turnTo(90);
}
```

**Four things to notice, and the last one is the big one.**

**`percent` is the step 2 arithmetic, written once.** That is what a method is *for*. Two
places needed that sum; now neither of them owns a copy of it.

**There are two `percent` methods with the same name.** Same idea as the two constructors
in step 6 — that is **overloading**, and Java picks which one you meant by counting and
typing the arguments. The one-argument version does not repeat the sum; it calls the
other one.

**`runningTotal` exists only inside `percent`.** That is **scope**. Uncomment the last
line of `step9Methods()` and try to compile — you will get `cannot find symbol`. The
name is invisible three lines away. Read the error, then comment it back out.

**`centerIt` works and `replaceIt` does not.** Look at them: both take a `Servo`, both
end up with a centered servo. But only one of them changes *your* servo.

> **Predict first.** `boom` is at 20 when `replaceIt(boom)` is called.
> After `centerIt(mast)`, `mast.getAngle()` is ......... `____`
> After `replaceIt(boom)`, `boom` prints ............... `____`

<details>
<summary><b>Expected output</b></summary>

```
--- Step 9: methods of your own ---
percent(150, 300) = 50
percent(2, 3)     = 66
percent(150)      = 50
before centerIt   = 20
after  centerIt   = 90
before replaceIt  = Boom @ 20
after  replaceIt  = Boom @ 20
```

`centerIt` **reached through** the reference it was handed and turned the servo on the
other end. That is the same one-object-two-names idea as step 7, and it worked.

`replaceIt` pointed its **own parameter** `s` at a brand new `Servo` and centered that
one instead. Your `boom` never moved, and the new servo was thrown away the moment the
method ended.

So: **a method can change the object you hand it. It cannot change which object your
variable points at.** That is worth reading twice — it is the thing people get wrong
about methods for years.

</details>

---

**That is Part 1.** Switch on `stretch();` in `main()` when you are ready for Part 2, or
skip to *Handing it in* and come back.

---

# PART 2 · STRETCH

**Now the code is yours.** Each goal gives you the rule and the output it has to
produce. No Java is printed below — that is the difference.

The **printing is already written** for you in `stretch()`, commented out. Uncomment one
block at a time, as you finish each goal, so your output lines up with this page.

Do them in order. Each is a few lines. **If you get through A, B and C you are in good
shape** — nobody is expected to finish all six.

---

### A · `Servo.turnBy(int degrees)`

Turn **by** an amount, not **to** an angle. Starting at 90, `turnBy(30)` leaves it at
120.

The limit still applies. **Do not write the 0–180 rule again** — there is already a
method that knows it. One line.

```
A · after turnBy(30) from 90 = 120
A · after turnBy(200)        = 180
```

### B · `Rover.centerAll()`

Put both servos back to 90.

```
B · after centerAll: 90 and 90
```

### C · Give the `Rover` a battery

Add a capacity and a charge, and three things that use them:

- `getCharge()` — how many mAh are in it
- `drain(int amount)` — take that much off, but **never below 0**
- `batteryPercent()` — the charge as a whole-number percentage of capacity

A new rover starts **full**. Use the good order from step 2, not the one that gives 0.

You also need a **second constructor**, `Rover(String name, int batteryCapacity)`, so a
rover can be built with a different size battery. The one-argument constructor should
still work and should give a 300 mAh battery.

```
C · starts at        100%
C · after drain(150) 50%
C · after drain(999) 0 mAh, 0%
```

> A constructor is allowed to call another constructor of the same class, on its first
> line, with `this(...)`. That is how you avoid writing the setup twice.

### D · `Rover.hasName(String other)`

True when `other` holds the same text as the rover's name.

The test hands it a name built with `new String(...)`. Step 3 tells you which of the two
comparisons survives that.

```
D · hasName(new String("Sparky")) = true
D · hasName("Bolt")              = false
```

### E · `Rover.toString()`

So that `System.out.println(someRover)` prints something readable. `Servo` already has
one — use it rather than digging the angles out by hand.

```
E · Sparky [left @ 45, right @ 90]
```

### F · Two methods over an array

Write two methods in `Main.java`. Both loop over a `Servo[]`. **Neither one prints
anything — they return.**

- `countCentered(Servo[] servos)` → how many are at exactly 90
- `widest(Servo[] servos)` → the one `Servo` with the largest angle

```
F · centered count = 2
F · widest         = S3 @ 175
```

> `widest` returns a `Servo`, not an `int`. Start by assuming the first one is the
> widest, then look at the rest.

---

## Handing it in

**Due Sun Sep 27, 11:59 PM.** Committed is not submitted. Pushed is not submitted. It
counts when there is an **open pull request in your own fork**.

```bash
git switch -c assignment
git add -A
git commit -m "RoverBasics part 1"
git push -u origin assignment
```

Then on GitHub: **Compare & pull request** → make sure the base repo is **your own
fork**, not `DSU-CSCI-121-F26` → check **your username is on both sides of the arrow** →
**Create pull request** → **post the link in Canvas.**

**Push again as you get further.** The same pull request updates itself — you do not
open a second one. Hand in Part 1 as soon as it runs; do not sit on it while you work
on the stretch goals.

> The check that runs on your pull request only answers **"does it compile?"** A green
> check does **not** mean your output is right. Only you can check that, against this
> page.

If any of that goes wrong, the **"Is it actually submitted?"** page on Canvas has the
60-second check and every fix. `Authentication failed` on push is always the token, and
those instructions are at the bottom of that page.

---

## What Thursday's test covers

Steps 1 to 8, and nothing that is not in them.

| Step | On the test as |
|---|---|
| 1 | which type holds what · primitive vs object · `char` arithmetic |
| 2 | integer division · casting · truncation toward zero |
| 3 | `==` vs `.equals()` · String immutability · `length()` / `charAt` / `substring` |
| 4 | `print` vs `println` · `Scanner` |
| 5 | fields, constructors, methods · field defaults · `this.` |
| 6 | overloading · not writing a rule twice |
| 7 | composition · `null` object fields · references and aliasing |
| 8 | arrays of objects · `length` vs `length()` |
| **9** | **not on Thursday** — methods are an introduction, and we do them properly in week 6 |

**Step 9 and the stretch goals are not on Thursday's test.** Step 9 exists so that
methods are not brand new to you when we pick them up next week. The stretch goals are
practice at writing code from a rule, which is what the October and November exams ask
for.

Closed book, no notes, no laptop, no AI. If you have typed steps 1 to 8 and written your
predictions down, you have already done most of the work.
