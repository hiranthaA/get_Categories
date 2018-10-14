package com.ncell.test.models;

import java.util.ArrayList;
import java.util.List;

public class CategoryExt{
    private int id;
    private String slug;
    private String name;
    private int parent;
    private List<CategoryExt> childlist;

    public CategoryExt() {}

    public CategoryExt(int id, String slug, String name, int parent) {
        this.id = id;
        this.slug = slug;
        this.name = name;
        this.parent = parent;
        childlist = new ArrayList<>();
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

    public List<CategoryExt> getChildlist() {
        return childlist;
    }

    public void setChildlist(List<CategoryExt> childlist) {
        this.childlist = childlist;
    }
}
