package com.petaa;

import java.util.Stack;

/**
 * Утилитарный класс для решения задачи
 * @author Ева Б.
 */
public class Solution {
    private String exp;
    private final String OPS = "+-/*";

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
     * @throws RuntimeException при некорректном выражении
     */
    private void checkExp(){
        //TODO написать проверки: 1. несоответствие скобок 2.два знака подряд 3.пробел между числами
        boolean isValid = true;
        //..

        if(!isValid)
            throw new RuntimeException("Expression is invalid");
    }

    /**
     * Функция для решения заданного выражения
     * @return Числовое значение выражения
     */
    public float solve(){
        float result = 0;
        Stack<Character> cup = new Stack<>();
        boolean isInBraces = false;
        boolean isSign = false;

        for(int i = 0; i < exp.length(); i++)
        {
            cup.add(exp.charAt(i));
            if(cup.peek() == '('){
                isInBraces = true;
            }
            if(cup.peek() == ')' && isInBraces) {
                cup.pop(); //убрали только что сунутую )
                int a = 0;
                int b = 0;
                int n = 0; //разряд цифры
                while(cup.peek() != '('){
                    char c = cup.pop();
                    if(OPS.indexOf(c) != -1){
                        isSign = true;
                        n = 0;
                        b = a;
                        a = 0;
                        continue;
                    }

                    a += (int) ((int) c * Math.pow(10, n));
                    n++;
                }
            }
        }

        return result;
    }
}
