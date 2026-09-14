public class oop {

    static class  animal{

       private   String name;
        private String sound;

        public animal(String name, String sound) {
            this.name = name;
            this.sound = sound;
        }

        public boolean Sound(String name){
            System.out.println("Animal is started sounding.....");
            return false;
        }


        public String getName( String name) {
                return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getSound(String sound) {
            return sound;
        }

        public void setSound(String sound) {
            this.sound = sound;
        }
    }

    static void main() {

        animal Animal=new animal( "Cat", "Meyao...");

        animal pet= new animal("horse","hahahha");

        System.out.println(Animal);
        System.out.println(Animal.name);
        System.out.println(Animal.sound);

        System.out.println(pet.name);
        System.out.println(Animal.Sound("Cat"));
    }
}
