public class HWProduct {

   private String name;
   private int code;
   private double price;

    @Override
    public String toString() {
        return "HWProduct {" +
                " name='" + name + '\'' +
                ", code=" + code +
                ", price=" + price +
                '}';
    }

    public HWProduct(String name, int code, double price) {
        this.name = name;
        this.code = code;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}



/*



 */
