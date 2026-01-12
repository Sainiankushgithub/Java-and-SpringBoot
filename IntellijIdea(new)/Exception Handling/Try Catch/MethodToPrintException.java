public class MethodToPrintException {
    public static void main(String[] args) {
        String name = null;

        // 1. printStackTrace
        try {
            System.out.println("Getting the length . . . . ");
            System.out.println(name.length());
        } catch (NullPointerException npe) {
            npe.printStackTrace();
            System.out.println("This is printStackTrace() call");
        }

        // 2. getMessage
        try {
            System.out.println("Getting length . . . . ");
            System.out.println(name.length());
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("This is getMessage() call");
        }

        // 3. toString
        try {
            System.out.println("Getting length again . . . . ");
            System.out.println(name.length());
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("This is toString() call");
        }
    }
}
