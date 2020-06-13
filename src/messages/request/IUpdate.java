package messages.request;

import java.util.Collection;

import db.interfaces.IEntity;

public interface IUpdate extends IRequest {

	/**
	 * @param entities
	 */
	public void setEntities(Collection<IEntity> entities);
}
