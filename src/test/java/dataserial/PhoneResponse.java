package dataserial;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class PhoneResponse{

	@JsonProperty("PhoneResponse")
	private List<PhoneResponseItem> phoneResponse;

	public void setPhoneResponse(List<PhoneResponseItem> phoneResponse){
		this.phoneResponse = phoneResponse;
	}

	public List<PhoneResponseItem> getPhoneResponse(){
		return phoneResponse;
	}
}