import java.time.Year;

public class Mascota{
    
    private String nombre ;
    
    private String raza;
    
    private int anioNacimiento ;
    
    private Persona veterinario;
    
    
    public Mascota(String nombre,String raza){
        this(nombre,raza, 0);
    }
    public Mascota(String nombre,String raza,int anioNacimiento){
        
        this.nombre = nombre;
        this.raza = raza;
        this.anioNacimiento = anioNacimiento;
    }
    public String getNombre(){
        return nombre;
    }
    
    public String consultarNombreVeterinario(){
        
        if(veterinario ==null){
            return "No hay veterinario asignado";
        }
        return veterinario.getNombre();
    }
    public void asignarVeterinario(Persona veterinario){
        this.veterinario = veterinario;
        
    }
    
    public int getAnio(){
        
        return anioNacimiento;
    }
    private int calcularAnioActual(){
        int anioActual = Year.now().getValue();
        return anioActual;
        
        
    }
    private int calcularEdadCanina(){
        if (anioNacimiento <=0){
            return 0;
        }
        //año actual
        return calcularAnioActual() - anioNacimiento;
        
    }
    private int calcularEdadHumana(){
        return calcularEdadCanina()*7;
    }
    public String toString(){
        return "Mascota:"+ nombre+
               ",Raza" + raza +
               ", Año nacimiento" + anioNacimiento +
               ",Edad Canina" + calcularEdadCanina() +
               ", Edad humana" + calcularEdadHumana();
    }
    
    
    

   
}