public class Average_num {
    public static void main(String[]args){
        int age[] = {26,24,30,42,54,28,22,67};
        int length =  age.length;
        float avg,sum = 0;

        for (int i : age){
            sum+=i;
        }

        avg = sum/length;

        System.out.println("Avg num is:" + avg);
    }
}
