import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    //atributos
    private List<Item> itemList;
    //construtor
    public CarrinhoDeCompras() {
      this.itemList = new ArrayList<>();
    }
    
    //método para calcular valor total dos itens utilizando o Stream API
    public double calcularValorTotal() {
      if (itemList.isEmpty()) {
        throw new RuntimeException("A lista está vazia!");
      }
      return itemList.stream()
          .mapToDouble(item -> item.getPreco() * item.getQuant())
          .sum();
    }
  }