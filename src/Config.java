import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class Config {
	//name
	public static String appName = "Chancecoin";
	public static String burnAddress = "1ChancecoinXXXXXXXXXXXXXXXXXZELUFD";
	public static Boolean testNet = false;
	public static String prefix = "CHANCECO";
	public static String log = appName+".log";
	public static String minVersionPage = "https://raw2.github.com/chancecoin/chancecoinj/master/min_version.txt";
	public static String minVersionPage2 = "http://chancecoin.com/downloads/min_version.txt";
	public static String dbPath = "resources/db/";
	public static String downloadUrl = "http://chancecoin.com/downloads/";
	public static String downloadZipUrl = "https://raw2.github.com/chancecoin/chancecoinj/master/download.txt";
	public static String downloadZipUrl2 = "https://chancecoin.com/downloads/download.txt";
	public static Integer RPCPort = 54121;
	public static String RPCUsername = "";
	public static String RPCPassword = "";
	public static String ConfigFile = "./resources/chancecoin.conf";
	
	//version
	public static Integer majorVersion = 2;
	public static Integer minorVersion = 0;
	public static String version = Integer.toString(majorVersion)+"."+Integer.toString(minorVersion);
	public static Integer majorVersionDB = 1;
	public static Integer minorVersionDB = 2;
	public static String versionDB = Integer.toString(majorVersionDB)+"."+Integer.toString(minorVersionDB);	
	
	//burn
	public static Integer firstBlock = 291860;
	public static Integer startBlock = firstBlock;
	public static Integer endBlock = startBlock+6*24*45;
	public static Integer maxBurn = 1000000;
	public static Integer multiplier = 1000;
	public static Integer multiplierInitial = 1500;
	public static long burnCreationTime = 1395508676-1;
	
	//casino
	public static Double houseEdge = 0.01; //was 0.02 before block 298340
	public static Double maxProfit = 0.01;
	
	//bitcoin
	public static Integer dustSize = 5430*2;
	public static Integer minFee = 10000;
	public static Integer dataValue = 0;
	
	//protocol
	public static String txTypeFormat = ">I";
	public static Integer unit = 100000000;
	
	//etc.
	public static Integer maxExpiration = 4*2016;
	public static Integer maxInt = ((int) Math.pow(2.0,63.0))-1;
	
	public static void loadUserDefined() {
		FileInputStream input;
		try {
			input = new FileInputStream(ConfigFile);
			Properties prop = new Properties();
			prop.load(input);
			RPCUsername = prop.getProperty("RPCUsername");
			RPCPassword = prop.getProperty("RPCPassword");
		} catch (IOException e) {
		}		
	}
}
