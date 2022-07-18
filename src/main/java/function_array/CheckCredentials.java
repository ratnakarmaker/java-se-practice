//6. Suppose a software system excepts valid credentials from user to logged in to the system. if the user inputs wrong password for 3 times, system will say that "Your user has been temporary locked". Let the username: admin, password: adm1n
package function_array;

import java.util.Objects;
import java.util.Scanner;

public class CheckCredentials {
    public static void main(String[] args) {
        String username = "admin";
        String password = "adm1n";
        Scanner input = new Scanner(System.in);
        System.out.print("Enter username: ");
        String usrName = input.next();
        int count = 0;

        for (int i = 1; i <=3 ; i++) {
            System.out.print("Enter password: ");
            String usrPassword = input.next();

            if(Objects.equals(usrPassword, password)) {
                System.out.println("Successfully logged in");
                break;
            }
            else if(!Objects.equals(usrPassword, password)){
                count++;
                if(count == 3){
                    System.out.println("Your user has been temporary locked");
                }
            }
        }
    }
}
