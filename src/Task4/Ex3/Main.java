package Task4.Ex3;
/*
Из текста удалить все слова заданной длины, начинающиеся на согласную букву.
*/
public class Main {
    public static void main (String[] args){

       String str = "Сложнее всего начать действовать, все остальное зависит только от упорства.";
       String[] strArray = str.split(" ");
       for (String w : strArray){
           char first = w.charAt(0);
           if (w.length() != 6) {
               System.out.print(w + " ");
           }
       }

    }
}
