package ss5_accessmodifier_staticmethod_staticproperty.thuc_hanh.car;

import javax.xml.parsers.SAXParser;

public class Car {
    private String name;
    private String engine;
    public static int numberOfCars;
    public Car(String name, String engine){
        this.name = name;
        this.engine = engine;
        numberOfCars++;
    }
}
