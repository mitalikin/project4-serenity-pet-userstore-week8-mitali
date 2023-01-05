package io.swagger.petstore.model;

import org.codehaus.groovy.util.ListHashMap;

import java.util.HashMap;
import java.util.List;

public class PetPojo {
    private int id;
    private HashMap<String, Object> category;
    private String name;
    private List<String> photoUrls;
    private List<HashMap<String, Object>> tags;
    private String status;

    public List<HashMap<String, Object>> getTags() {
        return tags;
    }

    public void setTags(List<HashMap<String, Object>> tags) {
        this.tags = tags;
    }





    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public HashMap<String, Object> getCategory() {
        return category;
    }

    public void setCategory(HashMap<String, Object> category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getPhotoUrls() {
        return photoUrls;
    }

    public void setPhotoUrls(List<String> photoUrls) {
        this.photoUrls = photoUrls;
    }



    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

  public static PetPojo GetPetPojo(int id, HashMap<String,Object>category,
                                   String name, List<String>photoUrls,
                                   List<HashMap<String,Object>> tags, String status) {

PetPojo petPojo=new PetPojo();
        petPojo.setId(id);
        petPojo.setCategory(category);
        petPojo.setName(name);
        petPojo.setPhotoUrls(photoUrls);
        petPojo.setTags(tags);
        petPojo.setStatus(status);
        return petPojo;



  }


}
