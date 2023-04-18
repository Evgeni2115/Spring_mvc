package web.dao;

import jdk.jfr.Registered;
import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
@Repository
public class CarDaoImpl implements CarDao {
    private static List<Car> listCar = new ArrayList<>();

    public CarDaoImpl() {
        listCar.add(new Car("Chevrolet", "Cruse", 2012));
        listCar.add(new Car("Ford", "Mustang Shelby", 1969));
        listCar.add(new Car("Plymouth", "Barracuda", 1970));
        listCar.add(new Car("Pontiac", "GTO", 1964));
        listCar.add(new Car("Dodge", "Challenger SRT Hellcat", 2020));
    }

    @Override
    public List<Car> getsubList(int carNumber) {
        if (carNumber == 0) {
            return listCar;
        }
        return listCar.stream().limit(carNumber).collect(Collectors.toList());
    }
}
