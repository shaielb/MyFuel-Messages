package messages.response;

import messages.Response;

public class ResponseEvent {
	private IResponseCallBack _registeredCallBack;
	public void setResponse(Response response) {
		if (_registeredCallBack != null) {
			_registeredCallBack.execute(response);
		}
	}
	public void continueWith(IResponseCallBack respnseCallBack) {
		_registeredCallBack = respnseCallBack;
	}
}