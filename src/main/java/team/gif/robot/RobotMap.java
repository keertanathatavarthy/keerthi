package team.gif.robot;

public abstract class RobotMap {
    // Controllers
    public static final int DRIVER_CONTROLLER_ID = 0;
    public static final int AUX_CONTROLLER_ID = 1;
    public static final int TEST_CONTROLLER_ID = 2;
    public static final int LIMIT_SWITCH_ID = 9;
    public static final int PIGEON_ID = 9;
    public static final int TALON_ID = 5; //We're not using the talon as a winch motor on the BAB, adjust the name accordingly (Hint: look at the format below)
    public static final int SPARKMAX_ID = 45;
    public static final int PCM_ID = 1;

}
