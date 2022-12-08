import classes.Car;
import classes.CarService;
import enums.Color;

import java.math.BigDecimal;
import java.time.Year;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        /**
         * Car деген класс тузунуз (Id, номер авто)
         * Дагы бир класс тузунуз, ал класста машинанын данныйлары сакталат (год выпуска, модель, цена, цвет)
         * HashMap тузунуз ключ - машина, маани - машинанын данныйлары
         * HashMapти толтуруп кайра entrySet деген методун колдонуп баардык элементтерин консольго чыгарыныз.
         */


        Car car1 = new Car(11,9988);
        Car car2 = new Car(22,6677);
        Car car3 = new Car(33,2244);
        List<Car> cars1 = new ArrayList<>(List.of(car1,car2,car3));

        CarService carService1 = new CarService(Year.of(2004),"Audi", BigDecimal.valueOf(200000), Color.BLACK);
        CarService carService2 = new CarService(Year.of(2022),"Tesla", BigDecimal.valueOf(400000), Color.WHITE);
        CarService carService3 = new CarService(Year.of(2020),"BMW", BigDecimal.valueOf(500000), Color.YELLOW);
        List<CarService> carServices = new ArrayList<>(List.of(carService1,carService2,carService3));
        Map<Car, CarService> cars = new LinkedHashMap<>();
        for (Car car : cars1) {
            for (CarService carService : carServices) {
                cars.put(car,carService);
            }
        }
        System.out.println(cars.entrySet());

    }
}