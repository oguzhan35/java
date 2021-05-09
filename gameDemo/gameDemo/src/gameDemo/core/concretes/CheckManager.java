package gameDemo.core.concretes;


import gameDemo.core.abstracts.CheckService;
import gameDemo.entities.concretes.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;


public class CheckManager implements CheckService {

	@Override
	public boolean check(Customer customer)  {
		
		
 
       	
	KPSPublicSoap kpsPublicSoap = new KPSPublicSoapProxy();
	try {
        
		 return kpsPublicSoap.TCKimlikNoDogrula(Long.parseLong(customer.getNationalIdentity()), customer.getFirstName().toUpperCase(), customer.getLastName().toUpperCase(), customer.getBirthday());

	} catch (Exception e) {
		// TODO: handle exception
	}
	

		return false;
	}



	

	

	

	

	
	

}
