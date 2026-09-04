package src;

import src.Service.EstudianteService;

public class Main {

    public static void main(String[] args) {

        EstudianteService service = new EstudianteService();

        service.Registrar("Lucas", "Juarez", 1, "primero");
        service.Registrar("Torres", "Kim", 2, "segundo");
        service.Registrar("Lisandro", "Sadañoski", 3, "tercero");
        service.Registrar("Sophia", "Uribe", 4, "cuarto");
        service.Registrar("Diego", "Rondal", 5, "quinto");
        service.Registrar("Santiago", "Rodriguez", 6, "sexto");
        service.Registrar("Junior", "Lavado", 7, "primero");
        service.Registrar("Octavio", "Pagni", 8, "segundo");
        service.Registrar("Luca", "Caprio", 9, "tercero");
        service.Registrar("Juan", "Suarez", 10, "cuarto");

        System.out.println("Usuarios registrados:");
        service.ListarTodo();

        service.Eliminar(4);
        service.Actualizar(6, "Chowey", "Morrel", 11, "primero");
        service.Actualizar(8, "Santiago", "Molina", 12, "segundo");

        System.out.println("Usuarios actualizados:");
        service.ListarTodo();

    }
}