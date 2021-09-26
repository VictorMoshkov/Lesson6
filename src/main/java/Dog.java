class Dog extends Animal{


    public  Dog(String name2, int run2, int swim2){
        Animal.name2 = name2;
        Animal.run2 = run2;
        Animal.swim2 = swim2;

        if (run2 > 500){
            System.out.println("Собака устала");
            
        }

        if (swim2 > 10 ){
            System.out.println("Собака утонула");
        }

    }

}














