public class PlanoOperadora {
    public static void main(String[] args) {

        //A estrutura switch compara o valor de cada caso com o da variavel sequencialmente

        //O comando break quando executado, encerra a execucao da estrutura onde ele se encontra

        //Se usar o switch case, sempre inserir o break

        
        String plano = "M";
        //Exempro sem break

        switch ( plano ){
            case "B": {
                System.out.println("100 min para ligacoes");
            }

            case "M": {
                System.out.println("Whats e Instagram gratis");
            }

            case "T":{
                System.out.println("5GB de Youtube");
            }
        }

            //Exemplo com break

             switch ( plano ){
            case "B": {
                System.out.println("100 min para ligacoes");
                break;
            } 

            case "M": {
                System.out.println("Whats e Instagram gratis");
                break;
            }

            case "T":{
                System.out.println("5GB de Youtube");
                break;
            }
        }
    }
}

