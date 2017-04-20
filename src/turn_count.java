import java.io.ByteArrayInputStream;
import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class turn_count {
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
			for (int temp = 0; temp < nList.getLength(); temp++) {
				Node nNode = nList.item(temp);
				Node nNode1 = nList.item(temp + 1);
				// System.out.println("\nCurrent Element :" +
				// nNode.getNodeName());
				if (nNode.getNodeType() == Node.ELEMENT_NODE) {
					Element eElement = (Element) nNode;
					Element eElement1 = (Element) nNode1;
					//System.out.println("Speaker : " + eElement.getAttribute("speaker"));
					if(eElement.getAttribute("speaker").equals("lynn"))
					{
					count ++;
							
					}
					else if(eElement.getAttribute("speaker").equals("jake"))
					{
					count1 ++;
					}
					else if(eElement.getAttribute("speaker").equals("macy"))
					{
					count2 ++;
					}
					else if(eElement.getAttribute("speaker").equals("melany"))
					{
					count3 ++;
					}
					else if(eElement.getAttribute("speaker").equals("ariel"))
					{
					count4 ++;
					}
					else if(eElement.getAttribute("speaker").equals("irene"))
					{
					count5 ++;
					}
					else if(eElement.getAttribute("speaker").equals("luke"))
					{
					count6 ++;
					}
					else if(eElement.getAttribute("speaker").equals("ariel"))
					{
					count7 ++;
					}
					else if(eElement.getAttribute("speaker").equals("tia"))
					{
					count8 ++;
					}
					else if(eElement.getAttribute("speaker").equals("moderator"))
					{
					count9 ++;
					}
			            
				}
				
			}
			System.out.println("lynn :"+count);
			System.out.println("jake :"+count1);
			System.out.println("macy :"+count2);
			System.out.println("melany :"+count3);
			System.out.println("ariel :"+count4);
			System.out.println("irene :"+count5);
			System.out.println("luke :"+count6);
			System.out.println("Ariel :"+count7);
			System.out.println("Tia :"+count8);
		}catch (Exception e) {
					e.printStackTrace();
				}
	}

}

