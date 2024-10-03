/* Name: MorganAshli Harper
   Professor: Hoing, William
   Date: Januray 20th, 2024
   Homework: updating compass
 */

//A enums are a bit like java primitive type.

    import java.util.Arrays; // start of the program


    public enum directionsOnCompass { // enum name is directionsOnCompass, it will be using directions from a compass.
        NORTH, EAST, SOUTH, WEST, NORTHEAST, NORTHWEST, SOUTHEAST, SOUTHWEST; // I will be using eight directions from a compass.
        // These are the constants North, South, East, West, Northeast, Northeast, Southeast, and Southwest i will be using.
        // They will be put into main so that when creating variables should determine if they are equal in direction in main.

        // will be using  north, and southeast

        public directionsOnCompass turnRight(){  // This method is supposed to be meant to turn right, depending on what direction you are in.
            int nextIndex = (this.ordinal() + 1) % values().length;
            return values()[nextIndex];

        }
        public static directionsOnCompass reset() { // This should allow the compass to reset at the start of North,
            return NORTH;
        }


        // Pseduocode:  I created variable in main so that the assigned enum can be express as compass directions.



    public static void main(String[] args){


    //Pre-condition: turnRight() and reset() methods that are defined in public enum directionOnCompass.
    //variant: x is the varible of the current direction from the compass and it should be set to NORTH.



        directionsOnCompass x = NORTH; // x is going to  be assigned to value of NORTH.
        directionsOnCompass[] compass = {NORTH, SOUTHEAST}; // Compass will be an array it will have all the values of directionOnCompass.
        directionsOnCompass[] everyDirect = directionsOnCompass.values(); //



        System.out.println(" Intro to enum in Java! "); // nice introudction
        System.out.println(" The value assigned to SOUTHEAST is: " + SOUTHEAST.ordinal());  // southwest is a constant that was a also assiged a value
        System.out.println(" The current value of variable x is: " + x + " and its internal representation is: " + x.ordinal()); // x will be used for North, it will print out North and it will show that the reprsenstation is zero because x.ordinal is going to find its value place.
        System.out.println(" Here are my directions: " + Arrays.toString(compass)); //this array.toString(compass) will allow to show the direction and
        System.out.println(" Here are all the directions: " + Arrays.toString(everyDirect)); //this will allow built in method in java that returns a value given in a string format.
        System.out.println(" Is SOUTHEAST equal to any of them: " + Arrays.toString(compass)  + " is only equal once: "  + Arrays.toString(compass)); // this will see if southEAST equals on the compass
            // will print that southeast is only listed once, by looking at the variable created (compass) will prove the statement.


        System.out.println("/nTesting turnRight: ");
        for (int i = 0; i < 3; i++) {
            x = x.turnRight(); //Turning right, this should be updating by x.
            System.out.println("Turn right, This is the current direction: " + x); //This is the output of each test cases direction after each turn.

        }
        // This should allow the test cases to reset and then reset() method will be called.
        System.out.println("\nTesting reset: ");
        x = reset();
        System.out.println("After the reset, this will be the current direction: " + x); //finally, this is going to be the output of after reset/
    }
    } //Ending of the program

