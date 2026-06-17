import java.util.Arrays;

public class ArrayClass {
    public static void main(String[] args) {

        int num[] = new int[5];

         num[0]=2;
         num[1]=4;
         num[2]=5;
         num[3]=6;
         num[4]=7;
        System.out.println(num[1]);

        for(int i=0;i<=num.length-1;i++)
        {

                System.out.println(num[i]);
        }
        System.out.println("===============");
        Arrays.sort(num);
        for(int i=0;i<=num.length-1;i++)
        {

            System.out.println(num[i]);
        }
        System.out.println("====================");
        for(int j= num.length-1;j>=0;j--)
        {
            System.out.println(num[j]);
        }

        System.out.println("=========Multi dimension");
        int n[][]= new int[3][3];
        n[0][0]=2;
        n[0][1]=4;
        n[0][2]=5;
        n[1][0]=4;
        n[1][1]=5;
        n[1][2]=8;
        n[2][0]=9;
        n[2][1]=8;
        n[2][2]=2;
        n[3][0]=7;


        for(int i=0;i<=n.length-1;i++)
        {
            for(int j=0;j<=n.length-1;j++)
            {
                System.out.print(n[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("=================");
        String subject[][] = {{"ab", "bc", "cd"}, {"de", "ef", "fg"}};

        for(int i=0;i<=subject.length-1;i++)
        {
            for(int j=0;j<=subject[i].length-1;j++)
            {
                System.out.print(subject[i][j]+ " ");
            }
            System.out.println();
        }

        System.out.println("=======================");
        char classRooms[]={'a','b','c','d','e'};

        for(int i=0;i<=classRooms.length-1;i++)
        {
            System.out.println(classRooms[i]);
        }

        Arrays.sort(classRooms);
        System.out.println("=================");
        for(int i=0;i<=classRooms.length-1;i++)
        {
            System.out.println(classRooms[i]);
        }

        // String st[]= {"dfd","dsfds","dfdsf","sfds"};
        //System.out.println(st[3]);

    }
}
