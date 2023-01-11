package Imprecao;

public class HP implements Impressora {
    public void  imprimir(Imprimivel imprimivel){
        System.out.println("*************************");
        System.out.println("nota fiscal - loja xxptg");
        System.out.println(imprimivel.getCabrcalhoNF());
        System.out.println(imprimivel.getCorpoNF());
        System.out.println("impressora no HP");
    }

}
