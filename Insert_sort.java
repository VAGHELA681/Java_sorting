public class InsertionSort {
    public static void main(String[] args) {

        int[] arr = {5, 3, 8, 1, 2};

        for (int i = 1; i < arr.length; i++) {

            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

    //variable 
    //Index:  0  1  2  3  4
//Value:  5  3  8  1  2
           // ↑
            //i=1

//j = i-1 = 0
//↑
//j=0

//Step  શું થાય છે?  Value
//1     i = 1     i = 1 
//2     key = arr[i] એટલે key = 3   key = 3
//3     j = i - 1 એટલે j = 0        j = 0
//4     j >= 0 check કરીએ           0 >= 0 → સાચું ✅
//5     arr[j] > key check કરીએ.    5 > 3 → સાચું ✅
//6     એટલે while અંદર જઈએ.         -
//7     arr[j + 1] = arr[j]        arr[1] = arr[0]
//8     એટલે 5 ને એક સ્થાન જમણે ખસેડીએ   5 5 8 1 2
//9     j-- કરીએ.                    j = -1
//10    ફરી j >= 0 check             -1 >= 0 → ખોટું ❌
//11    while બંધ થાય.               -
//12    arr[j + 1] = key            arr[0] = 3
//13    3 ને ખાલી થયેલી જગ્યાએ મૂકીએ.    3 5 8 1 2

//👉 ટૂંકમાં:
//j = 0
 //↓
//5 ને check કર્યું
 //↓
//j--
 //↓
//j = -1
 //↓
//ડાબી બાજુ હવે કંઈ નથી
//↓
//Loop Stop

//Negative side                    Positive side
   //-5   -4   -3   -2   -1    0    1    2    3    4    5
   // ●----●----●----●----●----●----●----●----●----●----●
                         //←      |      →
    
//-1       0      +1

//i = 1 → j = 0 → j = -1
//i = 2 → j = 1 → ...
//i = 3 → j = 2 → ...


//i	key	j શરૂઆતમાં	શું થાય?	Array

//1	3	0	5 > 3     → 5 shift થાય	        [3, 5, 8, 1, 2]
//2	8	1	5 > 8   false → કંઈ shift નહીં	[3, 5, 8, 1, 2]
//3	1	2	8, 5, 3         ત્રણેય shift થાય	[1, 3, 5, 8, 2]
//4	2	3	8, 5, 3         shift થાય	    [1, 2, 3, 5, 8]


