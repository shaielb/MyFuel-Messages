package messages.response;

import messages.request.IRequest;

public interface IPreSendRequest {
	public boolean execute(IRequest response);
}