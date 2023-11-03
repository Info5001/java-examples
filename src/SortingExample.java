import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import samplePackage.Customer;
import samplePackage.CustomerComparator;

public class SortingExample {

    public static void main(String[] args) {

        final int numberOfCustomers = 400;
        final int upperSpendingLimit = 5000;

        // We have a list of 5000 different Customers and their spending.
        // | # | Name | Total spent us |
        Random r = new Random();

        ArrayList<Customer> customerSpending = new ArrayList<Customer>();
        for (int i = 0; i < numberOfCustomers; i++) {
            int randomSpending = r.nextInt(upperSpendingLimit);
            Customer c = new Customer(i, "Customer #"+i, randomSpending);
            customerSpending.add(c);
        }

        // Questions:
        // 1. Who are my top 10 best customers?
        // 2. Who are my top 10 worst customers?
        // 3. What is the average spending of my customers?
        // 4. Difference between average of top 10 customers spending and actual
        // spending?

        // Do these questions make sense?

        // ----> 1. Who are my top 10 best customers?

        Collections.sort(customerSpending, new CustomerComparator(false)); 
        

        for (int i = 0; i < numberOfCustomers; i++) {
            customerSpending.get(i).print(i+1);
        }

    }

}
