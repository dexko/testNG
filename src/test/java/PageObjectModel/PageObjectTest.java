package PageObjectModel;
import base.BaseTestPageObject;
import org.testng.annotations.Test;

public class PageObjectTest extends BaseTestPageObject {
    @Test
    public void wishlistMy(){
        getWebDriver().get("https://shop.demoqa.com");
        Home wishing = new Home(getWebDriver());
        wishing.addToWishlist();
        wishing.goToWishlist();
        WishList wish = new WishList(getWebDriver());
        wish.checkWishlist();
        allureLog("wishlist passes");
    }
    @Test
    public void shirtToCart(){
        getWebDriver().get("https://shop.demoqa.com");
        Home shirt = new Home(getWebDriver());
        shirt.selectItem();
        PinkShirt pink = new PinkShirt(getWebDriver());
        pink.chooseColor();
        pink.chooseSize();
        pink.chooseQuantity();
        pink.addToCart();
        pink.goToCart();
        Cart cart = new Cart(getWebDriver());
        cart.checkCart();
        allureLog("Pink shirt test passed");

}}
