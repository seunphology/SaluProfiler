public class Freshman extends Student {

    public Freshman (String name, int Id) {
        super(name,Id); // calls Student constructor

        setUnits(0);

        getId();

        getUnits();



    }
    public String toString(){
        return ("Freshman : " + getName() + " ( #" + getId()+ ")"); // because Name and ID are private in Student superclass,it needs to call public methods in superclass to access them.
    }
}
