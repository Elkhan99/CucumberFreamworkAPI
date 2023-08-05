package utility;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.json.JSONObject;

public class HelperUtility {

	public static JSONObject parseJSONFile(String path) throws IOException {
		String content = new String(Files.readAllBytes(Paths.get(path)));
		return new JSONObject(content);
	}

	
}