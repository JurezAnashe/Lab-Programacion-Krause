public interface contratable {
    void liquidarHonorarios(double impuestos) throws IllegalArgumentException;

    void asignarEscenario(String nombreEscenario) throws NullPointerException;
}