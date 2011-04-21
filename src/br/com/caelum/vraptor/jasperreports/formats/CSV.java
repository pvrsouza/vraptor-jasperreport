package br.com.caelum.vraptor.jasperreports.formats;

import net.sf.jasperreports.engine.JRExporter;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.export.JRCsvExporterParameter;
import net.sf.jasperreports.engine.export.JRXlsExporter;
import br.com.caelum.vraptor.jasperreports.ExportFormat;

/**
 * @author William Pivotto
 */

public class CSV implements ExportFormat {
	
	private JRExporter exporter;

	public CSV(){
		this.exporter = new JRXlsExporter();
		configure(JRCsvExporterParameter.CHARACTER_ENCODING, "UTF-8");
	}

	public String getContentType() {
		return "application/csv";
	}

	public String getExtension() {
		return ".csv";
	}

	public JRExporter getExporter() {
		return exporter;
	}
	
	public ExportFormat configure(JRExporterParameter parameter, Object value) {
		exporter.setParameter(parameter, value);
		return this;
	}
	
	public String toString() {
		return "csv";
	}

}
