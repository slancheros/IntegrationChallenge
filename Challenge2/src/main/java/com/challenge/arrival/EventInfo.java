package com.challenge.arrival;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "EventInfo")
public class EventInfo {

	private String eventID;
	private String creationDateTime;
	private String requestId;
	private String topicName;
	private String totalEventCount;
	
	private List<TopicCount> topicCounts;

	@XmlAttribute(name = "EventId")
	public String getEventID() {
		return eventID;
	}

	public void setEventID(String eventID) {
		this.eventID = eventID;
	}

	@XmlAttribute(name = "CreationDatetime")
	public String getCreationDateTime() {
		return creationDateTime;
	}

	public void setCreationDateTime(String creationDateTime) {
		this.creationDateTime = creationDateTime;
	}

	@XmlAttribute(name = "RequestId")
	public String getRequestId() {
		return requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	@XmlAttribute(name = "TopicName")
	public String getTopicName() {
		return topicName;
	}

	public void setTopicName(String topicName) {
		this.topicName = topicName;
	}

	@XmlAttribute(name = "TotalEventCount")
	public String getTotalEventCount() {
		return totalEventCount;
	}

	public void setTotalEventCount(String totalEventCount) {
		this.totalEventCount = totalEventCount;
	}

	@XmlElement(name = "TopicCounts")
	public List<TopicCount> getTopicCounts() {
		if(topicCounts == null){
			topicCounts = new ArrayList<TopicCount>();
		}
		return topicCounts;
	}

	public void setTopicCounts(List<TopicCount> topicCounts) {
		this.topicCounts = topicCounts;
	}
	
}
