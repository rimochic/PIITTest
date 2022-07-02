package statickeywords;

public class learnStatic {
    // static = unchanging, not unchangeable

      public static void main(String[] args) {
          Dog Alex = new Dog();
          Dog Fal = new Dog();

          Alex.Age = 8;
          Fal.Age = 10;

          Alex.Breed = "German";
          Fal.Breed = "Pit Bull";
          System.out.println(Alex.Breed);
          System.out.println(Fal.Breed);

          Alex.TypeOfAnimal = "Cow";
          System.out.println(Alex.Age);
          System.out.println(Fal.Age);
          System.out.println(Alex.TypeOfAnimal);
          System.out.println(Fal.TypeOfAnimal);

    }
}
