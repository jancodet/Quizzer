package group.utils;

public class Main {

    public static Control control;

    public static void main(String[] args) {
        control = new Control();

        Question q = Utils.getQuestion();
        System.out.println(q.getId());

    }

}
