/**
 *
 * @author Marco Nicotra
 */
public class FizzBuzz {
    
    public static String array[];

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //String array[];
        array=new String[100];
        // array initialization
        for (int i=0; i<100; i++){
            array[i]=Integer.toString(i+1);
        }
        //insert Fizz
        array=insertString(array, 3, "Fizz");
        //insert Buzz
        array=insertString(array, 5, "Buzz");
                
        for (int i=0; i< array.length; i++){
        System.out.println(array[i]);
        }
                
    }
    
    /**
     * this funcion places a string called element every X elements in the temp array. Returns temp array
     */
    
    public static String[] insertString(String[] temp, int x, String element){
        int i=x;
        while (i<temp.length){
            if (temp[i-1].equals(Integer.toString(i))){
                temp[i-1]=element;
                
            }
            else{
                temp[i-1]= temp[i-1]+element;
            }
            i=i+x;
        }
        return temp;
    }
}
