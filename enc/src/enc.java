public class enc {
    public static void main(String[] args){
        persona persona = new persona();

        persona.setEdad(30);
        persona.setNombre("Matias");
        persona.setTelefono(111222333);

        System.out.println(persona.getEdad());
        System.out.println(persona.getNombre());
        System.out.println(persona.getTelefono());
    }

    class persona {
        private int edad;
        private String nombre;
        private int telefono;

        public void setEdad(int edad){
            this.edad = edad;
        }

        public void setNombre(String nombre){
            this.nombre = nombre;
        }

        public void setTelefono(int telefono){
            this.telefono = telefono;
        }

        public int getEdad(){
            return this.edad;
        }

        public String getNombre(){
            return this.nombre;
        }

        public int getTelefono(){
            return this.telefono;
        }
    }
}