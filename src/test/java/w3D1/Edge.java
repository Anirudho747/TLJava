package w3D1;

public class Edge extends Chrome{
    public static void takeSnap()
    {
        System.out.println("Within takeSnap method of Edge Class");
    }

    public static void clearCookies()
    {
        System.out.println("Within clearCookies method of Edge Class");
    }

    public static void main(String[] args)
    {
        openURL();
        closeBrowser();
        navigateBack();
        openIncognito();
        clearCache();
        takeSnap();
        clearCookies();
    }
}
