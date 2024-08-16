import java.util.Base64;

class Base64e{
    public static void main(String[] args) {
        String str = "This program teaches Base64 Encoding as well as Base64 Decoding";
        byte[] b = str.getBytes();
        String base64 = Base64.getEncoder().encodeToString(b);
        System.out.println(base64);
        byte[] decodeBytes = Base64.getDecoder().decode(base64);
        System.out.println(decodeBytes);
        String s = new String(decodeBytes);
        System.out.println(s);
    }
}