package TEST;

public class soal2D {

    public static void main(String[] args) {
        int n = 5;
        int value = 1;
        int flag = 1;
        int [][] arrVal = new int[n][n];

        while(value<=(n*n)){
            for (int j=0;j<n;j++){
                if(flag%2==1){
                    for (int k=0;k<n;k++){
                        arrVal[k][j] = value;
                        value++;
                    }
                    flag++;
                } else if(flag%2==0){
                    for (int k=n-1;k>=0;k--){
                        arrVal[k][j] = value;
                        value++;
                    }
                    flag++;
                }

            }
        }

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(arrVal[i][j]+"\t\t");
            }
            System.out.println();
        }
    }

}
