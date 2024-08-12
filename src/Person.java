public class Person {
        private String name;
        private SimpleDate birthday;
        private int weight;
        private int height;

            public Person(String name, SimpleDate date) {
                this.name = name;
                this.birthday = date;
            }

        public Person(String name, int day, int month, int year) {
            this.name = name;
            this.birthday = new SimpleDate(day, month, year);
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
//    public boolean olderThan(Person compared) {
//        // 1. First compare years
//        int ownYear = this.getBirthday().getYear();
//        int comparedYear = compared.getBirthday().getYear();
//
//        if (ownYear < comparedYear) {
//            return true;
//        }
//
//        if (ownYear > comparedYear) {
//            return false;
//        }
//
//        // 2. Same birthyear, compare months
//        int ownMonth = this.getBirthday().getMonth();
//        int comparedMonth = compared.getBirthday().getMonth();
//
//        if (ownMonth < comparedMonth) {
//            return true;
//        }
//
//        if (ownMonth > comparedMonth) {
//            return false;
//        }
//
//        // 3. Same birth year and month, compare days
//        int ownDay = this.getBirthday().getDay();
//        int comparedDay = compared.getBirthday().getDay();
//
//        if (ownDay < comparedDay) {
//            return true;
//        }
//
//        return false;
//    }
}

