 public class Patient{
        private static int  counter = 1;
        private String id;
        private String name;
        private String gender;
        private int age;
        private String diagnosis;

        public Patient(String id, String name, String gender, int age, String diagnosis) {
            this.id = String.format("A%03d", counter++);
            this.name = name;
            this.gender = gender;
            this.age = age;
            this.diagnosis = diagnosis;
        }

     public String getId() {
         return id;
     }

     public void setId(String id) {
         this.id = id;
     }
     public String getName() {
            return name;
     }
     public void setName(String name) {
            this.name = name;
     }
     public String getGender() {
            return gender;
     }
     public void setGender(String gender) {

     }
     public int getAge() {
            return age;
     }
     public void setAge(int age) {
            this.age = age;
     }
     public String getDiagnosis() {
            return diagnosis;
     }
     public void setDiagnosis(String diagnosis) {
            this.diagnosis = diagnosis;
     }

  @Override
  public String toString(){
            return id + " " + name + " " + gender + " " + age + " " + diagnosis;
  }
 }



