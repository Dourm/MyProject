package org.yosneaker.common.tools;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.yosneaker.common.tools.JsonUtil.Json;
import org.yosneaker.common.tools.exception.HttpException;

import net.sf.json.JSON;
import net.sf.json.xml.XMLSerializer;

import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;
/**
 * 类描述:Http请求辅助类<br/>
 * 创建人:Rainy(yang.lin)<br/>
 * 创建时间:2014-10-13 14:16:57<br/>
 * @version<br/>
 */
public class HttpUtil {
	public static final Charset UTF_8 = Charset.forName("UTF-8");
	public static boolean DEBUG = true;
	 public static final String readStream(InputStream stream) throws Exception
	    {
	        BufferedReader reader = new BufferedReader(new InputStreamReader(stream));

	        StringBuilder sb = new StringBuilder();
	        String line;

	        while (null != (line = reader.readLine()))
	            sb.append(line).append('\n');

	        return sb.toString();
	    }

	    public static final String GET = "GET";
	    public static final String POST = "POST";
	    public static final String DELETE = "DELETE";
	    public static final String PUT = "PUT";
	    public static Reader http_request(String method, String url, String data, Map<String, String> headers)
	        throws Exception
	    {
	        URL req = new URL(url);
	        HttpURLConnection connection = (HttpURLConnection) req.openConnection();
	        if (headers != null) {
	            for (Map.Entry<String, String> header : headers.entrySet())
	                connection.addRequestProperty(header.getKey(), header.getValue());
	        }

	        connection.setRequestMethod(method);

	        if (DEBUG)
	            System.out.println("DEBUG request " + connection);

	        if (data != null) {
	            connection.setDoOutput(true);
	            Writer writer = new OutputStreamWriter(connection.getOutputStream(),UTF_8);
	            writer.write(data);
	            writer.flush();
	            writer.close();
	        }

	        if (DEBUG)
	            System.out.println("DEBUG connecting...");

	        connection.connect();
	        int responseCode = connection.getResponseCode();

	        if (DEBUG)
	            System.out.println("DEBUG response " + connection);

	        if (responseCode == 200)
	            return new InputStreamReader(connection.getInputStream());
	        
	        if(responseCode == 201)
	        	return new InputStreamReader(connection.getInputStream());
	        
	        throw new HttpException("",responseCode, connection.getContentType(), readStream(connection.getErrorStream()),url);
	    }

	    public static Reader http_get(String url) throws Exception {
	        return http_request(GET, url, null, null);
	    }

	    public static Reader http_get(String url, String data) throws Exception {
	        return http_request(GET, url, data, null);
	    }
	    
	    public static Reader http_get(String url, String data,Map<String,String> heads) throws Exception {
	        return http_request(GET, url, data,heads);
	    }
	    
	    public static Reader http_post(String url, String data) throws Exception {
	    	Map<String,String> heads = new HashMap<String,String>();
	    	heads.put("Content-Type", "application/json");
	        return http_request(POST, url, data, heads);
	    }
	    public static Reader http_delete(String url, String data) throws Exception {
	    	return http_request(DELETE, url, data, null);
	    }

	    public static Json get_json(String url, String data) throws Exception {
	    	return get_json(url, data, null);
	    }
	    
	    
	    public static Json get_json(String url, String data,Map<String,String> heads) throws Exception {

	        JsonParser parser = new JsonParser();
	        Reader reader =null;
	        String temp ="";
	        try {
	            reader = http_get(url, data,heads);
	            temp = getStrFromStream(reader);
	            return new Json(parser.parse(temp).getAsJsonObject());
	        } catch(HttpException error) {
	            if (DEBUG) {
	                System.out.println("ERROR code " + error.getCode());
	                System.out.println("ERROR getContentType() " + error.getContentType());
	                System.out.println("ERROR message " + error.getMessage());
	            }

	            if (error.getContentType() != null && error.getContentType().contains("json") && error.getMessage() != null)
	                return new Json(parser.parse(error.getContentType()).getAsJsonObject());

	            throw error;
	        }catch (JsonSyntaxException e) {
				XMLSerializer xmlSerializer = new XMLSerializer();
				JSON json = xmlSerializer.read(temp);
				return new Json(parser.parse(json.toString()));
			}
	    }
	    private static String getStrFromStream(Reader reader) throws IOException{
	    	BufferedReader in = new BufferedReader(reader);
	    	StringBuffer buffer = new StringBuffer();
	    	String line = " ";
	    	while ((line = in.readLine()) != null){
	    	buffer.append(line);
	    	}
	    	return buffer.toString();
	    }
	    public static Json post_json(String url, String data) throws Exception {
	    	
	    	JsonParser parser = new JsonParser();
	    	
	    	try {
	    		Reader reader = http_post(url, data);
	    		return new Json(parser.parse(reader).getAsJsonObject());
	    	} catch(HttpException error) {
	    		if (DEBUG) {
	    			System.out.println("ERROR code " + error.getCode());
	    			System.out.println("ERROR getContentType() " + error.getContentType());
	    			System.out.println("ERROR message " + error.getMessage());
	    		}
	    		
	    		if (error.getContentType() != null && error.getContentType().contains("json") && error.getMessage() != null)
	    			return new Json(parser.parse(error.getMessage()).getAsJsonObject());
	    		
	    		throw error;
	    	}
	    }
	    
	    
	    public static String join(String sep, Collection<String> args) {
	            return join(sep, args.toArray(new String[0]), 0);
	    }

	    public static String join(String sep, String args[]) {
	            return join(sep, args, 0);
	    }

	    public static String join(String sep, String args[], int start) {

	        if (args.length==0 || args.length <= start)
	            return "";

	        StringBuilder sb = new StringBuilder();
	        sb.append(args[start]);

	        for (int i=start+1; i < args.length; i++) {
	            sb.append(sep).append(args[i]);
	        }

	        return sb.toString();
	    }

	    public enum Format {
	        NATIVE, CSV, JSON, XML
	    }

	    public static String startList(Format format) {
	        switch(format)
	        {
	        case XML:
	            return "<list>";

	        case JSON:
	            return "[";

	        default:
	            return null;
	        }
	    }

	    public static String endList(Format format) {
	        switch(format)
	        {
	        case XML:
	            return "</list>";

	        case JSON:
	            return "]";

	        default:
	            return null;
	        }
	    }
}
