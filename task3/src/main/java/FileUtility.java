import java.io.*;
import java.util.*;

public class FileUtility {

    /*
     * Структура файла ввода: в первой строке одно целое число - N
     * далее следует N целых чисел через пробел
     * Метод должен отсортировать элементы с четным значением,
     * а нечетные оставить на своих местах и вывести результат через пробел в файл вывода
     * Пример:
     * in:
     * 5
     * 5 4 2 1 3    // 2 4
     * out:
     * 5 2 4 1 3
     */
    public void sortEvenElements(File in, File out) {
        int [] arr = new int[]{4, 8, 5, 7, 10, 9, 7, 12, 11, 14};
        List<Integer> odd = new ArrayList<Integer>();
        List<Integer> even = new ArrayList<Integer>();
        for (int i : arr) {
            if ((i & 1) == 1) {
                odd.add(i);
            } else {
                even.add(i);
            }
        }
        Collections.sort(odd);
        Collections.sort(even);
        System.out.println("Odd:" + odd);
        System.out.println("Even:" + even);


        /*
         * Генератор паролей, пароль должен отвечать требованиям:
         * длина не менее 6 и не более 12, включает минимум по одному символу
         * из наборов: a-z, A-Z, 0-9, {*,!,%}
         * все пароли должны быть разными
         * На вход метод получает файл с логинами пользователей
         * Метод должен записать в файл вывода записи с логинами и паролями
         * для каждого пользователя
         */

        public void passwordGen (File in, File out){
            //TODO
        }

        /*
         *  Метод должен дописать в переданный файл все
         * записи из списка по одной записи в строке
         * */
        public void appender (File file, List < String > records){

        }

        /*
         * Метод возвращает список из N последних строк файла
         * строки можно дополнять пробелами до длины 80
         * тогда количество символов в файле будет предсказуемо
         * 10 строк это ровно 800 символов
         * Изучите класс RandomAccessFile для эффективного решения данной
         * задачи
         * Альтернативное решение: использование очереди или стека
         * */
        public List<String> getNString (String pathToFile,int n){
            //TODO
            return null;
        }

    }
