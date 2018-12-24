package com.makotojava.learn.springboot.lambda.lambda;


import com.makotojava.learn.springboot.model.Car;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description TODO
 * @ClassName： :
 * @Package com.makotojava.learn.springboot.lambda.lambda
 * @anthor：wyang
 * @date：2018/12/21
 * @版本：V1.0
 */
public class TestCar {

    public static void main(String[] args) {
        Car car = new Car();
        List<Car> carList = car.getCarList();
        List<String> carModel =
                //new ArrayList<>();
                Car.getModelsAfter2000UsingFor(carList, c ->car.getYear()>2000);
       // carList.stream().sorted((a,b)->new Integer(a.getYear()).compareTo(b.getYear())).filter(car1 -> car1.getYear()>2000).forEach(c ->carModel.add(c.getModel()+"==="+c.getYear()));
        carModel.forEach(str-> System.out.println(str));

    }
}
