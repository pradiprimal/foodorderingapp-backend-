package test;

import com.foodorderingapp.dao.FoodDAO;
import com.foodorderingapp.dao.RestaurantDAO;
import com.foodorderingapp.dto.Food;
import com.foodorderingapp.dto.Restaurant;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.junit.BeforeClass;
import static org.junit.Assert.assertEquals;

public class FoodTest {

    private static AnnotationConfigApplicationContext context;

    private static FoodDAO foodDAO;

    private static RestaurantDAO restaurantDAO;

    private Food food;

    @BeforeClass
    public  static  void init(){
        context = new AnnotationConfigApplicationContext();
        context.scan("com.foodorderingapp");
        context.refresh();
        foodDAO = (FoodDAO)context.getBean("foodDAO");
        restaurantDAO = (RestaurantDAO) context.getBean("restaurantDAO");
    }
    /*
    @Test
    public void testAddFood(){
        food = new Food();
        food.setName("Momo");
        food.setPrice(450);
        food.setRestaurant(restaurantDAO.getRestaurantById(5));
        assertEquals("Failed", true, foodDAO.addFoodToRestaurant(food));
    }
    */

    /*@Test
    public void testDeleteFood(){
        food = foodDAO.getFoodById(30);
        assertEquals("failed to delete food!", true, foodDAO.deleteFood(food));
    }*/

    /*@Test
    public  void testUpdateFood(){
        food = foodDAO.getFoodById(31);
        food.setName("Jarda Paan");
        food.setPrice(45);
        assertEquals("failed to update food", true, foodDAO.updateFood(food));
    }*/

    /*
    @Test
    public void testGetAllFood(){
        assertEquals("",7, foodDAO.getAll().size());
    }*/

    /*@Test
    public void testGetFoodByRestaurant(){
        assertEquals("",3,foodDAO.getFoodByRestaurantId(18).size());
    }*/

}