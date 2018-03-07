package database;

import java.util.Map;

import org.mule.api.MuleMessage;
import org.mule.api.transformer.TransformerException;
import org.mule.api.transport.PropertyScope;
import org.mule.transformer.AbstractMessageTransformer;

public class insertData extends AbstractMessageTransformer{

	@Override
	public Object transformMessage(MuleMessage message, String outputEncoding) throws TransformerException {
		// TODO Auto-generated method stub
		//String Data=message.getProperty("http.query.params",PropertyScope.INBOUND);
		
		Map<String,String> data= (Map<String,String>) message.getPayload();
		String id=data.get("id");
		String name=data.get("name");
		String address=data.get("address");
		String marks=data.get("marks");

		//String insertData = data.get("id") + data.get("name") + data.get("address") + data.get("marksnsert");
		
		message.setProperty("insertId",id ,PropertyScope.SESSION);
		message.setProperty("insertName",name ,PropertyScope.SESSION);
		message.setProperty("insertAddress",address ,PropertyScope.SESSION);
		message.setProperty("insertMarks",marks ,PropertyScope.SESSION);
		return null;
	}

}