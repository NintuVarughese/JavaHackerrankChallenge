import java.io.*;
import java.util.*;

public class Operation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();  // Number of queries
        
        // Loop over each query
        for (int i = 0; i < q; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int n = scanner.nextInt();
            
            // Generate and print the series
            int term = a;  // Initialize the term with a
            for (int j = 0; j < n; j++) {
                term += (int)(Math.pow(2, j) * b);  // Add the current term value to series
                System.out.print(term + " ");  // Print the current term
            }
            System.out.println();  // Move to the next line after each series
        }
        scanner.close();
    }
}
