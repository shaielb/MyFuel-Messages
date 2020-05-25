package messages;

import java.io.Serializable;
import java.util.Collection;

import db.interfaces.IEntity;

class RequestResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1;

	protected Header _header;

	private Collection<IEntity> _entities;

	public RequestResponse() {
		_header = new Header();
	}

	public Header getHeader() {
		return _header;
	}

	void setHeader(Header header) {
		_header = header;
	}

	public void setEntities(Collection<IEntity> entities) {
		_entities = entities;
	}

	public Collection<IEntity> getEntities() {
		return _entities;
	}
}
