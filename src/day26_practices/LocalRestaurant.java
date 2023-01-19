package day26_practices;

public class LocalRestaurant {
    public static void main(String[] args) {

        Server server1 = new Server("Cemil", 1234,15, true);
        Server server2 = new Server("Kamil", 4567,13, false);
        Server server3 = new Server("Metin",7890,15, true);

        Server[] servers = {server1, server2, server3};


        Chef[] chefs = {
                new Chef("Halim", 23, 35, true),
                new Chef("Habib", 22, 26, false),
                new Chef("Bojan", 21, 27, true),
        };

        Restaurant restaurant= new Restaurant("Celil","Mombach",5);

        restaurant.hireServer(servers);
        restaurant.hireChef(chefs);

        System.out.println(restaurant);



    }

}
/*
 Create a class LocalRestaurant that has a main method with the following:
	        	- Make a Restaurant object
	        	- Create an array of servers with their information set. Add those initial servers to the ArrayList of Servers in the Restaurant object
	            - Create an array of chefs with their information set. Add those initial chefs to the ArrayList of Chefs in the Restaurant object

	            - Print your whole restaurants information
 */