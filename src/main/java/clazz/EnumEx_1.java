package clazz;

public class EnumEx_1 {

    public static void main(String[] args) {
        int price = 10000;

        EnumService enumService = new EnumService();
        int basic = enumService.discount(Grade.Basic, price);
        int gold = enumService.discount(Grade.Gold, price);
        int diamond = enumService.discount(Grade.Diamond, price);

        System.out.println("Basic: " + basic);
        System.out.println("gold = " + gold);
        System.out.println("diamond = " + diamond);
    }
}
