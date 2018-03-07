package abc.qac.com;

import org.mule.api.MuleMessage;
import org.mule.api.transformer.TransformerException;
import org.mule.transformer.AbstractMessageTransformer;

public class ProcessRequest extends AbstractMessageTransformer {

	ProcessMessage sendMessage = new ProcessMessage();
	
	@Override
	public Object transformMessage(MuleMessage message, String outputEncoding) throws TransformerException {
		// TODO Auto-generated method stub
		sendMessage.messageProcess(message);
		return message;
	}

}
