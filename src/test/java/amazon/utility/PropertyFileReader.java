package amazon.utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created By: Ganesh Prabhakaran
 * Version: 1.0
 */

public class PropertyFileReader {

    private static Properties properties = new Properties();
    private static InputStream inputStream = null;

    public PropertyFileReader() throws Exception {
        loadProperties();
        loadDataProperties();
    }

    public static void loadProperties() throws Exception {
        try {
            inputStream = new FileInputStream("config.properties");
            properties.load(inputStream);
            Log.info("Info : Loading config properties");
        } catch (IOException e) {
            Log.info("Error : Loading config properties - " + e);
            throw new Exception("Error : Loading config properties - " + e);
        }

    }

    public static void loadDataProperties() throws Exception {
        try {
            inputStream = new FileInputStream("testData.properties");
            properties.load(inputStream);
            Log.info("Info : Loading Test Data");
        } catch (IOException e) {
            Log.info("Error : Loading test data - " + e);
            throw new Exception("Error : Loading test data - " + e);
        }

    }

    public static void setSystemProperties() throws Exception {
        Properties props = System.getProperties();
        loadProperties();
        loadDataProperties();
        try {
            props.setProperty("browser", properties.getProperty("browser"));
            props.setProperty("mainURL", properties.getProperty("mainURL"));
            props.setProperty("invalid_username", properties.getProperty("invalid_username"));
            props.setProperty("invalid_password", properties.getProperty("invalid_password"));
            props.setProperty("valid_username", properties.getProperty("valid_username"));
            props.setProperty("valid_password", properties.getProperty("valid_password"));
            props.setProperty("product", properties.getProperty("product"));

            Log.info("Info : Read properties successfully");
        } catch (Exception e) {
            Log.info("Fail : Read properties - " + e);
        }
    }


    public String readProperty(String key) {
        return properties.getProperty(key);
    }

}

