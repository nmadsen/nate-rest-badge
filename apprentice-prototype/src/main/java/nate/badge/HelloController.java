package nate.badge;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.net.URI;
import java.util.Collection;

@Component
@RestController
public class HelloController extends SpringBeanAutowiringSupport {

    @Autowired
    private ShoppingListService shoppingListService;

    @RequestMapping("/")
    String hello() {
        return "Hello World!";
    }

    @RequestMapping(value = "/shopping-list", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON)
    Collection<Item> getAllItems() {
        return shoppingListService.getAllItems();
    }

    @RequestMapping(value = "/shopping-list/{lid}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON)
    public Item getItem(@PathVariable(value = "lid") String lid) {
        return shoppingListService.getItem(lid);
    }

    @RequestMapping(value = "/shopping-list", method = RequestMethod.POST)
    public Response addItem(@RequestBody Item item) {
        shoppingListService.addItem(item);
        return Response.noContent().build();
//        return Response.created(URI.create("http://localhost:8080/shopping-list/" + item.getId())).build();
    }

    @RequestMapping(value = "/shopping-list/{lid}", method = RequestMethod.PUT)
    public Response updateItem(@PathVariable(value = "lid") String lid, @RequestBody Item item) {
        shoppingListService.updateItem(lid, item);
        return Response.noContent().build();
    }

    @RequestMapping(value = "/shopping-list/{lid}", method = RequestMethod.DELETE)
    public Response deleteItem(@PathVariable(value = "lid") String lid) {
        shoppingListService.deleteItem(lid);
        return Response.noContent().build();
    }

}
