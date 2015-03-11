package fr.d4delta.coretest;

import fr.d4delta.dcore.CentralizedRegisterer;
import fr.d4delta.dcore.Core;

/**
 *
 * @author D4Death
 */
public class CoreTest extends Core {
    
    public CoreTest() {
        super("CoreTest");
    }

    public static void main(String[] args) {
        new CoreTest().run();
    }
    
    @Override
    public void loadArtifacts(CentralizedRegisterer centralizedRegisterer) throws Exception {
        centralizedRegisterer.registerEventListener(
        new TestArtifact(this)
        );
    }
    
}
