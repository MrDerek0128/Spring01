package bean;

import java.util.LinkedList;
import java.util.List;

public class CarFactor {
    private static List<Car> cars;
    static {
        cars  = new LinkedList<Car>();
        cars.add(new Car("BMW"));
        cars.add(new Car("Benz"));
    }

    public static Car getCar(int num) {
        return cars.get(num);
    }
}
