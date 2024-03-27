package t8_insa;

import java.util.Calendar;

public class InsaService {
	InsaVO vo = null;
	
	public InsaVO getDefaultDate() {
		vo = new InsaVO();
		
		Calendar cal = Calendar.getInstance(); 
		vo.setCbYY(cal.get(Calendar.YEAR)+"");
		vo.setCbMM((cal.get(Calendar.MONTH)+1)+"");
		vo.setCbDD(cal.get(Calendar.DATE)+"");
		
		return vo;
	}

}
