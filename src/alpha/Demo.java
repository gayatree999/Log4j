package alpha;

//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.*;

public class Demo {
	
	private static Logger log = LogManager.getLogger(Demo.class.getName());

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		log.debug("I am debugging");
		//if(5>4) 
			log.info("Object is present");
		log.error("Object is not present");
		log.fatal("This is fatal");

	}

}
