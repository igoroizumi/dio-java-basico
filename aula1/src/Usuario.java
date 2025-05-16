public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        System.out.println("A Tv está ligada ? " + smartTv.ligada);
        System.out.println("Canal Atual " + smartTv.canal);
        System.out.println("Volume Atual " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo Status -" + "A Tv está ligada ? " + smartTv.ligada);
        
        smartTv.desligar();
        System.out.println("Novo Status -" + "A Tv está ligada ? " + smartTv.ligada);

        smartTv.aumentarVolume();
        

        smartTv.diminuirVolume();

        smartTv.mudarCanal(17);
        System.out.println("Canal Atual " + smartTv.canal);

        smartTv.aumentarCanal();
        System.out.println("Canal Atual " + smartTv.canal);

        smartTv.diminuirCanal();
        System.out.println("Canal Atual " + smartTv.canal);
        





    }
    
}
