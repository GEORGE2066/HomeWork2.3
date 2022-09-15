public interface Method {
    static void printCheck(Car car, Bicycle bicycle, Truck truck) {
        if (car != null) {
            System.out.println("Обслуживаем " + car.getModelName());
        } else {
            System.out.println("У машины нет данных");
        }

        if (bicycle != null) {
            System.out.println("Обслуживаем " + bicycle.getModelName());
        } else {
            System.out.println("У велосипеда нет данных");
        }

        if (truck != null) {
            System.out.println("Обслуживаем " + truck.getModelName());
        } else {
            System.out.println("У трэка нет данных");
        }
    }
}
