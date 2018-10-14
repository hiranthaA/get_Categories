package com.ncell.test.models;

public class Taxonomy {
    private int id;
    private int taxonomy_id;
    private String category_hash;

    public Taxonomy(int id, int taxonomy_id, String category_hash) {
        super();
        this.id = id;
        this.taxonomy_id = taxonomy_id;
        this.category_hash = category_hash;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getCategory_hash() {
        return category_hash;
    }
    public void setCategory_hash(String category_hash) {
        this.category_hash = category_hash;
    }
    public int getTaxonomy_id() {
        return taxonomy_id;
    }
    public void setTaxonomy_id(int taxonomy_id) {
        this.taxonomy_id = taxonomy_id;
    }
}
