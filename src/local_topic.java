import java.io.ByteArrayInputStream;
import java.io.File;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class local_topic {
	public static void main(String[] args)
	{
		try {
			File inputFile = new File("/Sem-2/Social computing/Final project/groundtruthscil/Mar14_GroupB_annotated.xml");
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			StringBuilder xmlStringBuilder = new StringBuilder();
			//xmlStringBuilder.append("<?xml version="1.0"?> <class> </class>");
			ByteArrayInputStream input =  new ByteArrayInputStream(
			   xmlStringBuilder.toString().getBytes("UTF-8"));
			Document doc = dBuilder.parse(inputFile);
			doc.getDocumentElement().normalize();
			System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
			NodeList nList = doc.getElementsByTagName("turn");
			System.out.println("----------------------------");
			int count = 0, count1 = 0, count2 = 0, count3 = 0, count4 = 0, count5 = 0, count6 = 0, count7 = 0,
					count8 = 0, count9 = 0, count10 = 0, count11 = 0;
			int flag = 0;
			ArrayList<String> topic = new ArrayList<String>();
			ArrayList<String> speaker = new ArrayList<String>();
			String top;
			String name;
			for (int temp = 0; temp < nList.getLength(); temp++) {
				Node nNode = nList.item(temp);
				Node nNode1 = nList.item(temp + 1);
				// System.out.println("\nCurrent Element :" +
				// nNode.getNodeName());
				if (nNode.getNodeType() == Node.ELEMENT_NODE) {
					Element eElement = (Element) nNode;
					Element eElement1 = (Element) nNode1;
					//System.out.println(eElement.getAttribute("speaker") + eElement.getAttribute("topic"));
					
					top = eElement.getAttribute("topic");
				    name = eElement.getAttribute("speaker");
					if (!topic.contains(top)) {
						topic.add(top);
						speaker.add(name);
					
					}
				}
				
			}
			System.out.println("speaker:" +speaker);
			System.out.println("topic:" +topic);
		}catch (Exception e) {
					e.printStackTrace();
				}
	}

}

