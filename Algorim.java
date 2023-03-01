import java.util.ArrayList;

public class Algorim {

    public void SortarePrinInsertie(int a[]){
        int key;
        int j;
        for(int i = 1; i < a.length;++i){
            key = a[i];
            j = i -1;
            while(j >= 0 && a[j] > key){
                a[j + 1] = a[j];
                j = j-1;
            }
            a[j + 1] = key;
        }
    }

    public void sortarePrinSelctiaMinimului(int a[]){
        int minj;
        int minx;
        for(int i = 0; i < a.length - 1; ++i){
            minj = i;
            minx = a[i];
            for(int j = i +1; j < a.length; ++j){
                if(a[j] < minx){
                    minj = j;
                    minx = a[j];
                }
            }
            a[minj] = a[i];
            a[i] = minx;
        }
    }

    public int Euclid(int m, int n){
        int temp;
        while(n != 0){
            temp = n;
            n = m%n;
            m = temp;
        }
        return m;
    }

    public int FIBO_R(int n){
           if(n < 2){
               return n;
           } else {
               return FIBO_R(n - 1) + FIBO_R(n -2);
           }
    }

    public int FIBO_I(int n){
        int i = 0;
        int s = 1;
        int j = 1;
        for(int k = 0; k < n; ++k){
            i = j;
            j = s;
            s = i+j;
        }
        return i;
    }

    public int[][] produsMatrici(int a[][], int b[][]){
        int m = a.length;
        int c[][] = new int[m][a[0].length];
        for(int i = 0; i < m; ++i){
            for(int j = 0; j < m; ++j){
                for(int k = 0; k < m; ++ k){
                    c[i][j] = c[i][j] + a[i][k] * b[k][j];
                }
            }
        }
        return c;
    }

    public int ROSSE(int a, int b){
        ArrayList<Integer> X = new ArrayList<>();
        ArrayList<Integer> Y = new ArrayList<>();
        int prod = 0;
        X.add(Integer.valueOf(a));
        Y.add(Integer.valueOf(b));
        int i = 0;

        while (X.get(i).intValue() > 1){
            X.add(X.get(i)/2 );
            Y.add(Y.get(i) + Y.get(i));
            ++i;
        }
        while (i > 0){
            if(X.get(i).intValue()%2 == 1){
                prod +=Y.get(i).intValue();
            }
            i--;
        }
return prod;
    }
}
