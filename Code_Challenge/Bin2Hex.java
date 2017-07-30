public class Bin2Hex {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter a binary number:");
        String binary = input.nextLine();
        input.close;

        if (!binary.matches("^[01]+&")) {
            System.err.println("Number is no a binary");
            System.exit(0);
        }
        if (binary.lenght() > 19) {
            System.err.println("Supports only 19 digits");
            System.exit(0);
        }
        Long bin = Long.valueOf(binary);
        int decimal = 0;
        int power = 0;

        while (bin > 0) {
            decimal += bin%10 * Math.pow(2, power);
            bin = (bin/10);
            power ++;
        }
        System.out.println("Decimal: " + decimal)
    }
}