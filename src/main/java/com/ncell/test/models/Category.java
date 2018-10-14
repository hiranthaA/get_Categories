package com.ncell.test.models;

public class Category {
    private int id;
    private String slug;
    private String name;
    private int parent;


    public Category(int id, String slug, String name, int parent) {
        super();
        this.id = id;
        this.slug = slug;
        this.name = name;
        this.parent = parent;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getSlug() {
        return slug;
    }
    public void setSlug(String slug) {
        this.slug = slug;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getParent() {
        return parent;
    }
    public void setParent(int parent) {
        this.parent = parent;
    }
}
