package week5;

public class faktorial06 {
    public int nilai;

    // // for loop
    // public int faktorialBF(int n) {
    //     int fakto = 1;
    //     for (int i = 1; i <= n; i++) {
    //         fakto *= i;
    //     }
    //     return fakto;
    // }

    // while loop
    public int faktorialBF(int n) {
        int fakto = 1;
        int i = 1;
        while (i <= n) {
          fakto *= i;
          i++;
        }
        return fakto;
      }      

    public int faktorialDC(int n) {
        if (n==1) {
            return 1;
        } else {
            int fakto = n * faktorialDC(n-1);
            return fakto;
        }
    }
}
