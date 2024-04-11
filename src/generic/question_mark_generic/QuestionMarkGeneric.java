package generic.question_mark_generic;

import java.util.ArrayList;
import java.util.List;

public class QuestionMarkGeneric {
    public static void drawShape(List<? extends Shape> shapes) {
        for (Shape shape : shapes) {
            shape.draw();
        }
    }
    public static void main(String[] args) {
        List<Rectangle> rectangles = new ArrayList<>();
        rectangles.add(new Rectangle());

        List<Circle> circles = new ArrayList<>();
        circles.add(new Circle());

        drawShape(rectangles);
        drawShape(circles);
    }
}
