package com.ex.adoptapet;

public class HorizontalProductScrollModel {

    private int petImage;
    private String petTitle;
    private String petDiscription;
    private String petColor;

    public HorizontalProductScrollModel(int petImage, String petTitle, String petDiscription, String petColor) {
        this.petImage = petImage;
        this.petTitle = petTitle;
        this.petDiscription = petDiscription;
        this.petColor = petColor;
    }

    public int getPetImage() {
        return petImage;
    }

    public void setPetImage(int petImage) {
        this.petImage = petImage;
    }

    public String getPetTitle() {
        return petTitle;
    }

    public void setPetTitle(String petTitle) {
        this.petTitle = petTitle;
    }

    public String getPetDiscription() {
        return petDiscription;
    }

    public void setPetDiscription(String petDiscription) {
        this.petDiscription = petDiscription;
    }

    public String getPetColor() {
        return petColor;
    }

    public void setPetColor(String petColor) {
        this.petColor = petColor;
    }
}
