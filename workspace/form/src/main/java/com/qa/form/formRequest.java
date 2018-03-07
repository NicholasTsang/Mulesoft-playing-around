package com.qa.form;

import org.mule.api.MuleMessage;
import org.mule.api.transformer.TransformerException;
import org.mule.transformer.AbstractMessageTransformer;

import com.qa.form.formProcess;

public class formRequest extends AbstractMessageTransformer {

	formProcess sendForm = new formProcess();
	
	@Override
	public Object transformMessage(MuleMessage message, String outputEncoding) throws TransformerException {
		// TODO Auto-generated method stub
		sendForm.formProcessing(message);
		return message;
	}

}