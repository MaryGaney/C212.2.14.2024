import java.util.HashMap;
import java.util.Scanner;

public class Login {
    //all keys have to be unique or else they will be overwritten
    public static void main(String[] args) {
        HashMap<String, String> credentials = new HashMap<>();
        credentials.put("a@b.com", "abc123");
        credentials.put("b@b.com", "123abc");
        credentials.put("c@b.com", "123456");

        Scanner in = new Scanner(System.in);
        System.out.println("enter username and password");
        System.out.println("username: ");
        String username = in.next();
        System.out.println("password: ");
        String password = in.next();

        if(credentials.containsKey(username)) {
            if (credentials.get(username).equals(password))
                System.out.println("welcome" + username);
            else
                System.out.println("invalid username or password");
        }else
            System.out.println("invalid username");
    }
}
