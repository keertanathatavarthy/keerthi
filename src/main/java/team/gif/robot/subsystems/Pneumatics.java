

package team.gif.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import team.gif.robot.RobotMap;

import java.awt.*;

public class Pneumatics extends SubsystemBase {
    /** Creates a new ExampleSubsystem. */

    private DoubleSolenoid doubleSolenoid;

    public Pneumatics() {
        doubleSolenoid = new DoubleSolenoid(RobotMap.PCM_ID, PneumaticsModuleType.CTREPCM, 1,2);
        doubleSolenoid.set(DoubleSolenoid.Value.kForward);
    }
    public void toggle(){
        doubleSolenoid.toggle();
}
}

