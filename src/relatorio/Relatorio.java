package relatorio;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import util.Conecxao;

public class Relatorio {

    // JasperPrint imprimirJ;
    private ByteArrayOutputStream baos;
    private InputStream steam;

    public void getRelatorio() {
//
//        steam = this.getClass().getResourceAsStream("estatistica.jasper");
//        Map<String, Object> params = new HashMap<>();
//        baos = new ByteArrayOutputStream();
//
//        try {
//
//            Connection conexao = Conecxao.getConexao();
//            JasperReport report = (JasperReport) JRLoader.loadObject(steam);
//            JasperPrint print = JasperFillManager.fillReport(report, params, conexao);
//            JasperExportManager.exportReportToPdfStream(print, baos);
//
//            response.reset();
//            response.setContentType("application/pdf");
//            response.setContentLength(baos.size());
//            response.setHeader("Content-disposition", "inline; filename=Relatório3.pdf");
//
//            response.getOutputStream().write(baos.toByteArray());
//
//            response.getOutputStream().flush();
//            response.getOutputStream().close();
//
//            context.responseComplete();
//
//            Conecxao.fecharConexao();
//
//        } catch (JRException ex) {
//            Logger.getLogger(Relatorio.class.getName()).log(Level.SEVERE, null, ex);
//        }

    }

}
