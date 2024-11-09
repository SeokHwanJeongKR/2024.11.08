package clazz;

import java.util.Arrays;

public class EnumMehodMain {

    

    public static void main(String[] args) {
        //모든 Enum 반환
        Grade[] values = Grade.values();
        System.out.println("values = " + Arrays.toString(values));

        for (Grade value : values) {
            System.out.println("name : " + value.name() +
                    ", ordinal : " + value.ordinal());

        }

    }
}
