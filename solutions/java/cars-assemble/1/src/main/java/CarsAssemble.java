public class CarsAssemble {

    static int rate(int speed) {
        if (speed >= 1 && speed <= 4) {
            return 100;
        }
        else if (speed >= 5 && speed <= 8) {
            return 90;
        }
        else if (speed == 9) {
            return 80;
        }
        else {
            return 77;
        }
    }

    public double productionRatePerHour(int speed) {
        int y = rate(speed);
        return ((speed * 221.0) * (y / 100.0));
    }

    public int workingItemsPerMinute(int speed) {
        double x = productionRatePerHour(speed) / 60;
        return (int)x;
    }
}
