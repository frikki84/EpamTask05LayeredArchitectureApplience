package by.epamtc.jwdmay2020.dziadkouskaya.task05.entity;

import java.util.HashMap;
import java.util.Map;

public class Appliance {
	private String applienceName;
	
	private Map<String, Object> featureMap;

	public Appliance() {
		featureMap= new HashMap<String, Object>();
	}

	public Appliance(String applienceName) {
		this.applienceName = applienceName;
		featureMap= new HashMap();
	}
	
	

	public Appliance(String applienceName, Map<String, Object> featureMap) {
		super();
		this.applienceName = applienceName;
		this.featureMap = featureMap;
	}

	public String getApplienceName() {
		return applienceName;
	}

	public void setApplienceName(String applienceName) {
		this.applienceName = applienceName;
	}

	public Map<String, Object> getFeatureMap() {
		return featureMap;
	}

	public void setFeatureMap(Map<String, Object> featureMap) {
		this.featureMap = featureMap;
	}

	@Override
	public String toString() {
		return "Appliance [applienceName=" + applienceName + ", featureMap=" + featureMap + "]";
	}

	

	
	
}
