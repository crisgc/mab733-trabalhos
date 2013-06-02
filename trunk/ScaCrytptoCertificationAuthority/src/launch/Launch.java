package launch;

import java.io.IOException;

import org.apache.tuscany.sca.host.embedded.SCADomain;

public class Launch {
    public static void main(String[] args) throws Exception {
        System.out.println("Starting ...");
        SCADomain scaDomain = SCADomain.newInstance("authority.composite");
        
        try {
            System.out.println("CertificationAuthority server started (press enter to shutdown)");
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }

        scaDomain.close();
        System.out.println("CertificationAuthority server stopped");
    }
}
