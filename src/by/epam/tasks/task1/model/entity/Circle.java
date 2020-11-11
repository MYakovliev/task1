package by.epam.tasks.task1.model.entity;

public class Circle {
    private int radius;

    public Circle(int radius) {
        setRadius(radius);
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        radius = Math.max(radius, 0);
        this.radius = radius;
    }

    @Override
    public String toString() {
        final StringBuilder sb;
        sb = new StringBuilder("Circle{");
        sb.append("radius=").append(radius);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return getRadius() == circle.getRadius();
    }

}
