package set;


import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashSet;
import java.util.Set;

public class HashCode {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        Set<Integer> hash = new HashSet<>();
        hash.add(4);
        System.out.println(hash.hashCode());
        System.out.println(createHash(new String("4")));
    }

    public static String createHash(String veri) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        byte[] hashBytes = md.digest(veri.getBytes());

        StringBuilder sb = new StringBuilder();
        for (byte b : hashBytes) {
            sb.append(String.format("%02x", b));
        }
        return sb.toString();
    }
}
