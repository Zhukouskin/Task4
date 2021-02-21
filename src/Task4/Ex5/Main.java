package Task4.Ex5;
/*Для двух строк напишите метод, определяющий, является ли одна строка перестановкой другой.*/


import java.util.Arrays;

public class Main {
    public static void main (String[] args){

        String str1 = "Where there is muck there is brass"; //Создаем строки ,
        String str2 = "Where there is muck there is gold";  //которые будем сравнивать

        String [] strArr1 = str1.split(" "); //Переводим их
        String [] strArr2 = str2.split(" "); //в массивы

        Arrays.sort(strArr1); //отсортировываем
        Arrays.sort(strArr2); //массивы

        Boolean result = Arrays.equals(strArr1,strArr2); // сравниавем массивы

        if (result == true){
            System.out.print("Одна строка является перестановкой другой.");
        }
        else
            System.out.print("Одна строка не является перестановкой другой.");


    }
}
