public class Test {
    public static void main(String[] args) {
        // Byte[] byteArray = {10, 20, 30, 40};
        // for (Byte object : byteArray) {
        //     String binaryString = String.format("%8s", Integer.toBinaryString(object & 0xFF)).replace(' ', '0');
        //     System.out.println(binaryString);
        // }
        //
        // String[] binaryStringArray = {"00001010", "00010100", "00011110", "00101000"};
        // for (String binaryString : binaryStringArray) {
        //     int intValue = Integer.parseInt(binaryString, 2);
        //     System.out.println(intValue);
        // }

        Utils utils = new Utils();
        Byte[][] bytesArray = utils.KToBytesArray();
        // System.out.println(bytesArray[bytesArray.length - 1][3].toString());
        // Byte[][] byteArray = new Byte[utils.KConstants.length][4];
        // for (int i = 0; i < utils.KConstants.length; i++) {
        //     String constant = utils.KConstants[i];
        //     for (int j = 0; j < 4; j++) {
        //         int val = Integer.parseInt(constant.substring(i * 2, i * 2 + 2), 16);
        //         Byte byteVal = new Byte((byte) val);
        //         byteArray[i][j] = byteVal;
        //     }
        // }
    }
}
