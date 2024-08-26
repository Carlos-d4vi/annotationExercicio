import Domain.MinhaClasse;
import Domain.Tabela;


public class Main {
    public static void main(String[] args) {
        try{
            Class<?> clazz = MinhaClasse.class;

            if (clazz.isAnnotationPresent(Tabela.class)){
                Tabela tabela = clazz.getAnnotation(Tabela.class);

                String nomeDaTabela = tabela.nomeDaTabela();

                System.out.println("Nome da tabela: " + nomeDaTabela);
            }else{
                System.out.println("A classe não está anotada com @Tabela");
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
