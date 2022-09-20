package sealed;

public sealed interface MotorVehicle extends Vehicle permits Car, Bike  {

}
