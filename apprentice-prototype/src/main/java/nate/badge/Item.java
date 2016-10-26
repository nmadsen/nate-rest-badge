package nate.badge;

import org.springframework.stereotype.Component;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by roondog on 9/30/16.
 */

@Component
@XmlRootElement
public class Item {

	private String id;
	private String name;
	private String comment;

	public String getId() {
		return this.id;
	}

	public String getName() {
		return this.name;
	}

	public String getComment() {
		return this.comment;
	}

	@XmlAttribute
	public void setId(String id) {
		this.id = id;
	}

	@XmlElement
	public void setName(String name) {
		this.name = name;
	}

	@XmlElement
	public void setComment(String comment) {
		this.comment = comment;
	}

}
