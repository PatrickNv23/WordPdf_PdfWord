package techcodenv.wordtopdf;

import com.spire.doc.Document;
import com.spire.doc.FileFormat;

import techcodenv.wordtopdf.Interfaces.ConversionDocumento;

public class WordPdf implements ConversionDocumento {

	@Override
	public void convertir(String ruta, String nombreDestino) {
		Document word = new Document(ruta);
		word.saveToFile(nombreDestino, FileFormat.PDF);
		
	}
	
}
