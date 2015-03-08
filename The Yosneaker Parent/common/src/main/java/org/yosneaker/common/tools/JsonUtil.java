package org.yosneaker.common.tools;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import net.sf.ezmorph.MorpherRegistry;
import net.sf.ezmorph.object.DateMorpher;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;
import net.sf.json.processors.JsonValueProcessor;
import net.sf.json.util.JSONUtils;
import net.sf.json.xml.XMLSerializer;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
/**
 * 类描述:Json工具类<br/>
 * 创建人:Rainy(yang.lin)<br/>
 * 创建时间:2014-10-13 14:06:57<br/>
 * @version<br/>
 */
@SuppressWarnings({"rawtypes","unchecked"})
public class JsonUtil {

	/**
	 * 设置日期转换格式
	 */
	static {
		// 注册器
		MorpherRegistry mr = JSONUtils.getMorpherRegistry();

		// 可转换的日期格式，即Json串中可以出现以下格式的日期与时间
		DateMorpher dm = new DateMorpher(new String[] { DateUtil.YYYY_MM_DD,
				DateUtil.YYYY_MM_DD_HH_MM_ss, DateUtil.HH_MM_ss, DateUtil.YYYYMMDD,
				DateUtil.YYYYMMDDHHMMSS, DateUtil.HHMMss });
		mr.registerMorpher(dm);
	}

	/**
	 * 从json串转换成实体对象
	 * 
	 * @param jsonObjStr
	 *            e.g. {'name':'get','dateAttr':'2009-11-12'}
	 * @param clazz
	 *            Person.class
	 * @return
	 */
	public static Object getDtoFromJsonObjStr(String jsonObjStr, Class clazz) {
		return JSONObject.toBean(JSONObject.fromObject(jsonObjStr), clazz);
	}

	/**
	 * 从json串转换成实体对象，并且实体集合属性存有另外实体Bean
	 * 
	 * @param jsonObjStr
	 *            e.g. {'data':[{'name':'get'},{'name':'set'}]}
	 * @param clazz
	 *            e.g. MyBean.class
	 * @param classMap
	 *            e.g. classMap.put("data", Person.class)
	 * @return Object
	 */
	public static Object getDtoFromJsonObjStr(String jsonObjStr, Class clazz,
			Map classMap) {
		return JSONObject.toBean(JSONObject.fromObject(jsonObjStr), clazz,
				classMap);
	}

	/**
	 * 把一个json数组串转换成普通数组
	 * 
	 * @param jsonArrStr
	 *            e.g. ['get',1,true,null]
	 * @return Object[]
	 */
	public static Object[] getArrFromJsonArrStr(String jsonArrStr) {
		return JSONArray.fromObject(jsonArrStr).toArray();
	}

	/**
	 * 把一个json数组串转换成实体数组
	 * 
	 * @param jsonArrStr
	 *            e.g. [{'name':'get'},{'name':'set'}]
	 * @param clazz
	 *            e.g. Person.class
	 * @return Object[]
	 */
	public static Object[] getDtoArrFromJsonArrStr(String jsonArrStr,
			Class clazz) {
		JSONArray jsonArr = JSONArray.fromObject(jsonArrStr);
		Object[] objArr = new Object[jsonArr.size()];
		for (int i = 0; i < jsonArr.size(); i++) {
			objArr[i] = JSONObject.toBean(jsonArr.getJSONObject(i), clazz);
		}
		return objArr;
	}

	/**
	 * 把一个json数组串转换成实体数组，且数组元素的属性含有另外实例Bean
	 * 
	 * @param jsonArrStr
	 *            e.g. [{'data':[{'name':'get'}]},{'data':[{'name':'set'}]}]
	 * @param clazz
	 *            e.g. MyBean.class
	 * @param classMap
	 *            e.g. classMap.put("data", Person.class)
	 * @return Object[]
	 */
	public static Object[] getDtoArrFromJsonArrStr(String jsonArrStr,
			Class clazz, Map classMap) {
		JSONArray array = JSONArray.fromObject(jsonArrStr);
		Object[] obj = new Object[array.size()];
		for (int i = 0; i < array.size(); i++) {
			JSONObject jsonObject = array.getJSONObject(i);
			obj[i] = JSONObject.toBean(jsonObject, clazz, classMap);
		}
		return obj;
	}

	/**
	 * 把一个json数组串转换成存放普通类型元素的集合
	 * 
	 * @param jsonArrStr
	 *            e.g. ['get',1,true,null]
	 * @return List
	 */
	public static List getListFromJsonArrStr(String jsonArrStr) {
		JSONArray jsonArr = JSONArray.fromObject(jsonArrStr);
		List list = new ArrayList();
		for (int i = 0; i < jsonArr.size(); i++) {
			list.add(jsonArr.get(i));
		}
		return list;
	}

