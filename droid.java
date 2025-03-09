public class Droid{

  int batteryLevel;
  String name;

  public String toString(){
    return "Hello, I'am the droid: "  + name;
  }

  public static void main(String[]args){
    Droid Codey = new Droid("Codey");
    System.out.println(Codey);
    System.out.println(Codey.performTask("dancing"));
    Codey.batteryLevel -=10;

  }

  public Droid (String droidName){
    name=droidName;
    batteryLevel = 100;
  }

  public String performTask(String task){
    return task;
  }

 public void energyReport() {
    System.out.println("Battery level: " + batteryLevel);
  }
}

  
