package com.mu.setup;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesFile {

	public static Properties readProperties(String file) throws IOException {

		Properties prop = new Properties();

		FileInputStream fis = new FileInputStream(file);

		prop.load(fis);

		return prop;

	}

	public static String readProperty(String key) {
		// TODO Auto-generated method stub

		String filePath = System.getProperty("user.dir") + "\\src\\test\\resources\\";

		Properties prop = null;
		try {
			prop = ReadPropertiesFile.readProperties(filePath + "config.properties");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return prop.getProperty(key, "defaultValue");
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String filePath = System.getProperty("user.dir") + "\\src\\test\\resources\\";

		String key = "Non-subs-adblock_URL_1";

		ReadPropertiesFile.readProperties(filePath + "config.properties");

	}

	public static String validateAndReadCAPIURL(String classNameSeg) {
		// TODO Auto-generated method stub

		String jsonURL = "";

		if (ReadJsonData.MAG_ENV_PRD.equals(ReadJsonData.MAG_ENV)) {
			jsonURL = ReadPropertiesFile.readProperty(ReadJsonData.MAG_PROD_PREFIX)
					+ ReadPropertiesFile.readProperty(ReadJsonData.MAG_CAPI_URL);
		} else if (ReadJsonData.MAG_ENV_STG.equals(ReadJsonData.MAG_ENV)) {
			jsonURL = ReadPropertiesFile.readProperty(ReadJsonData.MAG_STAGE_PREFIX)
					+ ReadPropertiesFile.readProperty(ReadJsonData.MAG_CAPI_URL);
		}

		if (ReadJsonData.MAG_NOTPUBLISHED.equalsIgnoreCase(ReadJsonData.MAG_PUBLISH)) {
			jsonURL = jsonURL + "&" + ReadPropertiesFile.readProperty(ReadJsonData.MAG_PRE_PROD);
		}

		jsonURL = jsonURL + "&" + ReadPropertiesFile.readProperty(classNameSeg);

		System.out.println("#############JSON URL#####################");
		System.out.println(jsonURL);
		System.out.println("#############JSON URL#####################");

		return jsonURL;

	}

}
