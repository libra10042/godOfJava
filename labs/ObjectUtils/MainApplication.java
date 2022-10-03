package labs.ObjectUtils;

import org.apache.commons.lang3.ObjectUtils;

public class MainApplication {

    public static void main(String[] args) {

        // null
        Object obj = null;
        System.out.println(ObjectUtils.isEmpty(obj));

        // 빈값
        obj = "";
        System.out.println(ObjectUtils.isEmpty(obj));

        // 빈배열
        obj = new String[]{};
        System.out.println(ObjectUtils.isEmpty(obj));

        // 인스턴스 생성
        obj = new Object();
        System.out.println(ObjectUtils.isEmpty(obj));

        // 문자열
        obj = "abc";
        System.out.println(ObjectUtils.isEmpty(obj));

        // 숫자
        obj = "123";
        System.out.println(ObjectUtils.isEmpty(obj));


    }
}
