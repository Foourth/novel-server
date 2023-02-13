package io.ispacc.novelserver;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
public class DemoTest {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] arrCopy = copyOfRange(arr, 0, 2);
        for (int i : arrCopy) {
            System.out.print(i + " ");
        }
    }

    @Test
    void method1() {
        int num1 = 10;
        int num2 = num1 << 1;
        int num3 = num2 >>> 1;
        System.out.println(num3);
    }

    static int[] copyOfRange(int[] arr, int from, int to) {
        int[] res = new int[to - from];
        for (int i = 0; i <= res.length; i++) {
            res[i] = arr[from++];
        }
        return res;
    }

    @Test
    void method2() {
        String str = "123";
        String str1 = Integer.valueOf(123).toString();
        System.out.println(str.equals(str1));
    }
}

