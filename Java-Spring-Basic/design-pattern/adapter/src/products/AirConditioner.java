package products;

import electronic.Electronic220V;

public class AirConditioner implements Electronic220V {

    @Override
    public void connect() {
        System.out.println("에어컨 220V ON");
    }
}
