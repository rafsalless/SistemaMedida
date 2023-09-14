public class LacosRepeticao {
    
    public static void main(String[] args) {
        
        //Comando FOR: permite que uma variavel seja testada e incrementada ate que a condi;ão seja verdadeira

        //exemplo FOR
        for ( int carneirinhos = 1; carneirinhos <= 20; carneirinhos ++){
            System.out.println("Contando carneirinhos " + carneirinhos);
        }


        //Array: conjunto de elementos de um tipo correpondente 
        //exemplo For Array
         String alunos [] = {"Felipe" , "Mario" , "Julia"};

         for (int x=0; x < alunos.length; x++){
            System.out.println("O aluno no indice x=" + x + "e" + alunos [ x ]  );
         }
         //ou

         String alunas [] = {"Rafaela" , "Bruna" , "Natalia" , "Mariana"};
                
         for (String aluna : alunas ){
            System.out.println("O nome da aluna é: " + aluna);
         }
    }
}
