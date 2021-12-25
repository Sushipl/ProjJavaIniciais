public class auja10 {
    public static void main(String[] args){
        int num =0;
        Jo j1 = new Jo(++num); 
        Jo j2 = new Jo(++num);
        Jo j3 = new Jo(++num);
        j1.addVidas();
        System.out.printf("%nVidas do jogador 1:%d",j1.getVidas());
        System.out.printf("%nVidas do jogador 2:%d",j2.getVidas());
        System.out.printf("%nVidas do jogador 3:%d",j3.getVidas());
        
        //j1.num = 10;
        //j2.num = 5;
        //System.out.printf("%n%d",j1.num);
        //System.out.printf("%n%d",j2.num);
    }
}
