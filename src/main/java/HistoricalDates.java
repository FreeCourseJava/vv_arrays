package main.java;
/*
        soure: http://www.tataroved.ru/calendar/
        5 ноября 1804 г. Александр I подписал Утвердительную Грамоту Казанского Императорского университета и его Устав
        1787 г. – в типографии Академии наук в Петербурге впервые в России напечатан полный арабский текст Корана
        632 г. – появление в Причерноморье Великой Болгарии во главе с Кубрат-ханом после распада Западно-тюркского каганата
        1552 г. – завоевание Казанского ханства
        902 г. – организация чеканки монет в Волжско-Камской Булгарии (в городах Сувар и Булгар)
        1542 г. – появление большого рукописного математического трактата Мухитдина Мухаммада, который свидетельствует о высоком развитии математического образования в Казанском ханстве
        8 сентября 1380 г. – Куликовская битва против узурпатора власти в Золотой Орде Мамая
        1862 г. – издание первого «Букваря для крещеных татар»
        2 сентября 1905 г. – выход в Санкт-Петербурге татарской газеты «Нур» (под редакцией Гатауллы Баязитова)
        1437 г. – утверждение хана Улуг-Мухаммада в Казани и появление Казанского ханства
        15 августа 1905 г. – начало первого Всероссийского съезда мусульман в Нижнем Новгороде
        1269 г. – на курултае в долине реки Талас Менгу-Тимур заключает пакт о ненападении с угедейским правителем Кайду и чагатайским правителем Бараком
        552 г. – возникновение письменности в Тюркском каганате
        1801 г. – издание Корана в Казани.
        1236 г. – Батый хан, внук Чингизхана, в городе Булгар основывает свою ставку, которая становится первой столицей Золотой Орды до постройки на Нижней Волге города Сарая.
        1224 г. – возникновение Улуса Джучи (Золотой Орды) – великой тюрко-татарской державы в составе Монгольской империи.
        25 июня 1920 г. – создание Татарской Автономной Советской Социалистической Республики (ТАССР).
        17 июня 1773 г. – Екатериной II подписан Указ «О терпимости всех вероисповеданий и о запрещении архиереям вступать в дела, касающиеся до иноверных исповеданий и до построения по их закону молитвенных домов, предоставляя все сие светским начальствам».
        12 июня 1991 г. – избрание Президентом Республики Татарстан М.Ш.Шаймиева.
        552 г. – тюрки образовывают Первый Тюркский каганат.
*/

import java.util.Arrays;

public class HistoricalDates {
    public static void main(String[] args) {

        int[] dates = new int[20];

        dates[0] = 1804;
        dates[1] = 1787;
        dates[2] = 632;
        dates[3] = 1552;
        dates[4] = 902;
        dates[5] = 1542;
        dates[6] = 1380;
        dates[7] = 1862;
        dates[8] = 1905;
        dates[9] = 1437;
        dates[10] = 1905;
        dates[11] = 1269;
        dates[12] = 552;
        dates[13] = 1801;
        dates[14] = 1236;
        dates[15] = 1224;
        dates[16] = 1920;
        dates[17] = 1773;
        dates[18] = 1991;
        dates[19] = 552;

        System.out.println("Dates order before sorting:");
        System.out.println(Arrays.toString(dates) + "\n");

        dates=bubbleSort(dates);

        System.out.println("Dates order after sorting:");
        System.out.println(Arrays.toString(dates) + "\n");

        System.out.println("Is 552 in the array ? \n" + (isElement(dates,552) ? "yes": "no") + "\n");
        System.out.println("Is 1991 in the array ? \n" + (isElement(dates,1991) ? "yes": "no")+ "\n");
        System.out.println("Is 1380 in the array ? \n" + (isElement(dates,1380) ? "yes": "no")+ "\n");

        System.out.println("Is 554 in the array ? \n" + (isElement(dates,554) ? "yes": "no")+ "\n");
        System.out.println("Is 551 in the array ? \n" + (isElement(dates,551) ? "yes": "no")+ "\n");
        System.out.println("Is 2222 in the array ? \n" + (isElement(dates,2222) ? "yes": "no")+ "\n");
        System.out.println("Is 1381 in the array ? \n" + (isElement(dates,1381) ? "yes": "no")+ "\n");
        System.out.println("Is 1992 in the array ? \n" + (isElement(dates,1992) ? "yes": "no")+ "\n");

    }


/*  Составить массив из значимых годов Республики Татартсан (любые 20),
    добавить их в массив в рандомном порядке,
    написать метод, принимающий массив годов (интов)
    и возвращающий их в отсортированном порядке.
    Сортировку реализовать методом bubble sort (пузырьковая сортировка).
 */
    private static int[] bubbleSort(int[] array) {
        int[] sortedArray = array.clone();
        for (int i = 1; i < sortedArray.length; i++) {
            for (int j = 1; j <= sortedArray.length - i; j++) {
                if (sortedArray[j-1] > sortedArray[j]) {
                    int tmp = sortedArray[j-1];
                    sortedArray[j-1] = sortedArray[j];
                    sortedArray[j] = tmp;
                }
            }
        }
        return sortedArray;
    }

/*  Написать метод, который на вход принимает
    отсортированный массив годов (из 2-го задания) и произвольный год,
    возвращает boolean значение, которое означает
    наличие или отсутствие даты в переданном массиве.
    Читаем и используем binary search (бинарный поиск).
*/
    private static boolean isElement(int[] array, int year) {
        int first = 0;
        int last = array.length;

        for (;first < last;) {
            int mid = first + (last - first) / 2;
            if (array[mid] == year) {
                return true;
            }
            if (array[mid] > year) {
                last = mid -1;
            } else {
                first = mid +1;
            }
        }

        return false;
    }
}