	/**
	 * 把一个json数组串转换成集合，且集合里存放的为实例Bean
	 * 
	 * @param jsonArrStr
	 *            e.g. [{'name':'get'},{'name':'set'}]
	 * @param clazz
	 * @return List
	 */
	public static List getListFromJsonArrStr(String jsonArrStr, Class clazz) {
		JSONArray jsonArr = JSONArray.fromObject(jsonArrStr);
		List list = new ArrayList();
		for (int i = 0; i < jsonArr.size(); i++) {
			list.add(JSONObject.toBean(jsonArr.getJSONObject(i), clazz));
		}
		return list;
	}

	/**
	 * 把一个json数组串转换成集合，且集合里的对象的属性含有另外实例Bean
	 * 
	 * @param jsonArrStr
	 *            e.g. [{'data':[{'name':'get'}]},{'data':[{'name':'set'}]}]
	 * @param clazz
	 *            e.g. MyBean.class
	 * @param classMap
	 *            e.g. classMap.put("data", Person.class)
	 * @return List
	 */
	public static List getListFromJsonArrStr(String jsonArrStr, Class clazz,
			Map classMap) {
		JSONArray jsonArr = JSONArray.fromObject(jsonArrStr);
		List list = new ArrayList();
		for (int i = 0; i < jsonArr.size(); i++) {
			list.add(JSONObject.toBean(jsonArr.getJSONObject(i), clazz,
					classMap));
		}
		return list;
	}

	/**
	 * 把json对象串转换成map对象
	 * 
	 * @param jsonObjStr
	 *            e.g. {'name':'get','int':1,'double',1.1,'null':null}
	 * @return Map
	 */
	public static Map getMapFromJsonObjStr(String jsonObjStr) {
		JSONObject jsonObject = JSONObject.fromObject(jsonObjStr);

		Map map = new HashMap();
		for (Iterator iter = jsonObject.keys(); iter.hasNext();) {
			String key = (String) iter.next();
			map.put(key, jsonObject.get(key));
		}
		return map;
	}

	/**
	 * 把json对象串转换成map对象，且map对象里存放的为其他实体Bean
	 * 
	 * @param jsonObjStr
	 *            e.g. {'data1':{'name':'get'},'data2':{'name':'set'}}
	 * @param clazz
	 *            e.g. Person.class
	 * @return Map
	 */
	public static Map getMapFromJsonObjStr(String jsonObjStr, Class clazz) {
		JSONObject jsonObject = JSONObject.fromObject(jsonObjStr);

		Map map = new HashMap();
		for (Iterator iter = jsonObject.keys(); iter.hasNext();) {
			String key = (String) iter.next();
			map.put(key,
					JSONObject.toBean(jsonObject.getJSONObject(key), clazz));
		}
		return map;
	}

	/**
	 * 把json对象串转换成map对象，且map对象里存放的其他实体Bean还含有另外实体Bean
	 * 
	 * @param jsonObjStr
	 *            e.g. {'mybean':{'data':[{'name':'get'}]}}
	 * @param clazz
	 *            e.g. MyBean.class
	 * @param classMap
	 *            e.g. classMap.put("data", Person.class)
	 * @return Map
	 */
	public static Map getMapFromJsonObjStr(String jsonObjStr, Class clazz,
			Map classMap) {
		JSONObject jsonObject = JSONObject.fromObject(jsonObjStr);

		Map map = new HashMap();
		for (Iterator iter = jsonObject.keys(); iter.hasNext();) {
			String key = (String) iter.next();
			map.put(key, JSONObject.toBean(jsonObject.getJSONObject(key),
					clazz, classMap));
		}
		return map;
	}

	/**
	 * 把实体Bean、Map对象、数组、列表集合转换成Json串
	 * 
	 * @param obj
	 * @return
	 * @throws Exception
	 *             String
	 */
	public static String getJsonStr(Object obj) {
		String jsonStr = null;
		// Json配置
		JsonConfig jsonCfg = new JsonConfig();

		// 注册日期处理器
		jsonCfg.registerJsonValueProcessor(java.util.Date.class,
				new JsonDateValueProcessor(DateUtil.YYYY_MM_DD_HH_MM_ss));
		if (obj == null) {
			return "{}";
		}

		if (obj instanceof Collection || obj instanceof Object[]) {
			jsonStr = JSONArray.fromObject(obj, jsonCfg).toString();
		} else {
			jsonStr = JSONObject.fromObject(obj, jsonCfg).toString();
		}

		return jsonStr;
	}

