public class Usuario extends Persona{
    private String nombreUsuario;
    private String password;

    public Usuario(String nombre, String apellido, int edad, String cargo, Empresa empresa, String nombreUsuario,
            String password) {
        super(nombre, apellido, edad, cargo, empresa);
        this.nombreUsuario = nombreUsuario;
        this.password = password;
    }
    
    public String getNombreUsuario() {
        return nombreUsuario;
    }
    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    
}
