public class Alumno {
    private String nombre;
    private String curso;
    private int    altura;

    /**
     * @param nombre el nombre del alumno
     * @param curso  El curso del alumno
     * @param altura Lo que mide el alumno
     */

    public Alumno(String nombre, String curso, int altura){
        this.nombre = nombre;
        this.curso  = curso;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCurso() {
        return curso;
    }

    public int getAltura() {
        return altura;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public boolean equals(Object obj){
        // obj.getNombre NO Funciona porque obj es Object
        // aunque apunte al objeto Alumno pasado

        if (obj == null){
            return false;
        }
        boolean ret= false;

        if (obj instanceof Alumno){  // Si lo que yo llamo es un alumno hace todo normal, nos devuelve false
            // Casting es lo que se debe hacer para que funcione
            Alumno alumno = (Alumno) obj;
            String nombre1 = alumno.getNombre();
            String nombre2 = this.getNombre();
            if (nombre1.equals(nombre2)) {
                ret = true;
            }
        }
        return ret;
    }



    public String toString(){
        String str = ": \n    Nombre ----> ["+getNombre()+"] \n    Curso  ----> ["+getCurso()+"] \n"+    "    Altura ----> ["+getAltura()+"]";
        return str;
    }

}