	/**
	 * 把json串、数组、集合(collection map)、实体Bean转换成XML XMLSerializer API：
	 * http://json-lib
	 * .sourceforge.net/apidocs/net/sf/json/xml/XMLSerializer.html 具体实例请参考：
	 * http://json-lib.sourceforge.net/xref-test/net/sf/json/xml/
	 * TestXMLSerializer_writes.html
	 * http://json-lib.sourceforge.net/xref-test/net
	 * /sf/json/xml/TestXMLSerializer_writes.html
	 * 
	 * @param obj
	 * @return
	 * @throws Exception
	 *             String
	 */
	public static String getXMLFromObj(Object obj) {
		XMLSerializer xmlSerial = new XMLSerializer();

		// Json配置
		JsonConfig jsonCfg = new JsonConfig();

		// 注册日期处理器
		jsonCfg.registerJsonValueProcessor(java.util.Date.class,
				new JsonDateValueProcessor(DateUtil.YYYY_MM_DD_HH_MM_ss));

		if ((String.class.isInstance(obj) && String.valueOf(obj)
				.startsWith("["))
				|| obj.getClass().isArray()
				|| Collection.class.isInstance(obj)) {
			JSONArray jsonArr = JSONArray.fromObject(obj, jsonCfg);
			return xmlSerial.write(jsonArr);
		} else {
			JSONObject jsonObj = JSONObject.fromObject(obj, jsonCfg);
			return xmlSerial.write(jsonObj);
		}
	}

	/**
	 * 从XML转json串
	 * 
	 * @param xml
	 * @return String
	 */
	public static String getJsonStrFromXML(String xml) {
		XMLSerializer xmlSerial = new XMLSerializer();
		return String.valueOf(xmlSerial.read(xml));
	}
	
	/*
	 * A container for name/value pair objects
	 */
	public static class NameValue {
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Object getValue() {
			return value;
		}

		public void setValue(Object value) {
			this.value = value;
		}

		public String name;
		public Object value;

		public NameValue(String name, Object value) {
			this.name = name;
			this.value = value;
		}

		public String toString() {
			return name + ":" + value;
		}
	}
	
	/*
	 * A simple wrapper for Gson objects
	 */
	public static class Json {

		JsonElement jele;

		public Json() {
			jele = new JsonObject();
		}

		public Json(JsonElement source) {
			jele = source;
		}

		public String toPrettyString() {
			Gson gson = new GsonBuilder().setPrettyPrinting().create();
			return gson.toJson(jele);
		}

		public String toString() {
			return jele.toString();
		}

		public String toXML() {
			return elementToXML(jele);
		}

		public String toXML(int index) {
			return "<item index=\"" + index + "\">" + elementToXML(jele)
					+ "</item>";
		}

		public static String elementToXML(JsonElement jele) {
			//
			// null are empty values
			//
			if (jele == null || jele.isJsonNull())
				return "";

			if (jele.isJsonPrimitive()) {
				JsonPrimitive p = jele.getAsJsonPrimitive();

				if (p.isString())
					return p.getAsString().replace("&", "&amp;")
							.replace("<", "&gt;");

				//
				// other primitives are returned as-is
				//
				else
					return p.toString();
			}

			StringBuilder sb = new StringBuilder();

			if (jele.isJsonObject()) {
				sb.append("<object>");

				for (Map.Entry<String, JsonElement> e : jele.getAsJsonObject()
						.entrySet()) {
					sb.append("<property name=\"" + e.getKey() + "\">");
					sb.append(elementToXML(e.getValue()));
					sb.append("</property>");
				}

				sb.append("</object>");
			}

			else if (jele.isJsonArray()) {
				sb.append(startList(Format.XML));

				int i = 0;

				for (JsonElement e : jele.getAsJsonArray()) {
					sb.append("<item index=\"" + i + "\">");
					sb.append(elementToXML(e));
					sb.append("</item>");

					i++;
				}

				sb.append(endList(Format.XML));
			}

			else {
				sb.append("<unknown>");
				sb.append(jele.toString());
				sb.append("</unknown>");
			}

			return sb.toString();
		}

		public String toCSV() {
			//
			// null are empty values
			//
			if (jele == null || jele.isJsonNull())
				return "";

			if (jele.isJsonPrimitive()) {
				//
				// strings are CSV-escaped
				//
				if (jele.getAsJsonPrimitive().isString())
					return "\""
							+ jele.getAsJsonPrimitive().getAsString()
									.replace("\"", "\"\"") + "\"";

				//
				// other primitives are returned as-id
				//
				else
					return jele.toString();
			}

			//
			// non-primitives are fully CSV-escaped so they can be converted
			// back to json blobs
			//
			return "\"" + jele.toString().replace("\"", "\"\"") + "\"";
		}

