import org.example.Pedido;
import org.example.Practica1.Producto;

import java.time.LocalDate;
import java.util.ArrayList;

public class PedidosService {
    ArrayList<Pedido> pedidos = new ArrayList<>();

    public void guardarPedido(String producto, LocalDate fechaPedido, double precio) {
        pedidos.add(new Pedido(producto,fechaPedido,precio));
    }

    public Pedido pedidoMasReciente() {
        if (pedidos.isEmpty()) {
            return null;
        }

        Pedido masReciente = pedidos.get(0);
        for (Pedido p : pedidos) {
            if (p.getFechaPedido().compareTo(masReciente.getFechaPedido()) > 0) {
                masReciente = p;
            }
        }

        return masReciente;
    }

    public ArrayList<Pedido> pedidosPrecioMax(double precio) {
        ArrayList<Pedido> resultado = new ArrayList<>();

        for (Pedido p : pedidos) {
            if (p.getPrecio() <= precio) {
                resultado.add(p);
            }
        }

        return resultado;
    }
}
