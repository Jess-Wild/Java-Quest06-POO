public class Classroom {
    public static void main(String[] args) {
        Wilder JeanClaude = new Wilder("Jean-Claude", true);
        Wilder Toto = new Wilder("Toto", false);

        System.out.println(JeanClaude.whoAmI());
        System.out.println(Toto.whoAmI());
    }
}
