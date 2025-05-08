package in.kgcoding.inheritence;

public class Vehicle {
    protected int noOfTyres;

    public void setNoOfTyres(int noOfTyres) {
        this.noOfTyres = noOfTyres;
    }

    public void commute() {
        System.out.printf("I am going from place A to place B using %d tyres \n", noOfTyres);
    }
}
