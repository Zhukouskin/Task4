package Task4.Ex4;
/*Реализуйте алгоритм, определяющий, все ли символы в строке встречаются один раз.*/
public class Main {
    public static void main (String[] args){
     String str = "Where there is muck there is brass";
     char [] strArr = str.toCharArray();
     char n = 0;
     int a ;


     for (int i = 0; i < strArr.length; i++){
         n = strArr[i];
         a = 0;
         for (int j = 0; j < strArr.length; j++){
             if (n == strArr[j]){
                 a++;
             }

         }
         System.out.println(strArr[i] + " встречается в тексте " + a + "раз");
     }
    }
}
