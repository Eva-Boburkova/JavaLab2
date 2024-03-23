package com.petaa;

/**
 * Утилитарный класс для решения задачи
 * @author Ева Б.
 */
public class Solution {
    private String exp;

    /**
     * Конструктор с проверкой на корректность
     * @param exp выражение в текстовой форме
     */
    public Solution(String exp){
        checkExp();
        this.exp = exp;
    }

    /**
     * Проверка на корректность
     */
    private void checkExp(){
        //TODO написать проверки: 1. несоответствие скобок 2.два знака подряд 3.пробел между числами
    }

    /**
     * Функция для решения заданного выражения
     * @return Числовое значение выражения
     */
    public float solve(){
        float result = 0;
        //TODO написать решение. строка -> стек -> ычисление
        return result;
    }
}
