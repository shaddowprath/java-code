
public class AndroidPhone_main {
    public static void main(String[] args) {
        AndroidPhone a1 = new AndroidPhone( 69 , "vedant" , true);
        AndroidPhone a2 = new AndroidPhone( 54 , "Amaan" , false);
        AndroidPhone a3 = new AndroidPhone( 99, "Abhishek" , true);

        AndroidPhone[] array = new AndroidPhone(3);
        array[0] = a1;
        array[1] = a2;
        array[2] = a3;

        for(AndroidPhone a: array){
            System.out.println(a);
        }
    }
}