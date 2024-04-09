package com.fritz.api;

public class Flyfoto {
    //lagde ingen toString 8:53

    private int id;
    private String fornavn;
    private String etternavn;
    private String aps; //adresse, postnummer, sted
    private String epostadresse;
    private int aarstall;
    private float breddegrad;
    private float lengdegrad;
    private int hoeydemeter;

    public Flyfoto(int id, String fornavn, String etternavn, String aps, String epostadresse, int aarstall, float breddegrad, float lengdegrad, int hoeydemeter) {
        this.id = id;
        this.fornavn = fornavn;
        this.etternavn = etternavn;
        this.aps = aps;
        this.epostadresse = epostadresse;
        this.aarstall = aarstall;
        this.breddegrad = breddegrad;
        this.lengdegrad = lengdegrad;
        this.hoeydemeter = hoeydemeter;
    }

    public int getId() {
        return id;
    }

    public String getFornavn() {
        return fornavn;
    }

    public String getEtternavn() {
        return etternavn;
    }

    public String getAps() {
        return aps;
    }

    public String getEpostadresse() {
        return epostadresse;
    }

    public int getAarstall() {
        return aarstall;
    }

    public float getBreddegrad() {
        return breddegrad;
    }

    public float getLengdegrad() {
        return lengdegrad;
    }

    public int getHoeydemeter() {
        return hoeydemeter;
    }
}
