/**
 *
 */

// We start the use of javadoc which is a neat error finding system that brings an entire class out in the form of html. signified by the use of /** and enter
public class Student {

    /**
     * Creates a new student object with the specified name and ID

     */

    public Student(String name, int id){

        studentName = name;
        studentid = id;
    }

    /**
     * Gets the name of this student
     * @return the name of this student
     */

    public String getName(){

        return studentName;
    }

    /**
     * Gets the ID number of this student
     * @return the ID number of this student
     */
    public int getId (){

        return studentid;
    }

    /**
     * Sets the number of units earned
     * @param units the new number of units earned
     */

    public void setUnits (double units) { //dangerous setting this to public...units can be changed.
        unitsEarned = units;
    }

    /**
     * Gets the number of units earned
     * @return the number of units this student has earned
     */

    public  double getUnits (){

        return unitsEarned;
    }

    /**
     * increments additional units earned
     * @param additionalUnits the addition number of units earned
     */
    public void incrementalUnits (double additionalUnits){
        unitsEarned += additionalUnits;
    }

    /**
     * Gets the number of units earned
     * @return whether the student has enough units to graduate
     */
    public boolean hasEnoughUnits(){

        return (unitsEarned>= UNITS_TO_GRADUATE);
    }

    /**
     * Creates a string identifying each student
     * @return The string used to display the student
     */
    public String toString(){ // very important     every class written should have a toString method.displays in a textual way the class.

        return studentName + " ( & " + studentid + ")";
    }

    private static final double UNITS_TO_GRADUATE = 180; /* public constant*/
    private String studentName;/* The students' name */
    private int studentid;     /* The students' ID number*/
    private double unitsEarned; /* The number of units earned*/
}


