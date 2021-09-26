class Cat extends Animal{




    public Cat(String name, int run, int swim){
       
        Animal.name = name;
        Animal.run = run;
        Animal.swim = swim;

        if (run > 200){
            System.out.println("Кошка устала");

        }
        if (swim > 0 ){
            System.out.println("Кошка утонула");
        }

    }

}
