import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("Enter Your Pet Name: ");
    String name = scan.nextLine();

    VirtualPet pet = new VirtualPet(name, 10, 10, 10, 10);

    System.out.println(pet + "|\\---/| \n| o_o | \n \\_^_/ \n");

    System.out.print("What Would You Like To Do? \n 1. Feed " + name + "\n 2. Water " + name + "\n 3. Play with " + name
        + "\n 4. Put " + name + " To Sleep" + "\n 5. Do Nothing" + "\n 6. Quit" + "\n Please Enter Your Choice Here: ");
    int user = Integer.parseInt(scan.nextLine());
    System.out.println("************************************ \n \n");

    // loop for user to keep going until they choose to stop//
    while (user != 6) {

      // If They Water//
      if (user == 1) {
        System.out.print("What Would You Like To Feed " + name + "\n 1. Pizza \n 2. Burger \n 3. Chicken Parmesan"
            + "\n Please Enter Your Choice Here: ");
        int food = Integer.parseInt(scan.nextLine());
        // Feed Pizza//
        if (food == 1) {
          System.out.println(name + " Loves Pizza And Eats 5 Slices!!!" + " \n|\\---/|  \n| ^_^ |  \n \\_^_/" + "\n"
              + "\n************************************");
          pet.feed(6);
          pet.water(-2);
          System.out.println(pet);
          pet.tick(1);
          System.out.println(pet + "************************************");
        }
        // Feed Burger//
        if (food == 2) {
          System.out.println(name + " Hates Burgers And Throws It Away!!! " + " \n|\\---/| Grr \n| o_O | ^ \n \\_^_/"
              + "\n************************************");
          pet.feed(-2);
          pet.water(-2);
          System.out.println(pet);
          pet.tick(2);
          System.out.println(pet + "************************************");
        }
        // Feed Chicken Parmesan//
        if (food == 3) {
          System.out.println(name + " Eats Chicken Parmesan!!!" + "\n************************************");
          pet.feed(4);
          pet.water(-1);
          System.out.println(pet);
          pet.tick(1);
          System.out.println(pet + "************************************");

        }
      }

      // If They Water//
      if (user == 2) {
        System.out.print("What Would You Like To Give " + name + "\n 1. Water \n 2. Sprite \n 3. Gatorade"
            + "\n Please Enter Your Choice Here: ");
        int drink = Integer.parseInt(scan.nextLine());

        // Give Water//
        if (drink == 1) {
          System.out.println(name + " Drinks Water!!!" + "\n************************************");
          pet.water(4);
          System.out.println(pet);
          pet.tick(1);
          System.out.println(pet + "************************************");
        }

        // Give Sprite//
        if (drink == 2) {
          System.out.println(name + " Loves Sprite And Drinks 5 Cans!!! " + " \n|\\---/|  \n| ^_^ |  \n \\_^_/" + "\n"
              + "\n************************************");
          pet.water(6);
          System.out.println(pet);
          pet.tick(1);
          System.out.println(pet + "************************************");
        }

        // Give Gatorade//
        if (drink == 3) {
          System.out.println(name + " Hates Gatorade And Throws Away The Drink!!!"
              + " \n|\\---/| Grr \n| o_O | ^ \n \\_^_/" + "\n" + "\n************************************");
          pet.water(-3);
          System.out.println(pet);
          pet.tick(1);
          System.out.println(pet + "************************************");
        }
      }

      // if user plays with pet//
      if (user == 3) {
        System.out.println("You Play With " + name + '!');
        pet.bored(6);
        pet.feed(-1);
        pet.water(-1);
        pet.tired(-1);
        System.out.println(pet);
        pet.tick(1);
        System.out.println(pet + "************************************");
      }

      // if user puts pet to sleep//
      if (user == 4) {
        System.out.println("You Put " + name + " To Sleep!");
        pet.tired(6);
        pet.feed(-1);
        pet.water(-1);
        System.out.println(pet);
        pet.tick(1);
        System.out.println(pet + "************************************");
      }

      if (user == 5) {
        System.out.println("You Did Not Do Anything!!!");
        pet.nothing(-2);
        System.out.println(pet);
        pet.tick(1);
        System.out.println(pet + "************************************");
      }

      // Prioritizing The Pets Needs//
      int[] a = new int[] { pet.getHunger(), pet.getThirst(), pet.getBoredom(), pet.getTiredness() };
      int max = a[0];
      for (int i = 0; i < a.length; i++) {
        if (a[i] > max) {
          max = a[i];
        }
      }

      if (a[0] == max) {
        System.out.println("Hunger Is The Highest Need For The Pet At This Moment!!!");
      }
      if (a[1] == max) {
        System.out.println("Thirst Is The Highest Need For The Pet At This Moment!!!");
      }
      if (a[2] == max) {
        System.out.println("Boredom Is The Highest Need For The Pet At This Moment!!!");
      }
      if (a[3] == max) {
        System.out.println("Tiredness Is The Highest Need For The Pet At This Moment!!!");
      }
      System.out.print("************************************ \n");

      // if hunger is to high//
      if (pet.getHunger() > 15) {
        System.out.println("The Pet Is Hungry!!! \n" + "|\\---/| Grr \n| o_O | ^ \n \\_^_/"
            + "\n ************************************ \n \n");
      }

      // if thirst is to high//
      if (pet.getThirst() > 15) {
        System.out.println("The Pet Is Thirsty!!! \n" + "|\\---/| Grr \n| o_O | ^ \n \\_^_/"
            + "\n ************************************ \n \n");
      }

      // if boredom is to high//
      if (pet.getBoredom() > 15) {
        System.out.println("The Pet Is Bored!!! \n" + "|\\---/| Play With Me!! \n| ?_? | ^ \n \\_^_/"
            + "\n ************************************ \n \n");
      }

      // if tiredness is to high//
      if (pet.getTiredness() > 15) {
        System.out.println("Your Pet Is Tired!!! \n" + "|\\---/| zzz \n| -_- | ^ \n \\_^_/"
            + "\n ************************************ \n \n");
      }

      // if boredom is low the pet is happy//
      if (pet.getBoredom() <= 0) {
        System.out.println(name + " Is Very Happy!!! \n" + "|\\---/|  \n| ^_^ |  \n \\_^_/" + "\n");
      }

      // end of loop//
      System.out.print("What Would You Like To Do? \n 1. Feed " + name + "\n 2. Water " + name + "\n 3. Play with "
          + name + "\n 4. Put " + name + " To Sleep" + "\n 5. Do Nothing" + "\n 6. Quit"
          + "\n Please Enter Your Choice Here: ");
      user = Integer.parseInt(scan.nextLine());
      System.out.println("************************************ \n \n");

    }
    // If User Quits//
    if (user == 6) {
      System.out.println("Thanks For Playing!");
    }
  }
}