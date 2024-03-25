package java_practice;

import java.util.Arrays;

public class Java20240312Array {

    public static void main(String[] args) {
        int [] arr = new int [] {1, 2, 8, 3, 2, 2, 2, 5, 1}; //arr 배열의 길이 9
        int [] fr = new int [arr.length]; //fr 배열의 길이도 9
        int visited = -1;
        for(int i = 0; i < arr.length; i++){
            if (fr[i] == visited) {
                continue;
            }
            int count = 1;
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    count++;
                    fr[j] = visited;

                }
            }
              if(fr[i] != visited)
                fr[i] = count;

            System.out.println(Arrays.toString(fr));
        }

        for(int i = 0; i < fr.length; i++){
            if(fr[i] != visited)
                System.out.println("    " + arr[i] + "    |    " + fr[i]);

        }
    }
}
