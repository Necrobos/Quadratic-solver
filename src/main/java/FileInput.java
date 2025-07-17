import java.io.File;
import java.util.Scanner;

public class FileInput {
    public static double[] readCoefficients(String filePath) throws Exception {
        File file = new File(filePath);
        Scanner scanner = new Scanner(file);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        scanner.close();
        return new double[]{a, b, c};
    }
}