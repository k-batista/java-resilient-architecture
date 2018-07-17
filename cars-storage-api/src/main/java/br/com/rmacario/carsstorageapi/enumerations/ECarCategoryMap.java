package br.com.rmacario.carsstorageapi.enumerations;

import java.util.Arrays;

public enum ECarCategoryMap {
	
	COMPACT(new String[] {"Chery New QQ", "Fiat Mobi"}),
	MEDIUM(new String[] {"Passat", "Sonata"}),
	LARGE(new String[] {"Chrysler", "LaCrosse"});
	
	
	private String[] names;
	
	public String[] getNames() {
		return names;
	}
	
	private ECarCategoryMap(String... names) {
		this.names = names;
	}
	
	
	public static String getCarCategory(final String carName) {
		if (Arrays.asList(COMPACT.getNames()).contains(carName)) {
			return "compact";
		}
		
		if (Arrays.asList(COMPACT.getNames()).contains(carName)) {
			return "medium";
		}
		
		if (Arrays.asList(COMPACT.getNames()).contains(carName)) {
			return "large";
		}
		
		return "unknow";
	}
}
