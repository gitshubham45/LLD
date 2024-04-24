// Abstract Factory
interface AbstractCarFactory {
    Sedan createSedan();
    SUV createSUV();
}

// Concrete Factory 1
class FordFactory implements AbstractCarFactory {
    @Override
    public Sedan createSedan() {
        return new FordSedan();
    }

    @Override
    public SUV createSUV() {
        return new FordSUV();
    }
}

// Concrete Factory 2
class ToyotaFactory implements AbstractCarFactory {
    @Override
    public Sedan createSedan() {
        return new ToyotaSedan();
    }

    @Override
    public SUV createSUV() {
        return new ToyotaSUV();
    }
}

// Abstract Products
interface Sedan {
    void drive();
}

interface SUV {
    void drive();
}

// Concrete Products
class FordSedan implements Sedan {
    @Override
    public void drive() {
        System.out.println("Driving Ford Sedan");
    }
}

class FordSUV implements SUV {
    @Override
    public void drive() {
        System.out.println("Driving Ford SUV");
    }
}

class ToyotaSedan implements Sedan {
    @Override
    public void drive() {
        System.out.println("Driving Toyota Sedan");
    }
}

class ToyotaSUV implements SUV {
    @Override
    public void drive() {
        System.out.println("Driving Toyota SUV");
    }
}

// Client code
class Client {
    public static void driveCars(AbstractCarFactory factory) {
        Sedan sedan = factory.createSedan();
        SUV suv = factory.createSUV();

        sedan.drive();
        suv.drive();
    }

    public static void main(String[] args) {
        AbstractCarFactory fordFactory = new FordFactory();
        driveCars(fordFactory);

        // AbstractCarFactory toyotaFactory = new ToyotaFactory();
        // driveCars(toyotaFactory);
    }
}
