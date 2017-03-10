/**
 * Created by caleb on 3/10/17.
 */
public class WaterCooler {
    double maxWater;
    double currentWater;

    public WaterCooler(double startMax) throws WaterCoolerException {
        if (startMax < 0) {
            throw new WaterCoolerException("can't handle negative maximum water");
        }
        maxWater = startMax;
        currentWater = 0.0;
    }

    public boolean isEmpty() {
        return (currentWater == 0.0);
    }

    public double getWater (double w) throws WaterCoolerException {
        if (w < 0) {
            throw new WaterCoolerException("can't handle a negative water amount");
        }
        if (w > currentWater) {
            throw new WaterCoolerException("can't handle value larger than currentWater");
        }
        currentWater -= w;
        return currentWater;
    }

    public void refill() {
        currentWater = maxWater;
    }
}
