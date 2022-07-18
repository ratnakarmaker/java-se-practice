//3. Suppose, in a company , here are some employee salaries in an array
//        [35000, 25000, 28000, 32500, 44000, 32800]
//        Find out the 3rd highest salary
package function_array;

import java.util.Arrays;

public class FindThirdHighestSalary {
    public static void main(String[] args) {
        int salary[] = {35000, 25000, 28000, 32500, 44000, 32800};
        Arrays.sort(salary);
        int max = salary[salary.length-3];
        System.out.println("Third largest element is :"+max);
    }
}
