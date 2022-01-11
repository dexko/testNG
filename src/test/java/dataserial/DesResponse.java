package dataserial;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DesResponse {

	@JsonProperty("reviewScore")
	private int reviewScore;

	@JsonProperty("releaseDate")
	private String releaseDate;

	@JsonProperty("name")
	private String name;

	@JsonProperty("rating")
	private String rating;

	@JsonProperty("id")
	private int id;

	@JsonProperty("category")
	private String category;

	public int getReviewScore(){
		return reviewScore;
	}

	public String getReleaseDate(){
		return releaseDate;
	}

	public String getName(){
		return name;
	}

	public String getRating(){
		return rating;
	}

	public int getId(){
		return id;
	}

	public String getCategory(){
		return category;
	}
}