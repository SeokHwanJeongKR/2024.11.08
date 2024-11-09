package enumSoloPractice;

import java.sql.SQLOutput;
import java.util.Scanner;

public class CoffeeTypeMain {
    public static void main(String[] args) {
        Discount discounts = new Discount();
        Scanner input = new Scanner(System.in);


        System.out.print("어떤 커피를 주문하시겠습니까?");
        String coffeeType = input
                .nextLine()
                .toUpperCase()
                .trim();

        CoffeeType selectedCoffee;
        try {
            selectedCoffee = CoffeeType.valueOf(coffeeType);
        } catch (IllegalArgumentException e) {
            System.out.println("제대로 된 커피를 선택 해주세요");
            input.close();
            return;
        }

        System.out.print("할인 코드를 적용하시겟습니까?");
        String discountCode = input
                .nextLine()
                .toUpperCase()
                .trim();

        int originalPrice = selectedCoffee.getCoffeePrice();
        int discountPrice = 0;
        int TotalPrice = originalPrice + discountPrice;

        if (discountCode.equals("DISCOUNT10")) {
            discountPrice = discounts.discount(selectedCoffee);
        } else {
            System.out.println("등록되지 않은 쿠폰입니다");
        }

        System.out.println("커피 가격 : " + originalPrice + "원");
        System.out.println("할인 가격 : " + discountPrice + "원");
        System.out.println("----------------------------------");
        System.out.println("커피 가격 : " + TotalPrice + "원");
    }





}
