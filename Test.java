public class Test {
    public static void main(String[] args) {
        Byte[] byteArray = {10, 20, 30, 40};
        for (Byte object : byteArray) {
            String binaryString = String.format("%8s", Integer.toBinaryString(object & 0xFF)).replace(' ', '0');
            System.out.println(binaryString);
        }

        String[] binaryStringArray = {"00001010", "00010100", "00011110", "00101000"};
        for (String binaryString : binaryStringArray) {
            int intValue = Integer.parseInt(binaryString, 2);
            System.out.println(intValue);
        }
    }
}
