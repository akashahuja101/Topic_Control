import java.io.ByteArrayInputStream;
import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class turn_length {
	public static void main(String[] args)
	{
		try {
			File inputFile1 = new File("/Sem-2/Social computing/Final project/groundtruthscil/Mar14_GroupB_annotated.xml");
			//File inputFile2 = new File("/Sem-2/Social computing/Final project/good files/test.xml");
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			StringBuilder xmlStringBuilder = new StringBuilder();
			//xmlStringBuilder.append("<?xml version="1.0"?> <class> </class>");
			ByteArrayInputStream input =  new ByteArrayInputStream(
			   xmlStringBuilder.toString().getBytes("UTF-8"));
			Document doc1 = dBuilder.parse(inputFile1);
			//Document doc2 = dBuilder.parse(inputFile2);
			doc1.getDocumentElement().normalize();
			//doc2.getDocumentElement().normalize();
			System.out.println("Root element :" + doc1.getDocumentElement().getNodeName());
			NodeList nList1 = doc1.getElementsByTagName("turn");
			//NodeList nList2 = doc2.getElementsByTagName("Dialogue");
			System.out.println("----------------------------");
			int count = 0, count1 = 0, count2 = 0, count3 = 0, count4 = 0, count5 = 0, count6 = 0, count7 = 0,
					count8 = 0, count9 = 0, count10 = 0, count11 = 0;       
			int flag = 0, total1 = 0, total2 = 0, total3 = 0, total4 = 0, total5 = 0, total6 = 0, total7 = 0, total8 = 0, total9 = 0;
			for (int temp = 0; temp < nList1.getLength(); temp++) {
				Node nNode1 = nList1.item(temp);
				//Node nNode2 = nList2.item(temp);
				// System.out.println("\nCurrent Element :" +
				// nNode.getNodeName());
				if (nNode1.getNodeType() == Node.ELEMENT_NODE) {
					Element eElement = (Element) nNode1;
					if(eElement.getAttribute("speaker").equals("lynn"))
					{
					String text = eElement.getTextContent();
					System.out.println("text : " + text);
					int words = text.trim().split("\\s+").length;
					System.out.println(words);
					total1 += words;
					count1++;
					
					}
					else if(eElement.getAttribute("speaker").equals("jake"))
					{
					String text = eElement.getTextContent();
					System.out.println("text : " + text);
					int words = text.trim().split("\\s+").length;
					System.out.println(words);
					total2 += words;
					count2++;
					
					}
					else if(eElement.getAttribute("speaker").equals("macy"))
					{
					String text = eElement.getTextContent();
					System.out.println("text : " + text);
					int words = text.trim().split("\\s+").length;
					System.out.println(words);
					total3 += words;
					count3++;
					
					}
					else if(eElement.getAttribute("speaker").equals("melany"))
					{
					String text = eElement.getTextContent();
					System.out.println("text : " + text);
					int words = text.trim().split("\\s+").length;
					System.out.println(words);
					total4 += words;
					count4++;
					
					}
					else if(eElement.getAttribute("speaker").equals("ariel"))
					{
					String text = eElement.getTextContent();
					System.out.println("text : " + text);
					int words = text.trim().split("\\s+").length;
					System.out.println(words);
					total5 += words;
					count5++;
					
					}
					else if(eElement.getAttribute("speaker").equals("irene"))
					{
					String text = eElement.getTextContent();
					System.out.println("text : " + text);
					int words = text.trim().split("\\s+").length;
					System.out.println(words);
					total6 += words;
					count6++;
					
					}
					else if(eElement.getAttribute("speaker").equals("luke"))
					{
					String text = eElement.getTextContent();
					System.out.println("text : " + text);
					int words = text.trim().split("\\s+").length;
					System.out.println(words);
					total7 += words;
					count7++;
					
					}
					else if(eElement.getAttribute("speaker").equals("ariel"))
					{
					String text = eElement.getTextContent();
					System.out.println("text : " + text);
					int words = text.trim().split("\\s+").length;
					System.out.println(words);
					total8 += words;
					count8++;
					
					}
					else if(eElement.getAttribute("speaker").equals("tia"))
					{
					String text = eElement.getTextContent();
					System.out.println("text : " + text);
					int words = text.trim().split("\\s+").length;
					System.out.println(words);
					total9 += words;
					count9++;
					
					}
					else if(eElement.getAttribute("speaker").equals("moderator"))
					{
					String text = eElement.getTextContent();
					System.out.println("text : " + text);
					int words = text.trim().split("\\s+").length;
					System.out.println(words);
					//total8 += words;
					//count8++;
					
					}
			            
				}
				
			}
			System.out.println("lynn : "+(float)total1/count1);
			System.out.println("jake : "+(float)total2/count2);
			System.out.println("macy : "+(float)total3/count3);
			System.out.println("melany : "+(float)total4/count4);
			System.out.println("ariel : "+(float)total5/count5);
			System.out.println("irene : "+(float)total6/count6);
			System.out.println("luke : "+(float)total7/count7);
			System.out.println("Ariel : "+(float)total8/count8);
			System.out.println("Tia : "+(float)total9/count9);
			
		
		}catch (Exception e) {
					e.printStackTrace();
				}
	}

}
