package fr.d4delta.coretest;

import fr.d4delta.dcore.Artifact;
import fr.d4delta.dcore.event.EndEvent;
import fr.d4delta.dcore.event.EventOption;
import fr.d4delta.dcore.event.InitEvent;
import fr.d4delta.dcore.event.TickEvent;
import java.util.Calendar;

/**
 *
 * @author D4Death
 */
public class TestArtifact extends Artifact<CoreTest> {
    
    long startTime;
    long endTime;
    int ticks = 0;
    public TestArtifact(CoreTest game) {
        super(game);
    }
    
    public void init(InitEvent event) {
        startTime = Calendar.getInstance().getTimeInMillis();
        System.out.println("Initing");
    }
    
    @EventOption(options = {"POSITION=START"})
    public void startTick(TickEvent event) {
        System.out.println("Start ticking");
    }
    
    public void tick(TickEvent event) {
        System.out.println("Ticking");
        if(ticks++ >= 10) {
            application.finish();
        }
    }
    
    @EventOption(options = {"POSITION=END"})
    public void endTick(TickEvent event) {
        System.out.println("End ticking");
    }
    
    public void end(EndEvent end) {
        System.out.println("Ending");
    }
    
}
