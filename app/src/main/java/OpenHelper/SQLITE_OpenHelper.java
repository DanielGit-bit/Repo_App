package OpenHelper;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.view.View;

import androidx.annotation.Nullable;

public class SQLITE_OpenHelper extends SQLiteOpenHelper {
    public SQLITE_OpenHelper(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String query="CREATE TABLE usuarios(ID integer primary key autoincrement," +
                "Nombre text,Apellido text,Telefono text,Correo text,Contraseña text)";
        db.execSQL(query);


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {


    }

    //METODO ABRIR BASE DE DATOS
    public void abrir(){
        this.getWritableDatabase();
    }


    //METODO CERRAR BASE DE DATOS
    public void cerrar(){
        this.close();
    }


    //METODO QUE INSERTA REGISTRO EN LA TABLA USUARIOS
    public void insertarReg (String nombre,String apellido,String telefono,String correo,String contraseña){
        ContentValues valores=new ContentValues();
        valores.put("Nombre",nombre);
        valores.put("Apellido",apellido);
        valores.put("Telefono",telefono);
        valores.put("Correo",correo);
        valores.put("Contraseña",contraseña);
        this.getWritableDatabase().insert("usuarios",null,valores);

    }
}

