public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;
    
    public void aumentarVolume(){
        volume++;
    }
    public void reduzirVolume(){
        volume--;
    }
    public void ligar(){
        ligada=true;
    }
    public void desligar(){
        ligada=false;
    }
}