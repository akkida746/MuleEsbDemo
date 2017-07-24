package com.akash;

import org.mule.api.transformer.TransformerException;
import org.mule.transformer.AbstractTransformer;

public class CustomTransformer extends AbstractTransformer{

	@Override
	protected Object doTransform(Object src, String enc) throws TransformerException {
		// TODO Auto-generated method stub

		return src.toString() + " Deep";
	}

}
