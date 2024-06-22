import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;

public class OrdenacaoPessoa {
    //atributo
    private List<Pessoa> pessoaList;
  
    //construtor
    public OrdenacaoPessoa() {
      this.pessoaList = new ArrayList<>();
    }
  
    public List<Pessoa> ordenarPorAltura() {
      if (!pessoaList.isEmpty()) {
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
        pessoasPorAltura.sort(Comparator.comparingDouble(Pessoa::getAltura));
        return pessoasPorAltura;
      } else {
        throw new RuntimeException("A lista está vazia!");
      }
    }
  }