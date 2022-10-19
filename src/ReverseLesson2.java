public class ReverseLesson2 {
    public int[] Reverse(int[] array){
        for (int i = 0; i < array.length / 2; i++){
            int a = 0;
            int b = array.length - 1;
            while (a < b) {
                int tmp = array[a];
                array[a] = array[b];
                array[b] = tmp;
                a ++;
                b --;
            }
        }
        return array;

    }
}
