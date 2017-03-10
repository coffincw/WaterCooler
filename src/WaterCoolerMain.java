/**
 * Created by caleb on 3/10/17.
 */
public class WaterCoolerMain {

    public static void main (String args[]) {
        try {
            WaterCooler w = new WaterCooler(100);
            w.refill();
            w.getWater(20);
            System.out.println("You have " + w.currentWater + " water left in your cooler");
        } catch (WaterCoolerException ex) {
            System.out.println(ex);
            ex.printStackTrace();
        }
    }
}
