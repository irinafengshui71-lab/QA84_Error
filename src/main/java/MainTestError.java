public class MainTestError {
    public static void main(String[] args) {
        int size = Integer.MAX_VALUE;
        while (true) {
            try {
                int[] ar = new int[size];
                break;
            } catch (Error e) {
                System.out.println(e.getMessage());
                size = size / 2;     // size --; paaru 4asov schdatj, to4noe 4iclo
            }
            System.out.println("Size = " + (size * 4)/1024/1024/1024);
        }
    }
}
