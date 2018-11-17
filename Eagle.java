public class Eagle extends Bird implements Fly {

    private boolean flying;
    private int altitude;

    public Eagle(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
    }

    public int getAltitude() {
        return altitude;
    }

    public boolean isFlying() {
        return flying;
    }

    @Override
    public String sing() {
        return "Screech!";
    }
    
    public void takeOff() {
    	System.out.println(getName() +" Takes off in 3, 2, 1 ..");
    }
    
    public void land() {
    	System.out.println("Prepare for crash landing, brace for impact");
    }
    
    public void ascend(int meters) {
    	System.out.println("He flies up "+ meters + " meters into the air !");
    }
    
    public void descend(int meters) {
		System.out.println(getName() + " comes shooting down " + meters + " meters !!");
    }
    
    public void glide() {
		System.out.println("He glides majestically into the air");
	}
    
    public void ascend2(int meters) {
    	System.out.println(getName() + " continues his ascent another " + meters + " meters");
    }
    
    public void descend2(int meters) {
    	System.out.println(getName() + " slows down , he comes down another " + meters + " meters");
    	
    }
    
    public void land2() {
    	System.out.println(getName() + " softly lands on a tree branch, oklm");
    }
}
    
