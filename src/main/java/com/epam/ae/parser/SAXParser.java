package com.epam.ae.parser;

import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class SAXParser extends DefaultHandler {
    StringBuffer accumulator = new StringBuffer();

    @Override
    public void startDocument() throws SAXException {
        System.out.println("Document starts");
    }

    @Override
    public void endDocument() throws SAXException {
        System.out.println("Document end");
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        accumulator.append(ch, start, length);
    }

    
}
