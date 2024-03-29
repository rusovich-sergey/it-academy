package Chapter_5_1;

/*
Раздел 5.3

Задание 5:
Создать массив, заполнить его случайными элементами, распечатать, перевернуть, и снова распечатать (при переворачивании нежелательно создавать еще один массив).

Замечание: речь не идет о распечатке массива задом наперед. Следует переставить элементы массива в нем самом.
Т.е. если изначально массив из 10 элементов и в нулевом лежало значение 10 а в девятом 3, то после перестановки в нулевом должно быть 3 а в девятом 10 и т.д.
 */

public class ArrayPrint {
    public static void main (String[] args) {
        int size = 11;
        int[] array = new int [size];
        int temp;
        String arrayPrint = "";

        for (int i = 0; i < array.length; i++) {   //генерируем массив
            array[i] = (int) (Math.random()*100) + 1;
            arrayPrint += array[i] + " ";           //сразу записываем все значения в строку
        }

        System.out.println("Сгенерированный массив - " + arrayPrint);    //выводим полученный массив

        arrayPrint = "";                                                  //затираем строку

        for (int i = 0; i < (array.length/2); i++) {    //меняем местави значения
            temp = array[i];                               //во временную переменную записываем значение нулевого элемента
            array[i] = array[array.length - 1 - i];     //в нулевой элемент записываем данные из последнего элемента
            array[array.length - 1 - i] = temp;             //в последний элемент записываем данные из временной переменной
        }

        for (int i = 0; i < array.length; i++)              //записывем значения нового массива в строку
            arrayPrint += array[i] + " ";

        System.out.println ("Перевернутый массив - " + arrayPrint);      //выводим на консоль отсортированный массив
    }
}
