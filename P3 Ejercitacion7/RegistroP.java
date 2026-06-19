import java.util.ArrayList;

public class RegistroP {
    private ArrayList<Paciente> pacientes;

    public RegistroP() {
        this.pacientes = new ArrayList<>();
    }

    public void agregarPaciente(Paciente p) {
        pacientes.add(p);
    }

    public void TodosLosPacientesH() {
        System.out.println("Todos los pasientes en el Hospital: ");
        for (Paciente p : pacientes) {
            if (p.isEstaHospitalizado() == true) {
                System.out.println(p);
            }
        }
    }

    public void TodosLosPacientes() {
        System.out.println("Todos los pasientes: ");
        for (Paciente p : pacientes) {
            System.out.println(p);
        }
    }

    public void TotalDePacientesR() {
        int TotalPacientes = pacientes.size();
        System.out.println("Total de pacientes registrados: " + TotalPacientes);
    }

    public void MostrarPacientes4y12() {
        Paciente p4 = pacientes.get(4);
        System.out.println("Nombre: " + p4.getnombre() + " Edad: " + p4.getEdad() + " Se encuentra hospitalizado: "
                + (p4.isEstaHospitalizado() ? "SI" : "NO"));

        Paciente p12 = pacientes.get(12);
        System.out.println("Nombre: " + p12.getnombre() + " Edad: " + p12.getEdad() + " Se encuentra hospitalizado: "
                + (p12.isEstaHospitalizado() ? "SI" : "NO"));
    }
}