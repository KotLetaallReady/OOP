package Task1;
public class Main {
    public static void main(String[] args) {
        // Создать объект класса, вызвав конструктор с параметрами
        Vector vector1 = new Vector(3, 24, 31, 54);

        // Создать объект класса, вызвав конструктор без параметров
        Vector vector2 = new Vector();

        // Вызвать каждый из методов
        Vector vectorProduct = vector1.vectorProduct(vector2);
        double scalarProduct = vector1.scalarProduct(vector2);
        double length = vector1.length();
        vector1.multiplyByScalar(2);
        Vector sum = vector1.sum(vector2);
        Vector difference = vector1.difference(vector2);

        System.out.println("Векторное произведение: " + vectorProduct.x2 + ", " + vectorProduct.y2);
        System.out.println("Скалярное произведение: " + scalarProduct);
        System.out.println("Длинна: " + length);
        System.out.println("Сумма: (" + sum.x2 + ", " + sum.y2 + ")");
        System.out.println("Разница: (" + difference.x2 + ", " + difference.y2 + ")");

        // Эмоджи для настроения:
        System.out.println("Программа успешно выполнена! ");
    }
}