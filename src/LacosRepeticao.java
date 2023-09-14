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

         //break e continue 

         for ( int numero = 1; numero <= 5; numero ++ ){
            if(numero == 3)
                continue; //nao para a aplica;ão por completo, mas para no ponto solicitado(no caso o numero 3)

            System.out.println(numero);
         }

         //while: enquanto uma condicão for valida, ele executa o codigo. E se a condicao for invalida, ele nao executa. 
        
        //do while: usado quando se precisa repetir um codigo, mas o do while verifica primeiro se o codigo precisa ser repetido.

         boolean condicao = false;

        while(condicao){
            System.out.println("executou ... ");
        }

            
    }
}
