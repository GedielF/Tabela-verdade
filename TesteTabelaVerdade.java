package tabelaverdade;

public class TesteTabelaVerdade {

    public static void main(String[] args) {
/* ultilizando operadores logicos para fazer tabelas-verdades
*  a saida mostra uma expressao booleana com seu resultado 
*  ultilizando o especificador (%b) para exibir palavra "true" ou false"
*/
// cria a tabela-verdade para o operador && (E condicional)
        System.out.printf("\"%s%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n%n",
                "Conditional AND (&&)","false && false", (false && false),
                "false && true" , (false&& true), 
                "true && false" , (true && false),
                "true && true"  , (true && true));
        
//criar a tabela-verdade para o operador || (OU condicional)
        System.out.printf("\"%s%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n%n",
                "Conditional OR (||)", "false || false", (false || false),
                "false|| true"  , (false|| true),
                "true || false" , (true || true),
                "true || true " , (true || true));

//criar a tabela-verdade para o operador & (E logico Booleano)
        System.out.printf("\"%s%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n%n",
                "Boolean logica AND(&)","false & false", (false & false),
                "false & true" , (false& true),
                "true & false" , (true & false),
                "true & true"  , (true & true));
        
 // criar a tabela-verdade para o operador | (OU inclusivo lógico booleano)
        System.out.printf("\"%s%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n%n",
                "Boolean logica incluide OR (|)","false | false",(false | false),
                "false| true"  , (false| true),
                "true | false" , (true | false),
                "true | true"  , (true | true));
        
// criar a tabela-verdade para o operardor ^(OU inclusivo lógico booleano))
        System.out.printf("\"%s%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n%n",
                "Boolean logica  incluide OR (^)","false ^ false",(false ^ false),                
                "false^ true"  , (false^ true),
                "true ^ false" , (true ^ false),
                "true ^ true"  , (true ^ true));
        
// cria a tabela-verdade para o operador ! (negação lógica)
        System.out.printf("%s%n%s: %b%n%s: %b%n", "Logical NOT (!)",
                "!false", (!false), "!true", (!true));
                }
    
}
