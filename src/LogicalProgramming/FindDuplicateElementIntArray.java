package LogicalProgramming;

public class FindDuplicateElementIntArray {
    public static void main(String[] args) {

        int arr[]={1, 2, 3, 1, 3, 5, 4, 4, 1, 4, 6};

        int count=0;
        for(int i =0;i<=arr.length-1;i++)
        {
            for(int j=i+1;j<=arr.length-1;j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("Duplicate found "+arr[i]);
                    count++;
                }
            }
        }
        System.out.println("Total duplicate numbers are " +count);
    }
}
