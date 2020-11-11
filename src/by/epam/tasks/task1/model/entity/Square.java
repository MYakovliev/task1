package by.epam.tasks.task1.model.entity;

public class Square {
    private double a;

    public Square(double a) {
        setA(a);
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Square{");
        sb.append("a=").append(a);
        sb.append('}');
        return sb.toString();
    }
}
