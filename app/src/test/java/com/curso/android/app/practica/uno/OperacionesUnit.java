package com.curso.android.app.practica.uno;

import org.junit.Test;

import static org.junit.Assert.*;

import Clases.Operaciones;

public class OperacionesUnit {

    Operaciones op = new Operaciones();
    @Test
    public void valores_iguales()
    {

        assertEquals(true, op.compararValores("prueba1","PRUEBA1"));
    }
    @Test
    public void valores_no_iguales()
    {
        assertNotEquals(true, op.compararValores("prueba2","prueba1"));
    }

}
