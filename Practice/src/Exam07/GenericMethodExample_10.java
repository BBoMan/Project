package Exam07;

public class GenericMethodExample_10 {
    public static <T> GStack_09<T> reverse(GStack_09<T> a) {
        GStack_09<T> s = new GStack_09<T>();
        while (true) {
            T tmp;
            tmp = a.pop();
            if (tmp==null)
                break;
            else
                s.push(tmp);
        }
        return s; // 새 스택을 반환
    }
    public static void main(String[] args) {
        GStack_09<Double> gs =
                new GStack_09<Double>();
        for (int i=0; i<5; i++) {
            gs.push(new Double(i));
        }
        gs = reverse(gs);
        for (int i=0; i<5; i++) {
            System.out.println(gs.pop());
        }
    }
}
