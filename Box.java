class Box {
    private double width;
    private double height;
    private double depth;
    Box(double width, height, depth){
    width = height = depth;}}

    publicclass CT2_Q2
    {

    publicstaticvoid main(String[] args) {
        myBox1 = new Box(1, 2, 3);
        doublevol = width * height * depth;
        System.out.println("Volume of the first Box:" + vol);
        myBox2 = new Box(7, 7, 7);
        vol = width * height * depth;
        System.out.println("Volume of the second Box:" + vol);
    }
}