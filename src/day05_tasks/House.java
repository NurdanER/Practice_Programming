package day05_tasks;

public class House {

    public static void main(String[] args) {

        String houseType = "Town House ";
        int numberOfBedrooms = 3;
        short numberOfBathrooms = 3;
        byte numberOfKitchen = 1;
        boolean isThereABasement = false;
        boolean isThereAnAttic = true;
        boolean isThereAPool = false;
        boolean isTheHouseForSale = true;
        long costOfTheHouse = 1_649_000L;
        String address = " Marina Del Ray, CA";
        int zipcode = 90292;
        boolean isThereAParkNearBy = true;
        byte ratingOfSurroundingSchoolDistricts = 5;

        System.out.println("Spectacular Waterfront Townhouse in CA:" + "\nHouse Type: " + houseType + "\nThe number of bedrooms is: " + numberOfBedrooms +
                "\nThe number of bathrooms is: " + numberOfBathrooms + "\nNumber Of Kitchens  is: " + numberOfKitchen +  "\nIs there a basement?: " + isThereABasement +
                "\nIs there an attick?: " + isThereAnAttic + "\nIs there a pool?: " + isThereAPool + "\nIs the house for Sale?: "  + isTheHouseForSale +
                "\nCost of the house: " + "$" + costOfTheHouse + "\nAddress: " + address + "\nZipcode: " + zipcode + "\nIs there a park nearby?: " +
                isThereAParkNearBy + "\nRating of surrounding school districts: " +ratingOfSurroundingSchoolDistricts);







    }
}
