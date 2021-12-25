public class Jo {
    private final int maxVidas=3;
    private int vidas = 0;
    private int num=0;
    public Jo(int num){
        this.vidas=1;
        this.num=num;
        System.out.printf("Jogador número %d criado%n",num);
    }
    public int getVidas(){
        return this.vidas;
    }

    public void addVidas(){
        if( this.vidas < maxVidas ){
            this.vidas++;
        }
    }
}
