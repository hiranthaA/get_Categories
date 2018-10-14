package com.ncell.test.services.impl;

import com.ncell.test.Utils.Utils;
import com.ncell.test.models.Category;
import com.ncell.test.models.CategoryExt;
import com.ncell.test.models.Taxonomy;
import com.ncell.test.services.WordpressService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class WordpressServiceImpl implements WordpressService {
    @Override
    public List<CategoryExt> getAllCategories() {

        //get all taxonomies from database mybatis part here
        List<Taxonomy> taxonomyList = Utils.generateTaxonomies();
        //get all categories from wp api
        List<Category> categoryList = Utils.generateCategories();
        //list of categoryext to be populated and returned
        List<CategoryExt> categoryExtList = new ArrayList<>();
        //will be use to collect all the created categoryExt's for searching purposes
        Map<Integer,CategoryExt> categoryExtMap = new HashMap<>();
        //adding current categories to a map
        Map<Integer,Category> categoryMap = new HashMap<>();
        for(Category c:categoryList){
            categoryMap.put(c.getId(),c);
        }

        for (Taxonomy t: taxonomyList) {
            //current taxonomy hash
            String catHash = t.getCategory_hash();
            //seperating id's in the hash
            String taxIdSet[] = catHash.substring(1).split("-");
            //no.of iterations
            int count=1;
            //parent id for each iteration
            int parent=0;

            for(String s : taxIdSet){
                //if the current taxonomy id is a super parent (first in the category hash)
                if(count==1 && count==taxIdSet.length){
                    //create the categoryExt out of existing category
                    Category c = categoryMap.get(Integer.parseInt(s));
                    CategoryExt ce = new CategoryExt(c.getId(),c.getSlug(),c.getName(),c.getParent());
                    //adding categoryExt to the main list
                    categoryExtList.add(ce);
                    //adding categoryExt to categoryExt map for later searching
                    categoryExtMap.put(Integer.parseInt(s),ce);
                }
                //if the current taxonomy id is a leaf (last in the category hash)
                else if(count==taxIdSet.length){
                    //create the categoryExt out of existing category
                    Category c = categoryMap.get(Integer.parseInt(s));
                    CategoryExt ce = new CategoryExt(c.getId(),c.getSlug(),c.getName(),c.getParent());
                    //finding the parent of the above created categoryExt
                    CategoryExt parentCatExt = categoryExtMap.get(parent);
                    //adding to the childlist of parent
                    parentCatExt.getChildlist().add(ce);
                    //adding to categoryExt map for later searching
                    categoryExtMap.put(Integer.parseInt(s),ce);
                }
                //track the parent of the oncomming taxonomy id
                parent=Integer.parseInt(s);
                count++;
            }
        }
        return categoryExtList;
    }
}
