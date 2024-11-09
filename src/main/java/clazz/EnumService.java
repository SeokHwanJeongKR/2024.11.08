package clazz;

public class   EnumService {

    public int discount(Grade grade, int price) {
        int discountPercent = 0;

        if (grade.equals(grade.Basic)) {
            discountPercent = 10;
        } else if (grade.equals(grade.Gold)) {
            discountPercent = 20;
        } else if (grade.equals(grade.Diamond)) {
            discountPercent = 30;
        } else {
            System.out.println(grade + "할인 X");
        }

        return price * discountPercent / 100;
    }
}
