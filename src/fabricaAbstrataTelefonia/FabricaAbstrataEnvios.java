

package fabricaAbstrataTelefonia;

/**
 *
 * @author felipe
 */
public abstract class FabricaAbstrataEnvios {        
    public abstract Cobranca criaCobranca();
    public abstract EnvioSMS criaEnvioSMS();
}
