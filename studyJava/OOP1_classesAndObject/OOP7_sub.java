class OOP7_sub extends OOP7_super {
    private String modelName = "Mustang";
    public static void main(String[] args) {
        OOP7_sub myCar = new OOP7_sub();

        myCar.honk(); // method from superclass named OOP7_super
        System.out.println(myCar.brand+" "+myCar.modelName);
    }
}
