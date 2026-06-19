public class Paciente {
    private String nombre;
    private int dni;
    private int edad;
    private double peso;
    private boolean estaHospitalizado;

    public Paciente(String nombre, int dni, int edad, double peso, boolean estaHospitalizado) {
        this.nombre = nombre;
        this.dni = dni;
        this.edad = edad;
        this.peso = peso;
        this.estaHospitalizado = estaHospitalizado;
    }

    public String getnombre() {
        return nombre;
    }

    public int getdni() {
        return dni;
    }

    public int getEdad() {
        return edad;
    }

    public double getpeso() {
        return peso;
    }

    public boolean isEstaHospitalizado() {
        return estaHospitalizado;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + " Dni: " + dni + " Edad: " + edad + " Peso: " + peso + " Esta Hospitalizdo: "
                + (estaHospitalizado ? "SI" : "NO");
    }
}