package com.example.socialaddemo;

public class ServiceConfig {

	public enum SERVICES {
		CREATE_DEVICES,
		CREATE_ACCOUNT,
		CREATE_APPSINSTALLED,
		CREATE_CONTACTS,
		CREATE_FB_CONTACTS,
		GET_SOCIAL_AD,
		GET_FB_SOCIAL_AD
	}

	// Check the IP address of the local server machine
	private static final String PUBLIC_BETA_IP = "192.168.1.3:3000";

	//Change the values accordingly for test server and production server.
	private static final String PUBLIC_SERVER_IP = "54.80.156.169";

	private static class URL {

		// Test Development Server
		public static final String CREATE_DEVICE_API = "http://"+PUBLIC_BETA_IP+"/device";
		public static final String CREATE_ACCOUNT_API = "http://"+PUBLIC_BETA_IP+"/account";
		public static final String CREATE_APPS_INSTALLED_API = "http://"+PUBLIC_BETA_IP+"/appsinstalled";
		public static final String CREATE_CONTACTS_API = "http://"+PUBLIC_BETA_IP+"/contacts";
		public static final String CREATE_FB_CONTATCS_API = "http://"+PUBLIC_BETA_IP+"/fb_contacts";
		public static final String FETCH_SOCIAL_AD_API = "http://"+PUBLIC_BETA_IP+"/fetch_social_ad";
		public static final String FETCH_FB_SOCIAL_AD_API = "http://"+PUBLIC_BETA_IP+"/fetch_fb_social_ad"; 
		
		// Production Server
//		public static final String CREATE_DEVICE_API = "http://"+PUBLIC_SERVER_IP+"/device";
//		public static final String CREATE_ACCOUNT_API = "http://"+PUBLIC_SERVER_IP+"/account";
//		public static final String CREATE_APPS_INSTALLED_API = "http://"+PUBLIC_SERVER_IP+"/appsinstalled";
//		public static final String CREATE_CONTACTS_API = "http://"+PUBLIC_SERVER_IP+"/contacts";
//		public static final String CREATE_FB_CONTATCS_API = "http://"+PUBLIC_SERVER_IP+"/fb_contacts";		
//		public static final String FETCH_SOCIAL_AD_API = "http://"+PUBLIC_SERVER_IP+"/fetch_social_ad";  
//		public static final String FETCH_FB_SOCIAL_AD_API = "http://"+PUBLIC_SERVER_IP+"/fetch_fb_social_ad"; 
	}

	public static String getURL(SERVICES services) {
		String url = "";
		switch (services) {
		case CREATE_DEVICES:
			url = URL.CREATE_DEVICE_API;
			break;
		case CREATE_ACCOUNT:
			url = URL.CREATE_ACCOUNT_API;
			break;
		case CREATE_APPSINSTALLED:
			url = URL.CREATE_APPS_INSTALLED_API;
			break;
		case CREATE_CONTACTS:
			url = URL.CREATE_CONTACTS_API;
			break;
		case CREATE_FB_CONTACTS:
			url = URL.CREATE_FB_CONTATCS_API;
			break;
		case GET_SOCIAL_AD:
			url = URL.FETCH_SOCIAL_AD_API;
			break;
		case GET_FB_SOCIAL_AD:
			url = URL.FETCH_FB_SOCIAL_AD_API;
			break;
		}
		return url;
	}

}
