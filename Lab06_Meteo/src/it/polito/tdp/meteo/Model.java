package it.polito.tdp.meteo;

import java.util.ArrayList;
import java.util.List;

import it.polito.tdp.meteo.bean.Rilevamento;
import it.polito.tdp.meteo.bean.SimpleCity;
import it.polito.tdp.meteo.db.MeteoDAO;

public class Model {

	private final static int COST = 50;
	private final static int NUMERO_GIORNI_CITTA_CONSECUTIVI_MIN = 3;
	private final static int NUMERO_GIORNI_CITTA_MAX = 6;
	private final static int NUMERO_GIORNI_TOTALI = 15;
	
	private MeteoDAO meteoDao;
	private List<Rilevamento> rilevamenti;

	public Model() {
		
		meteoDao = new MeteoDAO();
		rilevamenti = new ArrayList<Rilevamento>();

	}


	public String getUmiditaMedia(int mese) {
		
		rilevamenti.addAll(meteoDao.getAllRilevamenti());
		
		double media =0.0;
		int cont = 0;
		
		for(Rilevamento r: rilevamenti){
		
			if(r.getData().getMonth() == mese){
				media += r.getUmidita();
				cont++;
			}
		
			
		}
		
		return ""+media/cont;
	}

	public String trovaSequenza(int mese) {

		return "TODO!";
	}

	private Double punteggioSoluzione(List<SimpleCity> soluzioneCandidata) {

		double score = 0.0;
		return score;
	}

	private boolean controllaParziale(List<SimpleCity> parziale) {

		return true;
	}

}
