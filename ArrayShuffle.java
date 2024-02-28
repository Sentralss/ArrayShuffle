import java.util.Arrays;
public class ArrayShuffle
{
    public static void main(String[] args)
    {
        int[] APEx1 = {10,20,30,40,50,60,70,80};
        System.out.println("before shuffle APEx1 = "+Arrays.toString(APEx1));
        int[] shuffledAPEx1 = shuffle(APEx1);
        System.out.println("after shuffle APEx1 = "+Arrays.toString(shuffledAPEx1));
        int[] APEx2 = {10,20,30,40,50,60,70};
        System.out.println("before shuffle APEx2 = "+Arrays.toString(APEx2));
        int[] shuffledAPEx2 = shuffle(APEx2);
        System.out.println("after shuffle APEx2 = "+Arrays.toString(shuffledAPEx2));
        int[] arr1 = {1,3,5,7,9,2,4,6,8,10};
        System.out.println("before shuffle arr1 = "+Arrays.toString(arr1));
        int[] shuffledArr1 = shuffle(arr1);
        System.out.println("after shuffle arr1 = "+Arrays.toString(shuffledArr1));
    }
    public static int[] shuffle(int[] arr)
    {
        int[] retArr = new int[arr.length];
        //your shuffle code goes here
        int n = arr.length;
            for(int i = 0; i < retArr.length / 2; i++){
                retArr[2 * i] = arr[i];
                retArr[2 * i + 1] = arr[ i + n/2];
            }
            retArr[n-1] = arr[n-1];
        
        return retArr;
    }
}
