package com.epam.ae.runner;

import com.epam.ae.parser.ParserFactory;
import com.epam.ae.parser.ParserSAX;
import com.epam.ae.parser.ParserStAX;
import com.epam.ae.parser.SAXHandler;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;

public class Runner {
    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
        System.out.println("=========SAX Parser=========");
        ParserFactory saxParser = new ParserSAX();
        saxParser.getDatas();

        System.out.println("=========StAX Parser=========");
        ParserFactory staxParser = new ParserStAX();
        staxParser.getDatas();
    }
}