		public String toCSV(String field_names[]) {
			ArrayList<String> values = new ArrayList<String>(field_names.length);

			for (String name : field_names)
				values.add(this.get(name).toCSV());

			return join(",", values);
		}

		public Json putNVList(String name, List<NameValue> value) {
			JsonArray jarray = new JsonArray();

			for (NameValue nv : value) {
				JsonObject jnv = new JsonObject();
				jnv.addProperty(nv.name, nv.value.toString());
				jarray.add(jnv);
			}

			jele.getAsJsonObject().add(name, jarray);
			return this;
		}

		public Json put(String name, List<?> value) {
			JsonArray jarray = new JsonArray();

			for (Object v : value)
				jarray.add(new JsonPrimitive(v.toString()));

			jele.getAsJsonObject().add(name, jarray);
			return this;
		}

		public Json put(String name, Json value) {
			jele.getAsJsonObject().add(name, value.jele);
			return this;
		}

		public Json put(String name, Boolean value) {
			jele.getAsJsonObject().addProperty(name, value);
			return this;
		}

		public Json put(String name, Integer value) {
			jele.getAsJsonObject().addProperty(name, value);
			return this;
		}

		public Json put(String name, Long value) {
			jele.getAsJsonObject().addProperty(name, value);
			return this;
		}

		public Json put(String name, Double value) {
			jele.getAsJsonObject().addProperty(name, value);
			return this;
		}

		public Json put(String name, String value) {
			jele.getAsJsonObject().addProperty(name, value);
			return this;
		}

		public boolean has(String name) {
			return jele.getAsJsonObject().has(name);
		}

		public Set<String> keySet() {
			Set<String> keySet = new HashSet<String>();

			for (Map.Entry<String, JsonElement> e : jele.getAsJsonObject()
					.entrySet()) {
				keySet.add(e.getKey());
			}

			return keySet;
		}

		public Json get(String name) {
			return new Json(jele.getAsJsonObject().get(name));
		}

		public boolean getBoolean(String name) {
			return jele.getAsJsonObject().get(name).getAsBoolean();
		}

		public int getInt(String name) {
			return jele.getAsJsonObject().get(name).getAsInt();
		}

		public long getLong(String name) {
			return jele.getAsJsonObject().get(name).getAsLong();
		}

		public double getDouble(String name) {
			return jele.getAsJsonObject().get(name).getAsDouble();
		}

		public String getString(String name) {
			return jele.getAsJsonObject().get(name).getAsString();
		}

		public Json get(int index) {
			return new Json(jele.getAsJsonArray().get(index));
		}

		public int size() {
			return jele.getAsJsonArray().size();
		}
	}

	public static String join(String sep, Collection<String> args) {
		return join(sep, args.toArray(new String[0]), 0);
	}

	public static String join(String sep, String args[]) {
		return join(sep, args, 0);
	}

	public static String join(String sep, String args[], int start) {

		if (args.length == 0 || args.length <= start)
			return "";

		StringBuilder sb = new StringBuilder();
		sb.append(args[start]);

		for (int i = start + 1; i < args.length; i++) {
			sb.append(sep).append(args[i]);
		}

		return sb.toString();
	}

	public enum Format {
		NATIVE, CSV, JSON, XML
	}

	public static String startList(Format format) {
		switch (format) {
		case XML:
			return "<list>";

		case JSON:
			return "[";

		default:
			return null;
		}
	}

	public static String endList(Format format) {
		switch (format) {
		case XML:
			return "</list>";

		case JSON:
			return "]";

		default:
			return null;
		}
	}
}

/**
 * json日期值处理器实现
 */
class JsonDateValueProcessor implements JsonValueProcessor {

	private String format = DateUtil.YYYY_MM_DD_HH_MM_ss;

	public JsonDateValueProcessor() {

	}

	public JsonDateValueProcessor(String format) {
		this.format = format;
	}

	public Object processArrayValue(Object value, JsonConfig jsonConfig) {
		return process(value, jsonConfig);
	}

	public Object processObjectValue(String key, Object value,
			JsonConfig jsonConfig) {
		return process(value, jsonConfig);
	}

	private Object process(Object value, JsonConfig jsonConfig) {
		if (value instanceof Date) {
			String str = new SimpleDateFormat(format).format((Date) value);
			return str;
		}
		return value == null ? null : value.toString();
	}

	public String getFormat() {
		return format;
	}

	public void setFormat(String format) {
		this.format = format;
	}
}

