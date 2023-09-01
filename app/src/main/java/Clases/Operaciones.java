package Clases;

import android.widget.EditText;
import android.widget.TextView;

public class Operaciones {

    public void limpiarComponentes(EditText etPrimero, EditText etSegundo, TextView tvMostrar)
    {
        etPrimero.setText("");
        etSegundo.setText("");
        tvMostrar.setText("");
    }
    public Boolean compararValores(String valorPrimario, String valorSecundario)
    {

        if(valorPrimario.equalsIgnoreCase(valorSecundario))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
