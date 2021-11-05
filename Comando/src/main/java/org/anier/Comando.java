package org.anier;

public interface Comando {
    void setReunion(Reunion reunion);
    Reunion getReunion();
    void ejecutar(String param);
}
