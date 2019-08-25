import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        
        Map<String, Integer> phonebook;
        phonebook = new HashMap<String, Integer>(); 

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
            phonebook.put(name, phone);

        }
        while(in.hasNext()){
            String s = in.next();
            // Write code here
            if (phonebook.get(s) == null) {
                System.out.println("Not found");
            } else {
                System.out.println(s + "=" + phonebook.get(s));
            }
        }
        in.close();
    }
}
