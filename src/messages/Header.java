package messages;

import java.io.Serializable;

public class Header implements Serializable {

	public static enum RequestType { Filter, Collect, Insert, Update, Remove }

	/**
	 * 
	 */
	private static final long serialVersionUID = 2;
	/**
	 * 
	 */
	private Long _id;
	/**
	 * 
	 */
	private RequestType _type;

	/**
	 * @return
	 */
	public Long getId() {
		return _id;
	}

	/**
	 * @param id
	 */
	public void setId(Long id) {
		_id = id;
	}

	/**
	 * @param type
	 */
	public void setType(RequestType type) {
		_type = type;
	}

	/**
	 * @return
	 */
	public RequestType getType() {
		return _type;
	}
}