package 算法.数学.待分解.丑数;

public class No263丑数 {

    public boolean isUgly(int n) {
        if (n == 0) {
            return false;
        }
        while (n != 1) {
            if (n % 5 == 0) {
                n /= 5;
            } else if (n % 3 == 0) {
                n /= 3;
            } else if (n % 2 == 0) {
                n /= 2;
            } else {
                return false;
            }
        }
        return true;
    }
}
