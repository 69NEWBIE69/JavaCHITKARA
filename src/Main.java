import java.util.Scanner;

class Main
{
    static void insertionSort(int arr[], int n)
    { Scanner sc=new Scanner(System.in);
        if (n <= 1)                             //passes are done
        {
            return;
        }

        insertionSort( arr, n-1 );        //one element sorted, sort the remaining array

        int last = arr[n-1];                        //last element of the array
        int j = n-2;                                //correct index of last element of the array

        while (j >= 0 && arr[j] > last)                 //find the correct index of the last element
        {
            arr[j+1] = arr[j];                          //shift section of sorted elements upwards by one element if correct index isn't found
            j--;
        }
        arr[j+1] = last;                            //set the last element at its correct index
    }

    public void display(int arr[])                 //display the array
    {
        for (int i=0; i<arr.length; ++i)
        {
            System.out.print(arr[i]+" ");
        }
    }


    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int arr[] = new int[10];
        for (int i=0; i<arr.length; ++i)
        {
           arr[i]=sc.nextInt();
        }
        insertionSort(arr, arr.length);
        Sort ob = new Sort();
      //  display(arr);
    }

}