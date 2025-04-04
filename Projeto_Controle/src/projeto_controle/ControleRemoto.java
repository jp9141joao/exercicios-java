
package projeto_controle;

public class ControleRemoto implements Controlador {
    
    private int volume;
    private boolean ligado;
    private boolean tocando;
    
    public ControleRemoto(){
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }
    
    private int getVolume(){
        return this.volume;
    }
    
    private void setVolume(int v){
        this.volume = v;
    }
    
    private boolean getLigado(){
        return this.ligado;
    }
    
    private void setLigado(boolean l){
        this.ligado = l;
    }
    
    private boolean getTocando(){
        return this.tocando;
    }
    
    private void setTocando(boolean t){
        this.tocando = t;
    }

    @Override
    public void ligar() {
        if(this.getLigado()){
            System.out.println("Não é possivel ligar pois a TV já está ligado!");
        }else{
            this.setLigado(true);
        }
}

    @Override
    public void desligar() {
        if(this.getLigado() == false){
            System.out.println("Não é possivel desligar pois a TV já está desligado!");
        }else{
            this.setLigado(false);
        }
}

    @Override
    public void abrirMenu() {
        System.out.println("* Menu *\nLigado: " + this.getLigado() + "\nTocando: " + this.getTocando() + "\nVolume: ");
        for(int i = 0; i <= this.getVolume(); i += 10){
            System.out.print("|");
        }
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando menu!");
    }

    @Override
    public void aumentarVolume() {
        if(!this.getLigado()){
            System.out.println("Não é possivel aumentar o volume pois a TV esta desligada");
        }else if(this.getVolume() >= 100){
            System.out.println("Não é possivel aumentar o volume pois a TV esta ano volume maximo");
        }else{
            this.setVolume(this.getVolume() + 10);
        }
    }

    @Override
    public void diminuirVolume() {
        if(!this.getLigado()){
            System.out.println("Não é possivel aumentar o diminuir pois a TV esta desligada");
        }else if(this.getVolume() <= 0){
            System.out.println("Não é possivel diminuir o volume pois a TV esta desligada");
        }else{
            this.setVolume(this.getVolume() - 10);
        }
    }

    @Override
    public void ligarMudo() {
        if(!this.getLigado()){
            System.out.println("Não é possivel mutar pois a TV esta desligada");
        }else if(this.getVolume() == 0){
            System.out.println("Não é possivel mutar pois a TV já esta no mudo");
        }else{
            this.setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if(!this.getLigado()){
            System.out.println("Não é possivel desmutar pois a TV esta desligado");
        }else if(this.getVolume() > 0){
            System.out.println("Não é possivel desmutar a TV pois ja esta desmutada");
        }else{
            this.setVolume(this.getVolume() + 50);
        }
    }

    @Override
    public void play() {
        if(!this.getLigado()){
            System.out.println("Não é possivel dar play pois a TV esta desligada");
        }else if(this.getTocando()){
            System.out.println("Não é possivel dar play pois ela ja esta no play");
        }else{
            this.setTocando(true);
        }
    }

    @Override
    public void pause() {
        if(!this.getLigado()){
            System.out.println("Não é possivel dar play pois a TV esta desligada");
        }else if(!this.getTocando()){
            System.out.println("Não é possivel dar play pois ela ja esta no play");
        }else{
            this.setTocando(false);
        }
    }
    
}
