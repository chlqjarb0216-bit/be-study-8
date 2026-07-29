package be_study.quiz.quiz59;

import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Quiz59Main {

	/*
	퀴즈 JSON 파싱 + DTO 객체 생성
	
	아래 JSON 샘플 데이터를 수신하였다고 가정해보고,
	아래 데이터를 전달하기 위해, 파싱하여 적절한 DTO 객체를 만들어서 담아보시오!!
	(단, 크게 봤을때 전체를 담고 있는 한개의 DTO 를 통해서 전달한다고 생각하고 진행하세요. 적절하게 DTO를 구성해보세요)
	*/

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String jsonString = "{\r\n" + "\"id\": 1,\r\n" + "\"name\": \"John Doe\",\r\n" + "\"contacts\": [\r\n" + "{\r\n"
				+ "\"type\": \"email\",\r\n" + "\"value\": \"john.doe@example.com\"\r\n" + "},\r\n" + "{\r\n"
				+ "\"type\": \"phone\",\r\n" + "\"value\": \"01023456789\"\r\n" + "}\r\n" + "],\r\n"
				+ "\"address\": {\r\n" + "\"street\": \"123 Main Street\",\r\n" + "\"city\": \"Seoul\",\r\n"
				+ "\"zipcode\": \"12345\"\r\n" + "},\r\n" + "\"orders\": [\r\n" + "{\r\n"
				+ "\"orderId\": \"ORD-001\",\r\n" + "\"date\": \"2024-07-09\",\r\n" + "\"items\": [\r\n" + "{\r\n"
				+ "\"id\": 1,\r\n" + "\"name\": \"Smartphone\",\r\n" + "\"quantity\": 2\r\n" + "},\r\n" + "{\r\n"
				+ "\"id\": 2,\r\n" + "\"name\": \"Laptop\",\r\n" + "\"quantity\": 1\r\n" + "}\r\n" + "]\r\n" + "},\r\n"
				+ "{\r\n" + "\"orderId\": \"ORD-002\",\r\n" + "\"date\": \"2024-07-10\",\r\n" + "\"items\": [\r\n"
				+ "{\r\n" + "\"id\": 3,\r\n" + "\"name\": \"Headphones\",\r\n" + "\"quantity\": 1\r\n" + "}\r\n"
				+ "]\r\n" + "}\r\n" + "]\r\n" + "}";

		JSONParser parser = new JSONParser();
		JSONObject obj = (JSONObject) parser.parse(jsonString);

		CustomerDTO customerDTO = new CustomerDTO();

		//customerDTO.setId( Integer.parseInt(obj.get("id").toString()) );
		//customerDTO.setName(obj.get("name").toString());

		customerDTO.setId(objectToInt(obj.get("id")));
		customerDTO.setName(objectToString(obj.get("name")));

		JSONArray contactsArray = (JSONArray) obj.get("contacts");
		List<Contact> contacts = new ArrayList<Contact>();
		for (int i = 0; i < contactsArray.size(); i++) {
			JSONObject contactObject = (JSONObject) contactsArray.get(i);

			Contact contact = new Contact();
			contact.setType(objectToString(contactObject.get("type")));
			contact.setValue(objectToString(contactObject.get("value")));
			contacts.add(contact);
		}
		customerDTO.setContacts(contacts);

		JSONObject addressObject = (JSONObject) obj.get("address");
		Address address = new Address();

		address.setStreet(objectToString(addressObject.get("street")));
		address.setCity(objectToString(addressObject.get("city")));
		address.setZipcode(objectToString(addressObject.get("zipcode")));

		customerDTO.setAddress(address);

		JSONArray ordersArray = (JSONArray) obj.get("orders");
		List<Order> orders = new ArrayList<Order>();

		for (int i = 0; i < ordersArray.size(); i++) {
			JSONObject orderObject = (JSONObject) ordersArray.get(i);

			Order order = new Order();
			order.setOrderId(objectToString(orderObject.get("orderId")));
			order.setDate(objectToString(orderObject.get("date")));

			JSONArray itemsArray = (JSONArray) orderObject.get("items");
			List<Item> items = new ArrayList<Item>();
			for (int j = 0; j < itemsArray.size(); j++) {
				JSONObject itemObject = (JSONObject) itemsArray.get(j);
				Item item = new Item();

				item.setId(objectToInt(itemObject.get("id")));
				item.setName(objectToString(itemObject.get("name")));
				item.setQuantity(objectToInt(itemObject.get("quantity")));

				items.add(item);
			}

			order.setItems(items);

			orders.add(order);
		}

		customerDTO.setOrders(orders);

		System.out.println(customerDTO); //JSON 파싱 -> DTO

	}

	public static int objectToInt(Object obj) {
		return Integer.parseInt(obj.toString());
	}

	public static String objectToString(Object obj) {
		if (obj == null)
			return null; //return "";
		else
			return obj.toString();
	}
}
