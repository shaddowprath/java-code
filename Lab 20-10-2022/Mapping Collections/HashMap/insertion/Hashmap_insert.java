import java.io.*; 
import java.util.*; 
class Hashmap_insert { 
  
    public static void main(String args[]) 
    { 
  
        // creating a hashmap 
        HashMap<String, String> hm = new HashMap<>(); 
  
        // putting elements 
        hm.put("01", "aaaaaaa"); 
        hm.put("03", "bbbbbbb"); 
        hm.put("04", "zzzzzzz"); 
        hm.put("02", "kkkkkkk"); 
  
        System.out.println("Iterate over original HashMap"); 
        
        // printing hashmap 
        for (Map.Entry<String, String> entry : 
             hm.entrySet()) { 
            System.out.println(entry.getKey() + " => "
                               + ": " + entry.getValue()); 
        } 
    } 
}