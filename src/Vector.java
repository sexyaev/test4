public class Vector {
    private double x;
    private double y;
    private double z;

    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Vector sum(Vector other) throws IllegalArgumentException {

        if (other == null) {
            throw new IllegalArgumentException("Вектор не может быть пустым");
        }

        return new Vector(this.x + other.x, this.y + other.y, this.z + other.z);
    }

    public Vector subtract(Vector other) throws IllegalArgumentException {

        if (other == null) {
            throw new IllegalArgumentException("Вектор не может быть пустым");
        }

        return new Vector(this.x - other.x, this.y - other.y, this.z - other.z);
    }

    public double scalar(Vector other) throws IllegalArgumentException {

        if (other == null) {
            throw new IllegalArgumentException("Вектор не может быть пустым");
        }

        return this.x * other.x + this.y * other.y + this.z * other.z;
    }

    public double length() {

        return Math.sqrt(this.x * this.x + this.y * this.y + this.z * this.z);

    }

    public double cosinus(Vector other) throws IllegalArgumentException {

        if (other == null) {
            throw new IllegalArgumentException("Вектор не может быть пустым");
        }
        double scalar = this.scalar(other);
        double lengthsProduct = this.length() * other.length();

        return scalar / lengthsProduct;
    }

    public static void main(String[] args) {



        Vector vector1 = new Vector(1, 2, 3);
        Vector vector2 = new Vector(4, 5, 6);

        try {
            Vector sum = vector1.sum(vector2);
            Vector difference = vector1.subtract(vector2);
            double scalar = vector1.scalar(vector2);
            double length1 = vector1.length();
            double cosinus = vector1.cosinus(vector2);

            System.out.println("Сумма векторов: " + sum.x + ", " + sum.y + ", " + sum.z);
            System.out.println("Разность векторов: " + difference.x + ", " + difference.y + ", " + difference.z);
            System.out.println("Скалярное произведение векторов: " + scalar);
            System.out.println("Длина первого вектора: " + length1);
            System.out.println("Косинус угла между векторами: " + cosinus);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
