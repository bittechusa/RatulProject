package com.org;

import net.webservicex.GeoIP;
import net.webservicex.GeoIPService;
import net.webservicex.GeoIPServiceSoap;

public class StartingService {

	public static void main(String[] args) {
		String ipAddress =args[0];
		GeoIPService geoIPService =new GeoIPService();
		GeoIPServiceSoap geoIPServiceSoap =geoIPService.getGeoIPServiceSoap();
		GeoIP geoIP =geoIPServiceSoap.getGeoIP(ipAddress);
		System.out.println(geoIP.getCountryName());
	}

}
