public class Main {
    public static void main(String[] args) {

        String[][] DatosP = {
                { "Aaron", "40111222", "22", "72.5", "true" },
                { "Samuel", "47999111", "19", "58.0", "false" },
                { "Valentino", "56222333", "12", "81.3", "true" },
                { "Sasha ", "48888777", "19", "64.7", "false" },
                { "Jazmin", "50000555", "17", "90.1", "true" },
                { "Sophia ", "96777111", "17", "55.9", "false" },
                { "Octavio", "51333999", "17", "70.4", "true" },
                { "Julieta", "36666444", "15", "62.2", "false" },
                { "Benjamin", "38555111", "35", "85.0", "true" },
                { "Daniel", "50111999", "17", "59.6", "false" },
                { "Kim", "51888222", "16", "77.8", "true" },
                { "Eric", "51222666", "16", "54.3", "false" },
                { "Benito", "51999444", "16", "88.5", "true" },
                { "Gustavo", "26444777", "43", "61.1", "false" },
                { "Jose", "23777888", "54", "92.4", "true" }
        };

        RegistroP miRegistroP = new RegistroP();

        for (int i = 0; i < DatosP.length; i++) {
            String nombre = DatosP[i][0];
            int dni = Integer.parseInt(DatosP[i][1]);
            int edad = Integer.parseInt(DatosP[i][2]);
            double peso = Double.parseDouble(DatosP[i][3]);
            Boolean estaHospitalizado = Boolean.parseBoolean(DatosP[i][4]);

            Paciente nuevoP = new Paciente(nombre, dni, edad, peso, estaHospitalizado);

            miRegistroP.agregarPaciente(nuevoP);
        }

        miRegistroP.TodosLosPacientesH();
        System.out.println();

        miRegistroP.TodosLosPacientes();
        System.out.println();

        miRegistroP.TotalDePacientesR();
        System.out.println();

        miRegistroP.MostrarPacientes4y12();
        System.out.println();

    }
}
