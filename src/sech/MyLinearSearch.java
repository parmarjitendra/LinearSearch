package sech;

public class MyLinearSearch {
    public int[] arr;

    public MyLinearSearch(int[] arr) {
        this.arr = arr;
    }

    public boolean LinearSearch(int SearchElement) {
        //step 1
        boolean found = false;
        //step 2
        for (int i = 0; i < arr.length; i++) {
            //step 3
            if (SearchElement == arr[i]) {
                //step 4
                found = true;
                //step 5
                break;
            }
        }
        //step 6
        return found;
    }

    public static void main(String[] args) {
        int[] arr = {25, 8, 2, 60, 10, 15, 5,60};
        MyLinearSearch obj = new MyLinearSearch(arr);
        int SearchElement = 60;
        boolean result = obj.LinearSearch(SearchElement);
        if (result) {
            System.out.println("found");
        } else {
            System.out.println("not found");
        }
    }
}
