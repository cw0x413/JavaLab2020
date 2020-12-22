package day6;

public abstract class Vehicle {
    int year_of_manufacture;
    abstract int getData();
    abstract void putData(int year_of_manufacture);
    Vehicle(int year_of_manufacture){
        this.year_of_manufacture=year_of_manufacture;
    }
}

class TwoWheeler extends Vehicle{
    TwoWheeler(int year_of_manufacture){
        super(year_of_manufacture);
    }
    int getData(){
        return year_of_manufacture;
    }
    void putData(int year_of_manufacture){
        this.year_of_manufacture=year_of_manufacture;
    }
}

final class FourWheeler extends Vehicle{
    FourWheeler(int year_of_manufacture){
        super(year_of_manufacture);
    }
    int getData(){
        return year_of_manufacture;
    }
    void putData(int year_of_manufacture){
        this.year_of_manufacture=year_of_manufacture;
    }
}

class MyTwoWheeler extends TwoWheeler{

    MyTwoWheeler(int year_of_manufacture) {
        super(year_of_manufacture);
    }
}