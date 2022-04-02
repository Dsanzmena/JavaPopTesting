/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GeneradorWord;

import Clases.*;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.apache.poi.xwpf.usermodel.ParagraphAlignment;
import org.apache.poi.xwpf.usermodel.UnderlinePatterns;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;




public class Word {

    private Producto producto;
    
    public Word(Producto p) {
        this.producto=p;
    }
    
    private XWPFDocument document=new XWPFDocument();
    
    public void crear(){
        
        javax.swing.filechooser.FileNameExtensionFilter filtroWord=new FileNameExtensionFilter("Microsoft Word", "docx"); 
        JFileChooser miArchivo=new JFileChooser();//CREAMOS UN FILECHOOSER QUE SOLO COGERÁ ARCHIVOS DOCX
        miArchivo.setFileFilter(filtroWord);
   
        
        int aceptar=miArchivo.showSaveDialog(null);
        miArchivo.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);//SOLO DIRECTORIOS
        if(aceptar==JFileChooser.APPROVE_OPTION){//SI PULSA ACEPTAR
            File fileWord=miArchivo.getSelectedFile();
          
            

            try { //ESCRITURA EN EL WORD MEDIANTE CREACIÓN DE PÁRRAFOS
                FileOutputStream output=new FileOutputStream(fileWord);

                XWPFParagraph parrafoTitulo=document.createParagraph();
                XWPFRun titulo=parrafoTitulo.createRun();

                parrafoTitulo.setAlignment(ParagraphAlignment.CENTER);
                titulo.setBold(true);
                titulo.setFontSize(40);
                titulo.setText("FACTURA DE LA VENTA");
                titulo.setColor("437ea8");
                titulo.addBreak();
            

                
                XWPFParagraph tituloDescripcion=document.createParagraph();
                XWPFRun tituloDescripciónProducto=tituloDescripcion.createRun();
                tituloDescripciónProducto.setBold(true);
                tituloDescripciónProducto.setFontSize(20);
                tituloDescripciónProducto.setText("DATOS DE LA FACTURA");
                tituloDescripciónProducto.setColor("437ea8");
                tituloDescripciónProducto.addBreak();
                tituloDescripciónProducto.setUnderline(UnderlinePatterns.SINGLE);
                tituloDescripciónProducto.setText(".											                                                                                .");
                tituloDescripciónProducto.addBreak();
                
                XWPFParagraph tituloProducto=document.createParagraph();
                XWPFRun tituloDescrProducto=tituloProducto.createRun();
                tituloDescrProducto.setUnderline(UnderlinePatterns.SINGLE);
                tituloDescrProducto.setFontSize(20);
                tituloDescrProducto.setBold(true);
                tituloDescrProducto.setText("Producto: ");
                tituloDescrProducto.setColor("657b8c");
               
               
                
                
                XWPFParagraph parrafoDescripcion=document.createParagraph();
                XWPFRun descripciónProducto=parrafoDescripcion.createRun();
                descripciónProducto.setText("Título: "+ producto.getTitulo().toString());
                descripciónProducto.addBreak();
                descripciónProducto.setText("Descripción: "+producto.getDescripcion());
                descripciónProducto.addBreak();
                descripciónProducto.setText("Categoría: "+producto.getCategoria());
                descripciónProducto.addBreak();
                descripciónProducto.setText("Estado: "+producto.getEstado());
                descripciónProducto.addBreak();
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
                String fechaPublicFormateada = producto.getFechaPublicacion().format(formatter);
                descripciónProducto.setText("Fecha publicación: "+fechaPublicFormateada);
                descripciónProducto.addBreak();
                String fechaVentaFormateada = producto.getFechaVenta().format(formatter);
                descripciónProducto.setText("Fecha venta: "+fechaVentaFormateada);
                descripciónProducto.addBreak();
                descripciónProducto.setText("Procedencia del producto: "+producto.getUbicacion().getCiudad());
                descripciónProducto.addBreak();
                descripciónProducto.addBreak();
                
                
                XWPFParagraph tituloDatos=document.createParagraph();
                XWPFRun tituloDatosComprador=tituloDatos.createRun();
                tituloDatosComprador.setBold(true);
                tituloDatosComprador.setFontSize(20);
                tituloDatosComprador.setUnderline(UnderlinePatterns.SINGLE);
                tituloDatosComprador.setText("Datos del comprador y vendedor:");
                tituloDatosComprador.setColor("657b8c");
            
                
                
                XWPFParagraph parrafoDatos=document.createParagraph();
                XWPFRun datosCompradorVendedor=parrafoDatos.createRun();
                datosCompradorVendedor.setText("Vendedor: "+producto.getVendedor().getNombre()+" con DNI: "+producto.getVendedor().getDni());
                datosCompradorVendedor.addBreak();
                datosCompradorVendedor.setText("Comprador: "+producto.getPosibleComprador().getNombre()+" con DNI: "+producto.getPosibleComprador().getDni());
                datosCompradorVendedor.addBreak();
                datosCompradorVendedor.setText("Han realizado la transacción del producto por un importe de "+String.valueOf(producto.getPrecioVenta())+"€.");
                datosCompradorVendedor.addBreak();
                

                document.write(output);
                output.close();
            }
            catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage().toString());
            }
            
            finally{//POR SI FUERA SISTEMA OPERATIVO LINUX
                try {
                    if(System.getProperty("os.name").equals("Linux")){
                        Runtime.getRuntime().exec("libreoffice"+fileWord.getAbsolutePath());
                    }
                    else{
                        Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "+fileWord.getAbsolutePath());
                    }
                }
                catch (IOException ex) {
                    Logger.getLogger(Word.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
}
