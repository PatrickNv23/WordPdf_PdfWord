package techcodenv.wordtopdf;

import com.spire.pdf.PdfDocument;
import com.spire.pdf.FileFormat;

import techcodenv.wordtopdf.Interfaces.ConversionDocumento;

public class PdfWord implements ConversionDocumento {

	@Override
	public void convertir(String ruta, String nombreDestino) {
		PdfDocument pdf = new PdfDocument(ruta);
		pdf.saveToFile(nombreDestino, FileFormat.DOCX);
		
	}

}
