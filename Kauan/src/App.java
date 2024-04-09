public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

    
    // %s - subistitui no texto um valor string 
    System.out.printf("vai imprimir %s. %s %s\n", "um texto"; "quaquer");

    // %d - subistitui o coringa %d por um numeor inteiro no texto 
    System.out.printf("minha idade e: %d", 33);

    // %f - subistitui o coringa %f por um numero flutuante 
    System.out.printf("\nO valor de pi é: %f" , 3.1415f);

    // %.2f - subistitui o coringa %.2f por um numeor flutuante 
    // com duas casas decimais 
    System.out.printf("\nO valor de pi é: %.2f" , 3.1415);

    // %b - subistitui o coringa %b por um valor booleano
    System.out.printf("\nEsse valor é %b" , true );
    System.out.printf("\nEsse valor é %b" , false );

    // %c - subistitui o coringa %c por um caractere 
    System.out.printf("nO caractere é: %c" , 'A');
    System.out.printf("nO caractere é: %c" , '5');
    System.out.printf("nO caractere é: %c" , '*');
    System.out.printf("nO caractere é: %c" , '\\');
    System.out.printf("nO caractere é: %c" , '\"');

    // printf com todos os tipos usando variaveis 
    String texto = "alguma coisa" ;
    int numerointeiro = 1;
    float numeroquebrado = 123.232f;
    boolean valoresverdadeiros = true;
    char umCaractere = 'º'


    }

}
