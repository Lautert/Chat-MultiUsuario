package com;

import java.io.FileOutputStream;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class ChatMessage implements Serializable {
    
    // PESSOA ORIGEM
    private String name;
    // MENSAGEM
    private String text;
    // FILES
    private byte[] file;
    // PESSOA RESERVADA
    private String nameReserved;
    // USUARIOS ONLINE
    private Set<String> setOnlines = new HashSet<String>();
    // CONTROLADOR
    private Action action;
    
    public enum Action {
        CONNECT,
        DISCONNECT,
        // MENSAGEM RESERVADA
        SEND_ONE,
        SEND_FILE_ONE,
        // MENSAGEM GERAL
        SEND_ALL,
        SEND_FILE_ALL,
        // ATUALIZAR LISTA DE ONLINES
        USERS_ONLINE
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
    
    public byte[] getFile() {
        return file;
    }

    public void setFile(byte[] file) {
        this.file = file;
    }

    public String getNameReserved() {
        return nameReserved;
    }

    public void setNameReserved(String nameReserved) {
        this.nameReserved = nameReserved;
    }

    public Set<String> getSetOnlines() {
        return setOnlines;
    }

    public void setSetOnlines(Set<String> setOnlines) {
        this.setOnlines = setOnlines;
    }

    public Action getAction() {
        return action;
    }

    public void setAction(Action action) {
        this.action = action;
    }
}
