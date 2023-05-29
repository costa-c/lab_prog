import static java.lang.Math.random;

public class PairOfDice {
    /**
     *
     */
    public PairOfDice() {
// Constructor.  Rolls the dice, so that they initially
            // show some random values.
            roll();  // Call the roll() method to roll the dice.        
    }

    public PairOfDice(int val1, int val2) {
        die1 = val1;
        die2 = val2;

    }
    public void roll() {
        // Roll the dice by setting each of the dice to be
        // a random number between 1 and 6.
        die1 = (int) (random()*6) +1;
        die2 = (int) (random()*6) +1;

    }

    public int die1;   // Number showing on the first die.
    public int die2;   // Number showing on the second die.
    
} // end class PairOfDice
