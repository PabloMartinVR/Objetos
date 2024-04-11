public class AppAlumno {
    public static void main(String[] args) {
        Alumno Pablo = new Alumno("Pablo","Velasco",185);
        System.out.println("Referencia Pablo"+Pablo);
        Alumno Paco = new Alumno("Pablo","Velasco",185);


        if (Pablo.equals(Paco)){
            System.out.println("Es igual");
        }
        else {
            System.out.println("No es igual");
        }

        String ss= "Pablo";

        if (Pablo.equals(ss)){
            System.out.println("Es igual");
        }
        else {
            System.out.println("No es igual");
        }



    }
}