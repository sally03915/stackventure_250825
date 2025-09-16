---

<!-- _class: aqua -->
// 과제 1: Hello World 출력하기
public class A001 {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}

---

<!-- _class: aqua -->
// 과제 2: 자기소개 출력하기
public class A002 {
    public static void main(String[] args) {
        System.out.println("이름: 홍길동");
        System.out.println("나이: 20");
    }
}

---

<!-- _class: aqua -->
// 과제 3: 줄 바꾸기 출력하기
public class A003 {
    public static void main(String[] args) {
        System.out.println("첫째 줄\n둘째 줄\n셋째 줄");
    }
}

---

<!-- _class: aqua -->
// 과제 4: 탭으로 정렬하기
public class A004 {
    public static void main(String[] args) {
        System.out.println("이름\t나이\t지역");
        System.out.println("철수\t12\t서울");
        System.out.println("영희\t13\t부산");
    }
}

---

<!-- _class: aqua -->
// 과제 5: 덧셈 결과 출력하기
public class A005 {
    public static void main(String[] args) {
        System.out.println("10 + 20 = " + (10 + 20));
    }
}

---

<!-- _class: aqua -->
// 과제 6: 문자열 덧셈 실험
public class A006 {
    public static void main(String[] args) {
        System.out.println("10 + 20 = " + "10" + "20");
    }
}

---

<!-- _class: aqua -->
// 과제 7: 형식 지정 출력하기
public class A007 {
    public static void main(String[] args) {
        System.out.printf("%-10s %5d\n", "Apple", 100);
        System.out.printf("%-10s %5d\n", "Banana", 250);
    }
}

---

<!-- _class: aqua -->
// 과제 8: 출력 순서 실험하기
public class A008 {
    public static void main(String[] args) {
        System.out.println("첫 번째 줄");
        System.out.println("두 번째 줄");
        System.out.println("세 번째 줄");
    }
}

---

<!-- _class: aqua -->
// 과제 9: 컴파일 오류 실험하기
// ※ 아래 코드는 오류를 발생시키는 예제입니다.
public class A009 {
    public static void main(String[] args) {
        System.out.println("이 줄은 출력돼요") // ← 세미콜론 누락
        System.out.println("이 줄은 오류나요");
    }
}

---

<!-- _class: aqua -->
// 과제 10: 여러 줄 출력 연습
public class A010 {
    public static void main(String[] args) {
        System.out.println("안녕하세요!");
        System.out.println("자바를 시작합니다.");
        System.out.println("열심히 해봐요!");
    }
}
