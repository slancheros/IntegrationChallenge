package com.swacorp.mx.sf.integration.domain;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="TopicCounts")
public class TopicCounts {
	
	
	private String topicName;
	
	
	private String topicCount;

	public String getTopicName() {
		return topicName;
	}

	@XmlAttribute(name="TopicName")
	public void setTopicName(String topicName) {
		this.topicName = topicName;
	}

	public String getTopicCount() {
		return topicCount;
	}

	@XmlAttribute(name="TopicCount")
	public void setTopicCount(String topicCount) {
		this.topicCount = topicCount;
	}

	@Override
	public String toString() {
		return "TopicCounts [topicName=" + topicName + ", topicCount=" + topicCount + "]";
	}
	
	
}
