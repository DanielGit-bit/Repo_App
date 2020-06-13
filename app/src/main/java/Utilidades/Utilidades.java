package Utilidades;

public class Utilidades {
    //CONSTANTES CAMPOS TABLA USUARIO
    public static final String Tabla_usuario="usuario";
    public static final String CAMPO_ID="id";
    public static final String CAMPO_NOMBRE="nombre";
    public static final String CAMPO_APELLIDO="apellido";
    public static final String CAMPO_TELEFONO="telefono";
    public static final String CAMPO_CORREO="correo";
    public static final String CAMPO_CONTRASENA="contraseña";

    public static final String TABLA_USUARIO="CREATE TABLE "+Tabla_usuario+" ("+CAMPO_ID+" INTEGER,"+CAMPO_NOMBRE+" TEXT, "+CAMPO_APELLIDO+" TEXT, "+CAMPO_TELEFONO+" TEXT,"+CAMPO_CORREO+" TEXT,"+CAMPO_CONTRASENA+" TEXT)";
}
