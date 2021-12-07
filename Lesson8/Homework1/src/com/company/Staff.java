package com.company;

    public class Staff {
        private int id;
        private String name;
        private int age;
        private int phonenumber;
        private String email;
        private long salary;

        public Staff(int id, String name, int age, int phonenumber, String email, long salary) {
            this.id = id;
            this.name = name;
            this.age = age;
            this.phonenumber = phonenumber;
            this.email = email;
            this.salary = salary;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public int getPhonenumber() {
            return phonenumber;
        }

        public String getEmail() {
            return email;
        }

        public long getSalary() {
            return salary;
        }

        public void setId(int id) {
            this.id = id;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void setPhonenumber(int phonenumber) {
            this.phonenumber = phonenumber;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public void setSalary(long salary) {
            this.salary = salary;
        }

        @Override
        public String toString() {
            return " Mã nhân viên: " + id +
                    ", Tên: " + name +
                    ", Tuổi: " + age +
                    ", Số điện thoại: " + phonenumber +
                    ", Email: " + email +
                    ", Lương cơ bản: " + salary
                    ;
        }
}

