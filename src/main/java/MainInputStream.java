import java.io.*;

public class MainInputStream {
    public static void main(String[] args){
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);
        System.out.println("Enter your name>>>>>");
        String name = "";
        try {
            name = br.readLine();
            System.out.println("name: " + name);
            System.out.print("enter your age>>>>>");
            String str = br.readLine();
            double age = Double.parseDouble(str);
            System.out.println(" age : " + age);
            System.out.print("enter your ID>>>>");
            str = br.readLine();
            int id = Integer.parseInt(str);
            System.out.println("ID: " + id);
            br.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
