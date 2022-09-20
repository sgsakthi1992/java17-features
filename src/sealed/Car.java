package sealed;

public sealed class Car implements MotorVehicle permits Geared, Automatic {
}
