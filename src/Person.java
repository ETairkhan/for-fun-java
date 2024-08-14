public class Person {
        private String name;
        private SimpleDate birthday;
        private int weight;
        private int height;

        public Person(String name ,int height){
            this.name = name;
            this.height = height;
        }

        public Person(String name){
            this.name =name;
            this.weight = 0;
            this.height = 0;
        }


            public Person(String name, SimpleDate date, int height , int weight) {
                this.name = name;
                this.birthday = date;
                this.weight = weight;
                this.height = height;
            }

        public Person(String name, int day, int month, int year, int height , int weight) {
            this.name = name;
            this.birthday = new SimpleDate(day, month, year);
            this.weight = weight;
            this.height = height;
         }


        // other constructors and methods

        public String getName() {
            return this.name;
        }


        public int getHeight() {
            return this.height;
        }

         public int getWeight() {
            return weight;
        }


        public void setHeight(int newHeight) {
            this.height = newHeight;
        }

        public void setWeight(int newWeight) {
            this.weight = newWeight;
        }

        public double bodyMassIndex() {
            double heightPerHundred = this.height / 100.0;
            return this.weight / (heightPerHundred * heightPerHundred);
        }

        boolean olderThan(Person compared){
            return this.birthday.before(compared.birthday);
        }

        public boolean equals(Object compared){
                if (this == compared){
                    return true;
                }


                if(!(compared instanceof Person)){
                    return false;
                }

                Person comparedPerson = (Person) compared;

                if(this.name.equals(comparedPerson.name)&& this.birthday == comparedPerson.birthday&& this.weight == comparedPerson.weight && this.height == comparedPerson.height){
                    return true;
                }
                return false;

        }
        public String toString(){
            return name+"(" + height + ")";
        }


}

