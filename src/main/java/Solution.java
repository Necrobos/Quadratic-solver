public class Solution {
    private final Double x1;
    private final Double x2;
    private final boolean realNumFlag;

    // Конструктор для двух корней
    public Solution(double x1, double x2) {
        this.x1 = x1;
        this.x2 = x2;
        this.realNumFlag = true;
    }

    // Конструктор для одного корня
    public Solution(double x) {
        this.x1 = x;
        this.x2 = null;
        this.realNumFlag = true;
    }

    // Конструктор для случая без корней
    public Solution() {
        this.x1 = null;
        this.x2 = null;
        this.realNumFlag = false;
    }

    public void print(QuadraticEquation equation) {
        if (!realNumFlag) {
            System.out.println("Уравнение не имеет действительных корней");
        } else if (x2 == null) {
            System.out.printf("Уравнение имеет один корень: x = %.2f%n", x1);
        } else {
            System.out.printf("Уравнение имеет два корня: x1 = %.2f, x2 = %.2f%n", x1, x2);
        }
    }
}
