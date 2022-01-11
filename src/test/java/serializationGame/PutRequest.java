package serializationGame;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PutRequest {
    @JsonProperty("name")
    private String name;

    @JsonProperty("category")
    private String category;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setCategory(String category){
        this.category = category;
    }

    public String getCategory(){
        return category;
    }

}
