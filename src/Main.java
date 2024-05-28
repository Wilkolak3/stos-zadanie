public class Main {
    public static void main(String[] args) {
        Stos stos = new Stos();
        stos.push(0);

        System.out.println(stos.top());
        System.out.println(stos.pop());
        System.out.println(stos.isEmpty());
    }
}