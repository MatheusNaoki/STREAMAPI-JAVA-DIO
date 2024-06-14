package functional_interface.examples;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SupplierExample 
{
    public static void main(String[] args) 
    {
        //Usar o Supplier com expressão lambda para fornecer uma saudacao personalizada
        Supplier<String> saudacao = () -> "Olá, seja bem vindo(a)";

        //Usar o Supplier para obter uma lista com 5 saudações
        //Pode aplicar o supplier diretamente
        List<String> listaSaudacoes = Stream.generate(() -> "Olá seja bem vindo(a)").limit(5).collect(Collectors.toList());

        //Imprimir saudações geradas
        listaSaudacoes.forEach(System.out::println);
    }
}
