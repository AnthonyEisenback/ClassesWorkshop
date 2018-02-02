package com.company;

public class Cat extends Pet {

    private boolean likesCatnip;
    private boolean usesLitterbox;
    private String furType;

    public Cat(int age) {

        super(age);

        this.likesCatnip = likesCatnip;
        this.usesLitterbox = usesLitterbox;
        this.furType = furType;
    }


    public boolean isLikesCatnip() {
        return likesCatnip;
    }

    public void setLikesCatnip(boolean likesCatnip) {
        this.likesCatnip = likesCatnip;
    }

    public boolean isUsesLitterbox() {
        return usesLitterbox;
    }

    public void setUsesLitterbox(boolean usesLitterbox) {
        this.usesLitterbox = usesLitterbox;
    }

    public String getFurType() {
        return furType;
    }

    public void setFurType(String furType) {
        this.furType = furType;
    }

    @Override
    protected String makeSound() {
        return "MEOWWWWWW!!!!!!!!";
    }
}