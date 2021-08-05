import java.io.*;

public class DelDuplicate_Array {
    public static void main(String args[]) throws IOException
    {
        System.out.print("Enter limit : ");
        BufferedReader l = new BufferedReader(new InputStreamReader(System.in));
        int lim = Integer.parseInt(l.readLine());
        int myArray[] = new int[lim];

        for(int i = 0; i < lim; i++)
        {
            int input = Integer.parseInt(l.readLine());
            myArray[i] = input;
        }

        for(int i = 0; i < lim; i++)
        {
            int c = 0;
            for(int j = 0; j < lim; j++)
            {
                if(myArray[j] == myArray[i])
                {
                    c++;
                }
                if(c>1)
                {
                    myArray[j] = 0;
                    c = 0;
                }
            }
        }

        int len = 0;
        for(int val:myArray)
        {
            if(val != 0)
            {
                len++;
            }
        }

        int a[] = new int[len];
        int count = 0;
        for(int i = 0; i < lim; i++)
        {
            if(myArray[i] != 0)
            {
                a[count] = myArray[i];
                count++;
            }
        }

        myArray = a;

        System.out.println();
        for(int val : myArray)
        {
            System.out.print(val + " ");
        }
    }
}
