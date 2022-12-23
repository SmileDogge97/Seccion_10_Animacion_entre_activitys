package com.example.cl08_animacin_compartido_entre_activities;

public class Item {

    private static final String LARGE_BASE_URL = "";
    private static final String THUMB_BASE_URL = "";

    public static Item[] ITEMS = new Item[] {
            new Item("La mole", 01, "Iván Femat la mole", "https://i.pinimg.com/originals/11/3c/97/113c97951d624c4f6f430ec3c178d866.jpg", "https://i.pinimg.com/originals/11/3c/97/113c97951d624c4f6f430ec3c178d866.jpg")
    };

    public static Item getItem(int id){
        for (Item item : ITEMS){
            if (item.getId() == id){
                return item;
            }
        }
        return null;
    }

    private String Author;
    private int Id;
    private String Name;
    private String PhotoUrl;
    private String ThumbnailUrl;

    Item(String Author, int Id, String Name, String PhotoUrl, String ThumbnailUrl){
        this.Author = Author;
        this.Id = Id;
        this.Name = Name;
        this.PhotoUrl = PhotoUrl;
        this.ThumbnailUrl = ThumbnailUrl;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPhotoUrl() {
        return PhotoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        PhotoUrl = photoUrl;
    }

    public String getThumbnailUrl() {
        return ThumbnailUrl;
    }

    public void setThumbnailUrl(String thumbnailUrl) {
        ThumbnailUrl = thumbnailUrl;
    }
}
