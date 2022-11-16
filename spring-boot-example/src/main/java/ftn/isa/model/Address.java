package ftn.isa.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Address 
{
	@Column(name="location")
	private String location; //street name and number
	
	@Column(name = "city")
	
	private String city;
	
	@Column(name = "country")
	private String country;
	
	public Address() {}
	
	public Address(String location, String city, String country) 
	{
		super();
		this.location = location;
		this.city = city;
		this.country = country;
	}

	public String getLocation() 
	{
		return location;
	}
	
	public void setLocation(String location) 
	{
		this.location = location;
	}
	
	public String getCity() 
	{
		return city;
	}
	
	public void setCity(String city) 
	{
		this.city = city;
	}
	public String getCountry() 
	{
		return country;
	}
	
	public void setCountry(String country) 
	{
		this.country = country;
	}
}
