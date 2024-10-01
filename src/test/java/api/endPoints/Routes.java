package api.endPoints;

/*
===> Here Only We Maintaining the urls's which we required

Swagger URI - https://petstore.swagger.io
	
Create User (POST) : https://petstore.swagger.io/v2/user
Get User (GET) : https://petstore.swagger.io/v2/user/{username}
Update User (PUT) : https://petstore.swagger.io/v2/user/{username}
Delete User (DELETE) :	https://petstore.swagger.io/v2/user/{username}

BaseUrl = https://petstore.swagger.io/v2         //this is common in every request 

*/

public class Routes {

		public static String base_url = "https://petstore.swagger.io/v2";
		
		//End Points for USER Module
		public static String post_url=base_url+"/user";
		public static String get_url=base_url+"/user/{username}";
		public static String update_url=base_url+"/user/{username}";
		public static String delete_url=base_url+"/user/{username}";
		
		//End Points for STORE Module
			//Here we will create url's of Store Module
		
		//End Points for PET Module
		//Here we will create url's of PET Module


}
