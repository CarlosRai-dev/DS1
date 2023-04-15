
package endereco;

import java.time.LocalDate;
import java.time.Month;


public class Main {
    public static void main(String[] args) {
        
        Funcionario funcionario = new Funcionario("2113144563", "14452354653", LocalDate.of(2004, Month.SEPTEMBER, 18), 82500, 2500, "Carlos Raí", Genero.MASCULINO, 
                    new Endereco("Alto da terezinha", "181", "Casa", "40711320", "Salvador", "BA"));       
    
    Juridica juridica = new Juridica("213654103", "145145631", LocalDate.of(2015, Month.MARCH, 20), LocalDate.of(2022, Month.MARCH, 10), 2500000, 10150, "Jessica", Genero.FEMININO, 
            new endereco.Endereco("alto da terezinha", "181", "casa", "40711320", "Salvador", "BA"));

        System.out.println(funcionario.toString());
        System.out.println(juridica.toString());
    
}
}