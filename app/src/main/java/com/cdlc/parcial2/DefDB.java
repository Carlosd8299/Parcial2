package com.cdlc.parcial2;

public class DefDB {
    public static final String nameDb = "Registro";
    public static final String tabla_est = "persona";
    public static final String col_codigo = "codigo";
    public static final String col_nombre = "nombre";
    public static final String col_estrato = "estrato";
    public static final String col_salario = "salario";
    public static final String col_nivelEducativo = "nivelEducativo";



    public static final String create_tabla_paciente = "CREATE TABLE IF NOT EXISTS persona(" +
            "  codigo text primary key," +
            "  nombre text," +
            "  salario real," +
            "  estrato integer," +
            "  nivelEducativo text" +
            ");";
}
