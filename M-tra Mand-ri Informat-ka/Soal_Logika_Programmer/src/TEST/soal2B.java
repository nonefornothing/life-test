package TEST;

public class soal2B {

    public static void main(String[] args) {
        int n = 5;
        int value = 1;
        for (int i=value; i<=n; i++){
            for (int j=i; j>=1; j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }

}
