import java.util.Random;

public class IOHelper {
    public int saveRandomNumber(){
        Random rn = new Random();
        int i = rn.nextInt(-1000,1000);
        return i;
    }

    public int CountUpNumberDrawn(int numDrawn){
        int n = Integer.bitCount(numDrawn);
        return n;
    }

    public int[] writeArrayMultipleOfN(int n) {
        int count = 0;
        for(int i = 0; i < Short.MAX_VALUE - 1; i++){
            if(i % n == 0){
                count++;
            }
        }
        int[] m1 = new int[count]; // 32767
        int counterMas = 0;
        for (int i = 1; i < Short.MAX_VALUE; i++){
            if (i % n == 0){
                m1[counterMas] = i;
                counterMas++;
            }
        }
        return m1;
    }

    public int[] writeArrayNon_multiplesOfN(int n){
        int count = 0;
        for(int i = Short.MIN_VALUE; i < 0; i++){
            if(i % n != 0){
                count++;
            }
        }
        int[] mas = new int[count];
        int counterMas = 0;
        for (int i = Short.MIN_VALUE; i < 0; i++){
            if(i % n != 0){
                mas[counterMas] = i;
                counterMas++;
            }
        }
        return mas;
    }
}
