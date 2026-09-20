import java.util.ArrayList;

public class Persona{
    
    private String nombre;
    
    private String codLicencia;
    
    private ArrayList<Mascota> misMascotas;
    
    public Persona(String nombre, String codLicencia){
        
        this.nombre = nombre;
        
        this.codLicencia = codLicencia;
        
        this.misMascotas =new ArrayList<Mascota>();
        
    }
    public void asignarMascota(Mascota mascota){
        misMascotas.add(mascota);
    }
    
    
    public String consultarNombreMisMascotas(){
        if (misMascotas.isEmpty()){//verifica si esta vacia
            return "No hay mascotas asignadas";
        
        }
        String resultado = "";
        for (int i = 0; i<misMascotas.size(); i++){
            resultado += misMascotas.get(i).getNombre();
            if(i<misMascotas.size()-1){
                resultado += ",";
            }
        }
        return resultado;
    }
    
    public String getNombre(){
        return nombre;
    }
    public String codigoLicencia(){
        return codLicencia;
    }
    public String toString(){
        return "Persona:" + nombre +
               ", Licencia:"+ codLicencia +
                ",Mascotas asignadas:" + consultarNombreMisMascotas();
    }
}

     
        
        
    

    
