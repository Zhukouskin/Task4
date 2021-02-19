package Task4.Ex2;
/*
Из небольшого текста удалить все символы, кроме пробелов, не являющиеся буквами.
 */


public class Main {
    public static void main (String[] args){


        String str = "Hello /. Java -! |";

        char [] strArray = str.toCharArray(); // Переводим строку в массив , для сортировки

        for ( int i = 0 ; i < strArray.length; i++){
            if (Character.isLetter(strArray[i]) || Character.isWhitespace(strArray[i])){ //Если символ является буквой
                System.out.print(strArray[i]);                                           //либо пробелом , то выводим его в консоль
            }
        }

    }
}

/*
Либо второй способ решения

public class Main {
    public static void main (String[] args){


        String str = "Hello /. Java -! |";
        str = str.replaceAll("[^A-Za-zА-Яа-я\\s]+","");
        System.out.println(str);

}
}
*/


