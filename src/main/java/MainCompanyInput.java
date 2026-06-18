import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class MainCompanyInput {
    public static void main(String[] args){

        ArrayList<Employee> company = new ArrayList<>();
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader scan = new BufferedReader(is);
        while (true) {
            Employee emp = getEmployee();
            company.add(emp);

            System.out.print("another employee? yes or no>>>");
            String answer = null;
            try {
                answer = scan.readLine();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
            if (answer.equalsIgnoreCase("no"))
            break;
            //scan.close();
        }
        printCompany(company);
    }

    private static void printCompany(ArrayList<Employee> company) {
        for (Employee e : company){
            System.out.println(e);
        }
    }

    private static Employee getEmployee() {
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);
        Employee emp = null;
        try {
            System.out.println("enter name>>>>>");
            String name = br.readLine();
            System.out.print("enter ID>>>");
            String str = br.readLine();
            int id = Integer.parseInt(str);
            System.out.print("enter position>>>>");
            String position = br.readLine();
            System.out.println("enter salary");
            str = br.readLine();
            double salary = Double.parseDouble(str);
            emp = new Employee(name, id, position, salary);

        }catch (IOException e){
            System.out.println(e.getMessage());
        }
        return emp;
    }
}

/*
HW
ArrayList<Product>
Product
-----------
name(String)
code(int)
price(double)

 input ->
 add number products use sreams
and
add to list

printLists



 */
