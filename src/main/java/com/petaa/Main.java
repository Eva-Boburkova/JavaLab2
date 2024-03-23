package com.petaa;

import java.util.Optional;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите арифметическое выражение");
        String exp = sc.nextLine();

        Optional<Solution> optionalSolution = Optional.empty();

        try {
            optionalSolution = Optional.of(new Solution(exp));
        }
        catch (RuntimeException e){
            System.out.println(e.getMessage());
        }

        if(optionalSolution.isPresent()){
            Solution sln = optionalSolution.get();
            System.out.printf("%s = %f", exp, sln.solve());
        }
    }
}
