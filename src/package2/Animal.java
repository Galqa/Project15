package package2;


    // Створюємо клас Animal, який використовує  анотацію @Inherited
    @InheritedExample
  public  class Animal {
        private String name;
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
    }

