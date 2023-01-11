public class App {
    public static void main(String[] args) throws Exception {

        Questions newQuestion = new Questions();
        Subjects newSubjects = new Subjects();

        System.out.println(newQuestion.getQuestion());

        System.out.println(newSubjects.getSubject());

        newQuestion.setQuestion("Qual a cor do cavalo branco de napoleão?");
        newSubjects.setSubject("História");

        System.out.println(newQuestion.getQuestion());

        System.out.println(newSubjects.getSubject());
    }
}
