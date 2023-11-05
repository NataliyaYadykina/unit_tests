package homework.hw6;

import java.util.List;

public class NumListsProgram {
    NumbersList list1;
    NumbersList list2;

    public NumListsProgram(NumbersList list1, NumbersList list2) {
        this.list1 = list1;
        this.list2 = list2;
    }

    public double calculateNumListAverage(NumbersList numbersList) {
        List<Integer> numList = numbersList.getNumList();
        int sum = 0;
        if (!numList.isEmpty()) {
            for(Integer number: numList) {
                sum += number;
            }
            return (double) sum /  numList.size();
        } else {
            throw new ArithmeticException("Массив пустой. Невозможно найти среднее (делить на 0 нельзя).");
        }
    }

    public String twoListAverageCompare(double average1, double average2) {
        String result = "";
        if (average1 > average2) {
            result = "Первый список имеет большее среднее значение";
        } else if (average1 < average2) {
            result = "Второй список имеет большее среднее значение";
        } else {
            result = "Средние значения равны";
        }
        return result;
    }

}
