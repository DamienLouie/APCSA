package Unit3;

public class TriangleClassifier {
    public static void main(String[] args) {
        System.out.println(triangleSides(3, 4, 5));
    }

    public static String triangleSides(int a, int b, int c) {
        int a2 = a * a;
        int b2 = b * b;
        int c2 = c * c;


        if (a + b > c && b + c > a && a + c > b) {
            if (a == b && b == c) {
                if (a2 + b2 == c2 || a2 + c2 == b2 || b2 + c2 == a2) {
                    return "Equilateral Right Triangle";
                } else if (a2 + b2 < c2 || a2 + c2 < b2 || b2 + c2 < a2) {
                    return "Equilateral Obtuse Triangle";
                } else {
                    return "Equilateral Acute Triangle";
                }
            } else if (a == b || b == c || a == c) {
                if (a2 + b2 == c2 || a2 + c2 == b2 || b2 + c2 == a2) {
                    return "Isosceles Right Triangle";
                } else if (a2 + b2 < c2 || a2 + c2 < b2 || b2 + c2 < a2) {
                    return "Isosceles Obtuse Triangle";
                } else {
                    return "Isosceles Acute Triangle";
                }
            } else {
                if (a2 + b2 == c2 || a2 + c2 == b2 || b2 + c2 == a2) {
                    return "Isosceles Right Triangle";
                } else if (a2 + b2 < c2 || a2 + c2 < b2 || b2 + c2 < a2) {
                    return "Isosceles Obtuse Triangle";
                } else {
                    return "Isosceles Acute Triangle";
                }
            }
        }
        return "Not a valid triangle";
    }
}
