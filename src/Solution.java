
import java.io.*;
        import java.util.*;
        import org.json.simple.*;
        import org.json.simple.parser.*;

public class Solution {
    public static void main(String[] args) {
        String filePath = "resources/input.json"; // Path to your JSON file

        try {
            JSONParser parser = new JSONParser();
            JSONObject jsonObject = (JSONObject) parser.parse(new FileReader(filePath));

            JSONObject keys = (JSONObject) jsonObject.get("keys");
            int n = Integer.parseInt(keys.get("n").toString());
            int k = Integer.parseInt(keys.get("k").toString());
            int m = k - 1;

            List<int[]> points = new ArrayList<>();
            for (int i = 1; i <= n; i++) {
                JSONObject point = (JSONObject) jsonObject.get(String.valueOf(i));
                int x = i;
                int base = Integer.parseInt(point.get("base").toString());
                String value = point.get("value").toString();
                int y = Integer.parseInt(value, base);
                points.add(new int[]{x, y});
            }

            // Using Lagrange interpolation to find the constant term
            double c = findConstantTerm(points, m);
            System.out.println("Constant term (c): " + (int) c);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static double findConstantTerm(List<int[]> points, int m) {
        double result = 0;

        for (int i = 0; i <= m; i++) {
            double term = points.get(i)[1];

            for (int j = 0; j <= m; j++) {
                if (j != i) {
                    term = term * (0 - points.get(j)[0]) / (points.get(i)[0] - points.get(j)[0]);
                }
            }
            result += term;
        }

        return result;
    }
}
