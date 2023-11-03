package samplePackage;

import java.util.Comparator;

public class CustomerComparator implements Comparator<Customer> {

    int order;

    public CustomerComparator(boolean isAscending){
        if (isAscending) {
            order = 1;
        } else {
            order = -1;
        }
    }


    @Override
    public int compare(Customer o1, Customer o2) {
        // -1 => o1 is smaller than o2
        // 0 => o1 and o2 are equal 
        // 1 => o1 is greater than o2
        return order * Integer.compare(o1.getSpending(), o2.getSpending());

    }
    
}
