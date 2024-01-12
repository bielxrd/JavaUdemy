package MetodosAbstratos.Application;

import MetodosAbstratos.Entities.Circulo;
import MetodosAbstratos.Entities.Enums.Color;
import MetodosAbstratos.Entities.Rectangle;
import MetodosAbstratos.Entities.Shape;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner ler = new Scanner(System.in);

        System.out.println("Enter the number of shapes: ");
        int n = ler.nextInt();

        List<Shape> list = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            System.out.println("Shape #" + i + " data: ");
            System.out.println("Rectangle or Circle (r/c)? ");
            char ch = ler.next().charAt(0);
            System.out.println("Color (BLACK/BLUE/RED): ");
            Color color = Color.valueOf(ler.next());
            if (ch == 'r') {
                System.out.println("Width: ");
                double width = ler.nextDouble();
                System.out.println("Height: ");
                double height = ler.nextDouble();
                list.add(new Rectangle(color, width, height));
            } else {
                System.out.println("Radius: ");
                double radius = ler.nextDouble();
                list.add(new Circulo(color, radius));
            }
        }

        System.out.println();
        System.out.println("SHAPE AREAS: ");
        for (Shape shape : list) {
            System.out.println(String.format("%.2f", shape.area()));
        }


    }
}
