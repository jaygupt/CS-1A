public class Patient {
   // instance members
   private String name;
   private int id;
   private double temperature;

   // static members
   public static final int MIN_LENGTH = 2;
   public static final int MAX_LENGTH = 40;

   public static final int MIN_ID = 0;
   public static final int MAX_ID = 9999;

   public static final int MIN_TEMP = 88;
   public static final int MAX_TEMP = 111;

   public static final double ALARM_TEMP = 103.5;

   public static final double DEFAULT_TEMP = 98.6;
   public static final String DEFAULT_NAME = "nobody";
   public static final int DEFAULT_ID = 0;


   // default constructor
   public Patient() {
      name = DEFAULT_NAME;
      id = DEFAULT_ID;
      temperature = DEFAULT_TEMP;
   }

   public Patient(String name, int id, double temperature) {
      setName(name);
      setId(id);
      setTemperature(temperature);
   }

   public String getName() {
      return name;
   }

   public int getId() {
      return id;
   }

   public double getTemperature() {
      return temperature;
   }

   public boolean setName(String name) {
      int nameLength = name.length();
      if (nameLength < MIN_LENGTH || nameLength > MAX_LENGTH) {
         this.name = DEFAULT_NAME;
         return false;
      } else {
         this.name = name;
         return true;
      }
   }

   public boolean setId(int id) {
      if (id < MIN_ID || id > MAX_ID) {
         this.id = DEFAULT_ID;
         return false;
      } else {
         this.id = id;
         return true;
      }
   }

   public boolean setTemperature(double temperature) {
      if (temperature < 88 || temperature > 111) {
         this.temperature = DEFAULT_TEMP;
         return false;
      } else {
         this.temperature = temperature;
         return true;
      }
   }

   public void display() {
      System.out.println("Patient: " + "\n Name: " + name
      + "\n ID: " + id + "\n Body Temperature: " + temperature + " (F)");
      if (temperature > ALARM_TEMP) {
         System.out.println("*** urgent: attend immediately ***");
      }
   }
}
