package messages;

import java.io.Serializable;

public class Header implements Serializable {

	public static enum RequestType { Filter, Collect, Insert, Update, Remove }

	/**
	 * 
	 */
	private static final long serialVersionUID = 2;
	private Long _id;
	private RequestType _type;

	public Long getId() {
		return _id;
	}

	public void setId(Long id) {
		_id = id;
	}

	public void setType(RequestType type) {
		_type = type;
	}

	public RequestType getType() {
		return _type;
	}
}