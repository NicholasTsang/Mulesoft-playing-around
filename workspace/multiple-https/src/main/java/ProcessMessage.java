import java.util.Map;

import org.mule.api.MuleMessage;
import org.mule.api.transformer.TransformerException;
import org.mule.api.transport.PropertyScope;
import org.mule.transformer.AbstractMessageTransformer;

public class ProcessMessage extends AbstractMessageTransformer{

	@Override
	public Object transformMessage(MuleMessage message, String outputEncoding) throws TransformerException {
		// TODO Auto-generated method stub
		//String Data=message.getProperty("http.query.params",PropertyScope.INBOUND);
		
		Map<String,String> data= (Map<String,String>) message.getPayload();
		String city=data.get("city");
	//	message.setProperty("cityname",city);
		message.setProperty("cityname", city,PropertyScope.SESSION);
		return null;
	}

}
