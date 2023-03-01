

public class Main {
    public static void main(String[] args) {
        int a[] = {10,1,3,2,5,6,454,43,2,3,4,51,23,23};
        int[][] b = { {1, 2}, {3, 4} };
        int[][] c = { {5, 6}, {7, 8}};


        Algorim algorim = new Algorim();
       //algorim.SortarePrinInsertie(a);
//        algorim.sortarePrinSelctiaMinimului(a);
//        for(int i = 0; i < a.length; ++i){
//            System.out.print(+a[i]+ " ");
//        }
    //   System.out.println("\nCalculul CMMDC cu Euclid:  "+algorim.Euclid(4,8));
     // System.out.println("Termenul n al sirului Fibbonaci varianta recursiva:  "+ algorim.FIBO_R(5));
     //  System.out.println("Termenul n al sirului Fibbonaci varianta iterativa:  "+ algorim.FIBO_I(5));
        System.out.println("Inmultirea Rose pentru 52 si 15:  "+algorim.ROSSE(52,15));
        int d[][] = algorim.produsMatrici(b,c);
        for(int i = 0; i < 2; ++i){
            System.out.println();
            for(int j = 0; j < 2; ++j){
                System.out.print(d[i][j] + " ");
            }

        }
    }
}