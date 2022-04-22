package com.pedro.desafio.entities;

import com.pedro.desafio.entities.enums;

public class Noodle {

    private String label;
    private String flavor;
    private Package pack;

    public Noodle() {
    }

    public Noodle(String label, String flavor, Package pack) {
        this.label = label;
        this.flavor = flavor;
        this.pack = pack;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public Package getPack() {
        return pack;
    }

    public void setPack(Package pack) {
        this.pack = pack;
    }

}