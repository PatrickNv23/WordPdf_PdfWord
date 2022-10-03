package techcodenv.wordtopdf;

import java.util.Scanner;

public class App 
{
	
	private static Scanner leerOpcion;
	private static Scanner leerDocumento;
	
    public static void main( String[] args )
    {
        int opcion;
        leerOpcion = new Scanner(System.in);
        
        System.out.println("Selecciona la conversion que desea realizar: ");
        System.out.println("1. Convertir Word a Pdf ");
        System.out.println("2. Convertir Pdf a Word");
        System.out.println("3. Salir");
        opcion = leerOpcion.nextInt();
        
        switch(opcion) {
        case 1:
        	WordPdf wordpdf = new WordPdf();
        	wordpdf.convertir(ingresarDocumento("word"), ingresarDocumento("pdf"));
        	System.out.println("WORD a PDF: conversion completada");
        	break;
        	
        case 2:
        	PdfWord pdfword = new PdfWord();
        	pdfword.convertir(ingresarDocumento("pdf"), ingresarDocumento("word"));
        	System.out.println("PDF a WORD: conversion completada");
        	break;
        	
        default:
        	System.out.println("Gracias por utilizar el programa");
        	break;
        }
        
    }
    
    
    public static String ingresarDocumento(String tipoDocumento) {
    	String nombredocumento = "";
    	leerDocumento = new Scanner(System.in);
    	while(nombredocumento == "") {
    		System.out.println("Ingrese el nombre del documento " + tipoDocumento +" : ");
        	nombredocumento = leerDocumento.nextLine();
    	}
    	
    	return nombredocumento;
    }
    
   
}
