import java.util.Arrays;
import java.util.Comparator;

public class SearchTest {

    // Linear Search
    public static Product linearSearch(Product[] products, String name) {

        for (Product p : products) {
            if (p.productName.equalsIgnoreCase(name)) {
                return p;
            }
        }
        return null;
    }

    // Binary Search
    public static Product binarySearch(Product[] products, String name) {

        int low = 0;
        int high = products.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            int compare = products[mid].productName.compareToIgnoreCase(name);

            if (compare == 0)
                return products[mid];

            if (compare < 0)
                low = mid + 1;
            else
                high = mid - 1;
        }

        return null;
    }

    public static void main(String[] args) {

        Product[] products = {
                new Product(101, "Laptop", "Electronics"),
                new Product(102, "Mobile", "Electronics"),
                new Product(103, "Keyboard", "Accessories"),
                new Product(104, "Mouse", "Accessories"),
                new Product(105, "Printer", "Electronics")
        };

        System.out.println("===== Linear Search =====");

        Product p1 = linearSearch(products, "Keyboard");

        if (p1 != null)
            System.out.println("Found : " + p1.productName);

        Arrays.sort(products, Comparator.comparing(p -> p.productName));

        System.out.println("\n===== Binary Search =====");

        Product p2 = binarySearch(products, "Keyboard");

        if (p2 != null)
            System.out.println("Found : " + p2.productName);
    }
}