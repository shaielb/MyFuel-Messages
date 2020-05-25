package messages;

public class Message {

	private Request _request;

	private Response _response;

	public Request getRequest() {
		return _request;
	}

	public void setRequest(Request request) {
		_request = request;
		_response = new Response();
		_response.setHeader(_request.getHeader());
	}

	public Response getResponse() {
		return _response;
	}
}
