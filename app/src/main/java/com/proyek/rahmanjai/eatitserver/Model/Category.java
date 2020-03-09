package com.proyek.rahmanjai.eatitserver.Model;

/*public class Category {
    private String Nama, Image;

    public Category() {

    }

    public Category(String nama, String image) {
        Nama = nama;
        Image = image;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String nama) {
        Nama = nama;
    }

    public String getImage() {
        return Image;
    }

    public void setImage(String image) {
        Image = image;
    }
}*/


public class Category {
    private String Nama;
    private String Image;
    private int Color;
    private int Count;

    public Category() {

    }

    public Category(String nama, String image,int c) {
        Nama = nama;
        Image = image;
        Count = c;
        Color = 0;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String nama) {
        Nama = nama;
    }

    public String getImage() {
        return Image;
    }

    public void setImage(String image) {
        Image = image;
    }

    public int getColor() {
        return Color;
    }

    public void setColor(int color) {
        this.Color = color;
    }

    public int getCount() {
        return Count;
    }

    public void setCount(int count) {
        this.Count = count;
    }

}

