public class VotingAge {
    static void voting(int age) {
        if (age >= 18) {
            System.out.println("They are allowed to vote!");
        } else {
            System.out.println("They are not allowed to vote");
        }
    }

    public static void main(String[] args) {
        voting(19);
    }
}
