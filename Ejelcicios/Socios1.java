import java.util.*;

public class Socios1 {
    protected int IDSocio;
    protected int NroSocio;
    protected String Nombre;
    public List<Reserva1> reservas;

    public Socios1(int IDSocio, int NroSocio, String Nombre) {
        this.IDSocio = IDSocio;
        this.NroSocio = NroSocio;
        this.Nombre = Nombre;
        this.reservas = new ArrayList<>();
    }

    public void AñadirReserva(Reserva1 r) {
        reservas.add(r);
    }
}
