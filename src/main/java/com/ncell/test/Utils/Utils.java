package com.ncell.test.Utils;

import com.ncell.test.models.Category;
import com.ncell.test.models.Taxonomy;

import java.util.ArrayList;
import java.util.List;

public class Utils {
    public static List<Taxonomy> generateTaxonomies() {
        List<Taxonomy> tlist = new ArrayList<>();
        Taxonomy t1 = new Taxonomy(1, 1, "-1");
        Taxonomy t2 = new Taxonomy(2, 2, "-2");
        Taxonomy t3 = new Taxonomy(3, 3, "-2-3");
        Taxonomy t4 = new Taxonomy(4, 4, "-2-3-4");
        Taxonomy t5 = new Taxonomy(5, 5, "-5");
        Taxonomy t6 = new Taxonomy(6, 6, "-5-6");
        Taxonomy t7 = new Taxonomy(7, 7, "-7");
        Taxonomy t8 = new Taxonomy(8, 8, "-7-8");
        Taxonomy t9 = new Taxonomy(9, 9, "-7-8-9");
        Taxonomy t10 = new Taxonomy(10, 10, "-7-8-10");
        tlist.add(t1);
        tlist.add(t2);
        tlist.add(t3);
        tlist.add(t4);
        tlist.add(t5);
        tlist.add(t6);
        tlist.add(t7);
        tlist.add(t8);
        tlist.add(t9);
        tlist.add(t10);

        return tlist;
    }

    public static List<Category> generateCategories(){
        List<Category> categoryList = new ArrayList<>();
        Category c1 = new Category(1,"slug1","name1",0);
        Category c2 = new Category(2,"slug2","name2",0);
        Category c3 = new Category(3,"slug3","name3",2);
        Category c4 = new Category(4,"slug4","name4",3);
        Category c5 = new Category(5,"slug5","name5",0);
        Category c6 = new Category(6,"slug6","name6",5);
        Category c7 = new Category(7,"slug7","name7",0);
        Category c8 = new Category(8,"slug8","name8",7);
        Category c9 = new Category(9,"slug9","name9",8);
        Category c10 = new Category(10,"slug10","name10",8);

        categoryList.add(c1);
        categoryList.add(c2);
        categoryList.add(c3);
        categoryList.add(c4);
        categoryList.add(c5);
        categoryList.add(c6);
        categoryList.add(c7);
        categoryList.add(c8);
        categoryList.add(c9);
        categoryList.add(c10);

        return categoryList;
    }
}
