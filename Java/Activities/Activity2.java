package activities;

public class Activity2 {
    public static void main(String[] args){
        int[] a= {10,77,10,54,-11,10};
        int findNum=10;
        int sum=30;
        //sumoftheresult(a,findNum,sum);
        System.out.println(sumoftheresult(a,findNum,sum));

    }

    private static boolean sumoftheresult(int[] a, int findNum, int sum) {
        int temp = 0;
        for (int num : a) {
            if (num == findNum) {
                temp += findNum;
            }

            //Sum should not be more than 30
            if (temp> sum) {
                break;
            }
        }

        //Return true if condition satisfies
        return temp == sum;
    }
}
