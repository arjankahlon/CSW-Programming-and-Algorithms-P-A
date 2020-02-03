public class Wibbleboop{
    /**
     * Class variables- variables that keep tracj of everything about each individual of an object
     */   
    int numEyes; 
    int numLegs;
    double hairLength;

    /**
     * Constructor-method called when Wibbleboop made
     * same name as class, no return
     * sets default values
     */
    public Wibbleboop(){
        numEyes=7;
        numLegs=6;
        hairLength=5.7;
    }

    /**
     * 
     */
    public void haveAnAccident(){
        if (numLegs>0){ numLegs--;}
    }
    
    public void growHair(){
        hairLength=hairLength++;
    }

    public int getNumEyes(){return numEyes;}
    public int getNumLegs(){return numLegs;}
    public double getHairLength(){return hairLength;}
  
}