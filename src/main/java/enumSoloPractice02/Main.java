package enumSoloPractice02;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> booklist = new ArrayList<>();
        Collections.addAll(booklist, "a", "b", "c", "d");

        Scanner sc = new Scanner(System.in);

        BookType Booktype;


        System.out.print("어떤 책을 빌리시겠습니까? : ");
        String selectedBook = sc
                .nextLine()
                .trim();

        if (booklist.contains(selectedBook)) {
            System.out.println("책 대여가 가능합니다.");
            try {
                System.out.print("책의 타입이 어떻게 되시나요? (REGULAR, PREMIUM, EXCLUSIVE): ");
                Booktype = BookType.valueOf(sc.nextLine().toUpperCase().trim());
                System.out.println("책 대여 가능 일은 " + Booktype.getHowLongPassiableBorrow() +" 일 입니다.");
            } catch (IllegalArgumentException e) {
                System.out.println("타입에 없는 책 입니다.");
            }
        } else {
            System.out.println("책 대여가 불가능 합니다");
        }



    }



}
