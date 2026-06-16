import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class HWMainMarktInput {
    public static void main(String[] args) {
        ArrayList<HWProduct> products = new ArrayList<>();

        HWProduct pr = getHWProduct();
        products.add(pr);
        printLists(products);
        System.out.println("-----PRODUCTS-----");

    }

    private static void printLists(ArrayList<HWProduct> products) {
        for (HWProduct e : products){
            System.out.println(e);
        }
    }

    private static HWProduct getHWProduct() {
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);
        HWProduct pr = null;

        try {
            System.out.print("Enter name>>>");
            String name = br.readLine();

            System.out.print("Enter code>>>");
            int code = Integer.parseInt(br.readLine());

            System.out.print("Enter price>>>");
            double price = Double.parseDouble(br.readLine());

            pr = new HWProduct(name, code,price);
        } catch (IOException e) {
            e.printStackTrace();
           // throw new RuntimeException(e);
        }
        return pr;
    }

}
