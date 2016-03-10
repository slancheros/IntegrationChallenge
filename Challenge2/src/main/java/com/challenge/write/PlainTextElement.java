package com.challenge.write;

import java.io.Serializable;

public class PlainTextElement implements Serializable {

    private static final long serialVersionUID = 269176933236284899L;

    private final String id;
    
    //GIA
    private String fieldZero = "GIA";
    
    //OperatingCarrier || ScheduledFlightNumber || '/' || transforma(ScheduledArrivalDatetime)||'.'||TailNumber||'.'||ArrivalStationCode
    private String fieldOne;
    
    //'GTE'||if(NewGate!=null)->NewGate Else ' XXXXX'
    private String fieldTwo;
    
    //'SI Request_ID='||RequestId
    private String fieldThree;
    
    //'SI Event_ID'||EventId
    private String fieldFour;
    

    public PlainTextElement(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PlainTextElement)) return false;

        PlainTextElement that = (PlainTextElement) o;

        return id.equals(that.id);

    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

    @Override
    public String toString() {
        return "AnotherElement{" +
                "id='" + id + '\'' +
                '}';
    }

	public String getFieldOne() {
		return fieldOne;
	}

	public void setFieldOne(String fieldOne) {
		this.fieldOne = fieldOne;
	}

	public String getFieldTwo() {
		return fieldTwo;
	}

	public void setFieldTwo(String fieldTwo) {
		this.fieldTwo = fieldTwo;
	}

	public String getFieldThree() {
		return fieldThree;
	}

	public void setFieldThree(String fieldThree) {
		this.fieldThree = fieldThree;
	}

	public String getFieldFour() {
		return fieldFour;
	}

	public void setFieldFour(String fieldFour) {
		this.fieldFour = fieldFour;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getFieldZero() {
		return fieldZero;
	}

	public void setFieldZero(String fieldZero) {
		this.fieldZero = fieldZero;
	}
}