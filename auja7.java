public class auja7 {
     public static void main(String[] args){
        msg("amapa",2);
        System.out.println(soma(5,8,9,4));

     }
     public static int soma(int... numeros){
        int res=0;
        for(int n:numeros){
            res+=n;
        }
        return res;
     }
     public static double soma(double... numeros){
         double res=0.0;
         for(double n:numeros){
             res+=n;
         }
         return res;
     }
     public static void msg(String m,int l){
         for(int i=0;i<l;i++){
         System.out.println(m);
         }
     }
}
