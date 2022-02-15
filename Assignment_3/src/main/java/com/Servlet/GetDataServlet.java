package com.Servlet;

import java.io.FileReader;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/* Date -11/02/2022
Author -Mandeep Kaur,Karanbir kaur,Manpreet Singh,Harsimran Singh,Anjali Rakholiya
Description - Retreive data from Student.json file and calculate area of square and traingle .
Also show data  to webpage.
*/
/**
 * Servlet implementation class GetDataServlet
 */
public class GetDataServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public GetDataServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		JSONParser jsonparser = new JSONParser(); // parse the json file calling jsonparser.

		// load the json file.
		FileReader reader = new FileReader("D:\\eclipse-workspace\\Assignment_3\\Data\\Sudent.json");
		Object obj = "";
		try {
			obj = jsonparser.parse(reader); // java object
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {

			e.printStackTrace();

		}
		JSONArray stdlist = (JSONArray) obj; // json array
		System.out.println(stdlist);
		JSONObject sizeArray = null;

		for (int j = 0; j < stdlist.size(); j++) {
			sizeArray = (JSONObject) stdlist.get(j); // convert jsonarray to json object

			// JSONObject empJsonObj = (JSONObject) obj;
			JSONObject empJsonObj = (JSONObject) sizeArray.get("Student");

			// for extracting data..

			String fname = (String) empJsonObj.get("firstName"); // ???
			String lname = (String) empJsonObj.get("lastName");
			System.out.println("FirstName: " + fname);
			System.out.println("LastName: " + lname);

			// set the value of attribute and add it to request
			request.setAttribute("fname", fname);
			request.setAttribute("lname", lname);

			JSONArray array = (JSONArray) empJsonObj.get("address");

			// for reading array of json objects
			for (int i = 0; i < array.size(); i++) {

				JSONObject address = (JSONObject) array.get(i);
				String street = (String) address.get("street");
				String city = (String) address.get("city");
				String state = (String) address.get("state");

				System.out.println("address of: " + i + " is ... ");
				System.out.println("Street: " + street);
				System.out.println("City: " + city);
				System.out.println("State: " + state);

				// set the value of attribute and add it to request
				request.setAttribute("street", street);
				request.setAttribute("city", city);
				request.setAttribute("state", state);
			}

			JSONArray array1 = (JSONArray) empJsonObj.get("Scores");

			// for reading array of json objects
			for (int i = 0; i < array1.size(); i++) {

				JSONObject Scores = (JSONObject) array1.get(i);
				String subject1 = (String) Scores.get("subject1");
				String subject2 = (String) Scores.get("subject2");
				String subject3 = (String) Scores.get("subject3");
				String subject4 = (String) Scores.get("subject4");
				String subject5 = (String) Scores.get("subject5");

				System.out.println("Scroes of: " + i + " is ... ");
				System.out.println("subject1: " + subject1);
				System.out.println("subject2: " + subject2);
				System.out.println("subject3: " + subject3);
				System.out.println("subject4: " + subject4);
				System.out.println("subject5: " + subject5);

				// set the value of attribute and add it to request
				request.setAttribute("subject1", subject1);
				request.setAttribute("subject2", subject2);
				request.setAttribute("subject3", subject3);
				request.setAttribute("subject4", subject4);
				request.setAttribute("subject5", subject5);
			}

			JSONArray array2 = (JSONArray) empJsonObj.get("Phone_number");
			// for reading array of json objects
			for (int i = 0; i < array2.size(); i++) {

				JSONObject Phone_number = (JSONObject) array2.get(i);
				String Contact1 = (String) Phone_number.get("Contact1");
				String Contact2 = (String) Phone_number.get("Contact2");

				System.out.println("Phone_number of: " + i + " is ... ");
				System.out.println("Contact1: " + Contact1);
				System.out.println("Contact2: " + Contact2);

				// set the value of attribute and add it to request
				request.setAttribute("Contact1", Contact1);
				request.setAttribute("Contact2", Contact2);
			}
			JSONArray array3 = (JSONArray) empJsonObj.get("Area");

			// for reading array of json objects
			for (int i = 0; i < array3.size(); i++) {

				JSONObject area = (JSONObject) array3.get(i);
				int base = Integer.parseInt((String) area.get("base"));
				int height = Integer.parseInt((String) area.get("height"));
				int side = Integer.parseInt((String) area.get("side"));

				System.out.println("values to find Area: " + i + " is ... ");
				System.out.println("base: " + base);
				System.out.println("height: " + height);
				System.out.println("side: " + side);

				// set the value of attribute and add it to request
				request.setAttribute("base", base);
				request.setAttribute("height", height);
				request.setAttribute("side", side);

				double t_area = (base * height) / 2;
				double s_area = side * side;

				// set the value of attribute and add it to request
				request.setAttribute("t_area", t_area);
				request.setAttribute("s_area", s_area);

				System.out.println("t_area: " + t_area);
				System.out.println("s_area: " + s_area);
			}

			RequestDispatcher rd = request.getRequestDispatcher("/final.jsp");
			rd.include(request, response); // forward respose to another page*/

		}

	}

}
