package com.infy.json;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.JsonArray;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;


/**
 * Servlet implementation class CodeAjaxServlet
 */
public class CodeAjaxServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		System.out.println("name="+name);
		User user1 = new User("aa", "aaaa");
		User user2 = new User("bb", "bbbb");
		User user3 = new User("cc", "cccc");
		List list = new ArrayList<User>();
		list.add(user1);
		list.add(user2);
		list.add(user3);
		JSONArray jsonArray = JSONArray.fromObject(list);
		System.out.println(jsonArray);
		response.getWriter().write(jsonArray.toString());
		
		
		/*PrintWriter out = response.getWriter();
		
		Gson gson = new Gson();
		
		String json = gson.toJson(user);
		out.write(json);*/
		/*JSONArray listArray=JSONArray.fromObject(user);
		System.out.println("listArray:"+listArray);*/
	//	JSONArray luckuser = JSONArray.fromObject(user); 
		/*try {
			jsonObject.accumulate("name", user.getName()).accumulate("password", user.getPassword());
			response.setContentType("application/json");
			response.getWriter().write(jsonObject.toString());
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}


}
