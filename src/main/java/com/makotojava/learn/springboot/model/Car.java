package com.makotojava.learn.springboot.model;


import java.util.*;
import java.util.function.Predicate;

import static java.util.stream.Collectors.toList;

/**
 * @Description TODO
 * @ClassName： :
 * @Package com.makotojava.learn.springboot.model
 * @anthor：wyang
 * @date：2018/12/21
 * @版本：V1.0
 */
public class Car {
    private List<Car> carList;

    private String make;
    private String model;
    private int year;

    public Car(String theMake, String theModel, int yearOfMake) {
        make = theMake;
        model = theModel;
        year = yearOfMake;
    }

    public List<Car> getCarList() {
        return carList;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public Car() {
        this.carList = init();
    }

    private List<Car> init() {
        return Arrays.asList(new Car("Jeep", "Wrangler", 2011),
                new Car("Jeep", "Comanche", 1990),
                new Car("Dodge", "Avenger", 2010),
                new Car("Buick", "Cascada", 2016),
                new Car("Ford", "Focus", 2012),
                new Car("Chevrolet", "Geo Metro", 1992));
    }

    public int compare(Car car) {
        return new Integer(this.getYear()).compareTo(car.getYear());
    }


    public static List<String> getModelsAfter2000UsingFor(List<Car> cars, Predicate predicate) {
       /* List<Car> carsSortedByYear = new ArrayList<>();

        for (Car car : cars) {
            if (car.getYear() > 2000) {
                carsSortedByYear.add(car);
            }
        }

        Collections.sort(carsSortedByYear, new Comparator<Car>() {
            @Override
            public int compare(Car car1, Car car2) {
                return new Integer(car1.getYear()).compareTo(car2.getYear());
            }
        });


        for (Car car : carsSortedByYear) {
            models.add(car.getModel()+"==="+car.getYear());
        }*/
        List<String> models = new ArrayList<>();
      //  cars.stream().sorted((a, b) -> b.compare(a)).filter(car -> car.getYear() > 2000).forEach(car -> models.add(car.getModel() + "===" + car.getYear()));


        return   cars.stream()
                .filter(car -> car.getYear() > 2000)
                .sorted(Comparator.comparing(Car::getYear))
                .map(car -> car.getModel()+"=="+car.getYear())
                .collect(toList());


//      /  return models;
    }
}
