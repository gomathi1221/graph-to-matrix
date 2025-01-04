class Main {
    public static void matadd(int[][] mat,int i,int j){
        mat[i][j]=1;
        mat[j][i]=1;
    }
    public static void display(int[][] mat){
        for(int[] row:mat){
            for(int val:row){
                System.out.print(val+" ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        int v=4;
       int[][] mat=new int[v][v];
       matadd(mat,0,1);
       matadd(mat,1,2);
       matadd(mat,1,3);
       matadd(mat,2,3);
       System.out.println("matrix representation:");
       System.out.println();
       display(mat);
       
    }
}