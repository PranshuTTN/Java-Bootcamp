public class question4 {
    public static void main(String[] args){
        int arr[][]={{1,2,3},{7,8,9}};
        for(int i=0;i< arr.length;i++){
            int sum=0;
            for(int j=0;j< arr[0].length;j++){
                sum+=arr[i][j];
            }
            System.out.println("Row Sum " + i + " : " + sum);
        }
        for(int i=0;i<arr[0].length;i++){
            int sum=0;
            for(int j=0;j< arr.length;j++){
                sum+=arr[j][i];
            }
            System.out.println(("Col Sum " + i + " : " + sum));
        }
    }
}
