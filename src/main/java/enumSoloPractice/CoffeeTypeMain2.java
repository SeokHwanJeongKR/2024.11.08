package enumSoloPractice;

import java.util.Scanner;

public class CoffeeTypeMain2 {
    public static void main(String[] args) {
        Discount discounts = new Discount();
        Scanner input = new Scanner(System.in);



        System.out.print("어떤 커피를 주문하시겟습니까? : ");
        String selectedCoffee = input
                .nextLine()
                .toUpperCase()
                .trim();


        CoffeeType ct;
        try {
             ct = CoffeeType.valueOf(selectedCoffee);
        } catch (IllegalArgumentException e) {
            System.out.println("등록된 커피가 없습니다");

            input.close();
            return;
        }

        System.out.print("할인 코드를 등록 하시겠습니까? :");
        String discountCode = input
                .nextLine()
                .toUpperCase()
                .trim();

        int BasicPrice = ct.getCoffeePrice();
        int DiscountPrice = 0;
        int TotalPrice = BasicPrice - DiscountPrice;

        if (discountCode.equals("DISCOUNT10")) {
            DiscountPrice = discounts.discount(ct);

        } else  {
            System.out.println("등록되지 않은 쿠폰입니다");
        }

        System.out.println("커피 가격 : " + BasicPrice + "원");
        System.out.println("할인 가격 : " + DiscountPrice + "원");
        System.out.println("----------------------------------");
        System.out.println("커피 가격 : " + TotalPrice + "원");
    }

}
