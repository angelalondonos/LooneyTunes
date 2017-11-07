package co.edu.uniquindio.android.electiva.looneytunes.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;

import java.util.Locale;

/**
 *
 * Utilidad que permite hacer cambio de idioma desde la misma app
 * @author Angela Londoño
 * @author Rodrigo Ramirez
 * @author Cristian Agudelo
 */

public class Utilidades {

    /**
     * Atributos estaticos donde se asignan los lengujaes disponbles
     */
    public final static String MIS_PREFERENCIAS = "MisPreferencias";
    public final static String LENGUAJE_DE_PREFERENCIA = "languaje_preferences";
    public final static String LENGUAJE_ES = "es";
    public final static String LENGUAJE_EN = "en";

    /**
     * Método que permite combia de idioma de Español a Ingles o viceversa
     * @param context
     */
    public static void cambiarIdioma(Context context){
        SharedPreferences prefs = context.getSharedPreferences(MIS_PREFERENCIAS, context.MODE_PRIVATE);
        String language = prefs.getString(LENGUAJE_DE_PREFERENCIA, LENGUAJE_ES);
        if(language.equals(LENGUAJE_ES)){
            language = LENGUAJE_EN;
        }
        else if(language.equals(LENGUAJE_EN)){
            language = LENGUAJE_ES;
        }
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString(LENGUAJE_DE_PREFERENCIA, language);
        editor.commit();
        obtenerLenguaje(context);
    }

    /**
     * Método que permte obtner el lenguaje seleccionado
     * @param context
     */
    @SuppressWarnings("deprecation")
    public static void obtenerLenguaje(Context context) {
        SharedPreferences prefs = context.getSharedPreferences(MIS_PREFERENCIAS, context.MODE_PRIVATE);
        String language = prefs.getString(LENGUAJE_DE_PREFERENCIA, LENGUAJE_ES);
        Locale locale = new Locale(language);
        Locale.setDefault(locale);
        Configuration config = new Configuration();
        config.locale = locale;
        context.getApplicationContext().getResources().updateConfiguration(config, null);
    }
}
