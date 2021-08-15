package TEST;

public class soal2A {

    public static void main(String[] args) {
        int n = 5;
        int value = 1;
        for (int i=value; i<=n; i++){
            for (int j=i; j>=1; j--){
                System.out.print(i);
            }
            System.out.println();
        }
    }

}
