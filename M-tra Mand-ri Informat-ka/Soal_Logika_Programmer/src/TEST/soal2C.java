package TEST;

public class soal2C {

        public static void main(String[] args) {
            int n = 5;
            int value = 1;
            int flag = 0;
            for (int i=1; i<=n; i++){
                for (int j=i; j>=1; j--){
                    if (value==1 || value==n){
                        flag++;
                    }
                    System.out.print(value);
                    if(flag%2==1){
                        value++;
                    }
                    else if (flag%2==0){
                        value--;
                    }
                }
                System.out.println();
            }
        }
}
