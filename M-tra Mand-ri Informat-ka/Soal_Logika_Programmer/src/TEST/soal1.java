package TEST;

public class soal1 {

    public static void main(String[] args) {
        int n = 15;
        int value=1;
        while(value<=n){
            if (value%3==0 && value%4==0){
                System.out.print("OKYES  ");
            }else if (value%4==0){
                System.out.print("YES  ");
            }else if (value%3==0){
                System.out.print("OK  ");
            }else{
                System.out.print(value + "  ");
            }

            value++;
        }
    }

}
