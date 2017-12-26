package test;

import com.foodorderingapp.dao.RestaurantDAO;
import com.foodorderingapp.dto.Restaurant;
import com.foodorderingapp.service.FoodService;
import com.foodorderingapp.service.RestaurantService;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.junit.BeforeClass;
import static org.junit.Assert.assertEquals;

public class RestaurantTest {

    private static AnnotationConfigApplicationContext context;

    private static RestaurantDAO restaurantDAO;

    private static Restaurant restaurant;

    @BeforeClass
    public static void init(){
        context = new AnnotationConfigApplicationContext();
        context.scan("com.foodorderingapp");
        context.refresh();
        restaurantDAO = (RestaurantDAO)context.getBean("restaurantDAO");
    }
    @Test
    public void testRestaurant(){

        //add restaurant
        /*restaurant = new Restaurant();
        restaurant.setName("Restaurant abc");
        restaurant.setAddress("Restaurant address one");
        restaurant.setContact("Restaurant contact one");
        assertEquals("failed to add restaurant", true, restaurantDAO.addRestaurant(restaurant));*/

        //update restaurant
        /*restaurant = restaurantDAO.getRestaurantById(5);
        restaurant.setName("KFC");
        restaurant.setAddress("Durbarmarg");
        restaurant.setContact("015555444");
        assertEquals("failed to update restaurant",true, restaurantDAO.updateRestaurant(restaurant));*/

        //delete restaurant
       /* restaurant = restaurantDAO.getRestaurantById(4);
        assertEquals("restaurant already deleted or doesn't exist!", true, restaurantDAO.deleteRestaurant(restaurant));*/

        //get restaurant status
/*
        int id = 42;
        boolean status = restaurantDAO.getStatus(id);
        System.out.println("Status of restaurant with id "+id +" is "+status);
*/

        //deactivate restaurant
        /*
        int id = 14;
       if(restaurantDAO.getRestaurantById(id)!= null){
           if(restaurantDAO.getStatus(id)!= false){
               restaurantDAO.deactivate(id);

           }
           else
               System.out.println("Restaurant with id "+id+" is already deactivated!");
       }
       else
        System.out.println("Restaurant with id "+id+" doesn't exist!");
    }
    */

        //activating restaurant
        int id = 50;
        if(restaurantDAO.getRestaurantById(id)!= null){
        if(restaurantDAO.getStatus(id)!=true){
            restaurantDAO.activate(id);
            System.out.println("Restaurant with id "+id+" has been activated successfully!");
        }
        else
            System.out.println("Restaurant with id "+id+" is already activated!");
        }
        else
            System.out.println("Restaurant with id "+id+" doesn't exist!");
    }

}