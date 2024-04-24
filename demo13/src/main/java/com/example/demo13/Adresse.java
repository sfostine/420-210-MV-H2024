package com.example.demo13;

public class Adresse {

    public Adresse(){

    }

    public String getRue() {
        return rue;
    }

    public String getVille() {
        return ville;
    }

    public String getCode_postal() {
        return code_postal;
    }

    private String rue;
    private String ville;

    public void setRue(String rue) {
        this.rue = rue;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public void setCode_postal(String code_postal) {
        this.code_postal = code_postal;
    }

    private String code_postal;

}
