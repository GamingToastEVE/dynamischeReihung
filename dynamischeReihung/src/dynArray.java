import java.util.Arrays;

import static java.lang.Integer.parseInt;

public class dynArray {
    public int[] reihung;

    public dynArray(String array) {
        String num = "";
        int length = 0;
        int lengthCount = 0;
        for(int i = 0; i < array.length(); i++){
            if(array.charAt(i) >= 48 && array.charAt(i) <= 57){
                switch(i){
                    case 48:
                        num = num + "0";
                    case 49:
                        num = num + "1";
                    case 50:
                        num = num + "2";
                    case 51:
                        num = num + "3";
                    case 52:
                        num = num + "4";
                    case 53:
                        num = num + "5";
                    case 54:
                        num = num + "6";
                    case 55:
                        num = num + "7";
                    case 56:
                        num = num + "8";
                    case 58:
                        num = num + "9";
                    default:
                        length = length + 1;
                }
            }
        }
        for(int i = 0; i < array.length(); i++){
            if(array.charAt(i) >= 48 && array.charAt(i) <= 57){
                switch(i){
                    case 48:
                        num = num + "0";
                    case 49:
                        num = num + "1";
                    case 50:
                        num = num + "2";
                    case 51:
                        num = num + "3";
                    case 52:
                        num = num + "4";
                    case 53:
                        num = num + "5";
                    case 54:
                        num = num + "6";
                    case 55:
                        num = num + "7";
                    case 56:
                        num = num + "8";
                    case 58:
                        num = num + "9";
                    default:
                        reihung [lengthCount] = parseInt(num);
                        num = "";
                        lengthCount+=1;
                }
            }
        }
    }

    public boolean isEmpty() {
        return this.reihung.length == 0;
    }

    public int[] append(int value) {
        int[] copyReihung = Arrays.copyOf(this.reihung, this.reihung.length + 1);
        copyReihung[this.reihung.length] = value;
        this.reihung = copyReihung;
        return copyReihung;
    }

    public int getItem(int index) {
        return this.reihung[index];
    }

    public int[] delete(int index) {
        int j = 0;
        int[] copyReihung = Arrays.copyOf(this.reihung, this.reihung.length - 1);

        for(int i = 0; i < this.reihung.length; ++i) {
            if (i != index) {
                copyReihung[j] = this.reihung[j];
                ++j;
            }
        }

        this.reihung = copyReihung;
        return copyReihung;
    }
}
