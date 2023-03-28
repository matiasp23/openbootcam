public class App {
    public static void main(String[] args) {
        
        persona persona = new persona;

        persona.setEdad(30);

        System.out.println(persona.getEdad());
    
    }

    class persona{
        private int edad;

        public void setEdad(int edad){
            this.edad = edad;
        }

        public int getEdad(){
            return this.edad;
        }
    }
}
