package Task4.Ex1;

/*
В английском тексте каждую букву заменить ее порядковым номером в алфавите.
При выводе в одной строке печатать текст с двумя пробелами между буквами,
в следующей строке внизу под каждой буквой печатать ее номер.
 */

public class Main {
    public static void main(String[] args) {

        String str = "Where there is muck there is brass".replace(" ", "").toLowerCase(); // Создали строку, убрали из неё пробелы и сделали все буквы одного размера (строчными).
        char[] strToChar = str.toCharArray();// Перевели строку с текстом в массив , для дальнейшего сопостовления с массивом алфавита.
        int[] index = new int[strToChar.length];// Создали массив для индекса букв текста.
        char[] AlfaArray = new char[26];
        for (int i = 0; i < AlfaArray.length; i++) {
            AlfaArray[i] = (char) (97 + i); // Создали и заполнили массив алфавита.
        }
        for (int i = 0; i < strToChar.length; i++) {     //Заполнили массив index
            for (int j = 0; j < AlfaArray.length; j++) { //порядковыми номерами
                if (AlfaArray[j] == strToChar[i]) {      //букв текста
                    index[i] = (AlfaArray[j] - 96);
                }
            }
        }

        for (int i = 0; i < strToChar.length; i++) {
            System.out.printf("%3c", strToChar[i]);

        }
        System.out.println();

        for (int i = 0; i < index.length;i++){
            System.out.printf("%3d", index[i]);
        }
    }
}
