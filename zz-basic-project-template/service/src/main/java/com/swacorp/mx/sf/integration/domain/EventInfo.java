package com.swacorp.mx.sf.integration.domain;

import java.util.Arrays;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="EventInfo")
public class EventInfo {
	
	
	private String eventId;
	
	private String creationDatetime;
	
	private String requestId;
	
	private String topicName;
	
	private String totalEventCount;
	
	private TopicCounts[] topicCounts;

	public String getEventId() {
		return eventId;
	}
	
	@XmlAttribute(name="EventId")
	public void setEventId(String eventId) {
		this.eventId = eventId;
	}

	public String getCreationDatetime() {
		return creationDatetime;
	}

	@XmlAttribute(name="CreationDatetime")
	public void setCreationDatetime(String creationDatetime) {
		this.creationDatetime = creationDatetime;
	}

	public String getRequestId() {
		return requestId;
	}

	@XmlAttribute(name="RequestId")
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getTopicName() {
		return topicName;
	}

	@XmlAttribute(name="TopicName")
	public void setTopicName(String topicName) {
		this.topicName = topicName;
	}

	public String getTotalEventCount() {
		return totalEventCount;
	}

	@XmlAttribute(name="TotalEventCount")
	public void setTotalEventCount(String totalEventCount) {
		this.totalEventCount = totalEventCount;
	}

	public TopicCounts[] getTopicCounts() {
		return topicCounts;
	}

	@XmlElement(name="TopicCounts")
	public void setTopicCounts(TopicCounts[] topicCounts) {
		this.topicCounts = topicCounts;
	}

	@Override
	public String toString() {
		return "EventInfo [eventId=" + eventId + ", creationDatetime=" + creationDatetime + ", requestId=" + requestId
				+ ", topicName=" + topicName + ", totalEventCount=" + totalEventCount + ", topicCounts="
				+ Arrays.toString(topicCounts) + "]";
	}
	
	
}
