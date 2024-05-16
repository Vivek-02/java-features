package graphs;

import java.util.ArrayList;
import java.util.List;

public class Graph {

    public static void main(String[] args) {
        int[] arr = {1,3,3};
        Graph g = new Graph();
        int[] res = g.findTwoElement(arr, 3);
        System.out.println(res[0]+" - "+res[1]);
    }

    int[] findTwoElement(int arr[], int n) {
        // code here
        int[] res = new int[2];

        for (int i = 0; i < n; i++) {
            int abs_val = Math.abs(arr[i]);
            if (arr[abs_val - 1] > 0)
                arr[abs_val - 1] = -arr[abs_val - 1];
            else
                res[0] = abs_val;
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] > 0)
                res[1] = i+1;
        }

        return res;
    }


}
