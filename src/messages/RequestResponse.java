package messages;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import db.interfaces.IEntity;

@SuppressWarnings("unchecked")
class RequestResponse implements Serializable {

	/**
	 * 
	 */
	/**
	 * 
	 */
	private static final long serialVersionUID = 1;

	/**
	 * 
	 */
	protected Header _header;

	/**
	 * 
	 */
	private Collection<IEntity> _entities;

	/**
	 * 
	 */
	public RequestResponse() {
		_header = new Header();
	}

	/**
	 * @return
	 */
	public Header getHeader() {
		return _header;
	}

	/**
	 * @param header
	 */
	void setHeader(Header header) {
		_header = header;
	}

	/**
	 * @param entities
	 */
	public void setEntities(Collection<IEntity> entities) {
		_entities = entities;
	}
	
	/**
	 * @param entities
	 */
	public void addEntity(IEntity entity) {
		if (_entities == null) {
			_entities = new HashSet<IEntity>();
		}
		_entities.add(entity);
	}

	/**
	 * @return
	 */
	public Collection<IEntity> getEntities() {
		return _entities;
	}
	
	/**
	 * @return
	 */
	public <TEntity extends IEntity> Collection<TEntity> getEntitiesAsType() {
		List<TEntity> list = new ArrayList<TEntity>();
		for (IEntity entity : _entities) {
			list.add((TEntity) entity);
		}
		return list;
	}

	/**
	 * @param <TEntity>
	 * @return
	 */
	public <TEntity extends IEntity> List<TEntity> getEntitiesAsList() {
		List<TEntity> list = new ArrayList<TEntity>();
		_entities.forEach((entity) -> { list.add((TEntity) entity); });
		return list;
	}
	
	/**
	 * @param <TEntity>
	 * @return
	 */
	public <TEntity extends IEntity> Set<TEntity> getEntitiesAsSet() {
		Set<TEntity> set = new HashSet<TEntity>();
		_entities.forEach((entity) -> { set.add((TEntity) entity); });
		return set;
	}
}
