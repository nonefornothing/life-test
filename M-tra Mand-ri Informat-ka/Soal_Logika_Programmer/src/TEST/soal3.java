package TEST;

/*
    optimaze bubble sort
*/

public class soal3 {

    public static void main(String[] args) {

        int[] arr = new int[]{12,9,13,6,10,4,7,2,16};
        int temp = 0;
        int n = (arr.length)-1;
        boolean swap = false;

        for(int i=0;i<n;i++){
            swap = false;
            for(int j=0;j<n-i;j++){
                if(arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap = true;
                }
            }
            if (swap = false){
                break;
            }
        }

        for (int i=0;i<=n;i++){
            System.out.println(arr[i]);
        }

    }

}
