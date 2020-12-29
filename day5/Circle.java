package day5;

public class Circle {
    float radius;

    Circle(float radius) {
        this.radius = radius;
    }

    float area() {
        return 3.14f * radius * radius;
    }
}

class Sector extends Circle {
    float radian;

    Sector(float radian, float radius) {
        super(radius);
        this.radian = radian;
    }

    float area() {
        return 0.5f * radian * radius * radius;
    }
}

class Segment extends Circle {
    float length;

    Segment(float length, float radius) {
        super(radius);
        this.length = length;
    }

    float area() {
        return (float) ((radius * radius) * ((radius - length) / length)
                - (radius - length) * Math.pow((2 * radius * length - (length * length)), 0.5));
    }
}