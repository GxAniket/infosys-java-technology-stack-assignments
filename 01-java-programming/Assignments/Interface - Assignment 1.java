interface Testable {
    public boolean testCompatibility();
}

class Mobile {
    private String name;
    private String brand;
    private String operatingSystemName;
    private String operatingSystemVersion;

    public Mobile(String name, String brand, String operatingSystemName, String operatingSystemVersion) {
        this.name = name;
        this.brand = brand;
        this.operatingSystemName = operatingSystemName;
        this.operatingSystemVersion = operatingSystemVersion;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getOperatingSystemName() {
        return operatingSystemName;
    }

    public void setOperatingSystemName(String operatingSystemName) {
        this.operatingSystemName = operatingSystemName;
    }

    public String getOperatingSystemVersion() {
        return operatingSystemVersion;
    }

    public void setOperatingSystemVersion(String operatingSystemVersion) {
        this.operatingSystemVersion = operatingSystemVersion;
    }
}

class SmartPhone extends Mobile implements Testable {
    private String networkGeneration;

    public SmartPhone(String name, String brand, String operatingSystemName, String operatingSystemVersion, String networkGeneration) {
        super(name, brand, operatingSystemName, operatingSystemVersion);
        this.networkGeneration = networkGeneration;
    }

    public String getNetworkGeneration() {
        return networkGeneration;
    }

    public void setNetworkGeneration(String networkGeneration) {
        this.networkGeneration = networkGeneration;
    }

    @Override
    public boolean testCompatibility() {
        String osName = this.getOperatingSystemName();
        String osVersion = this.getOperatingSystemVersion();
        String networkGen = this.getNetworkGeneration();

        if (osName.equals("Saturn")) {
            if (networkGen.equals("3G")) {
                return osVersion.equals("1.1") || osVersion.equals("1.2") || osVersion.equals("1.3");
            } else if (networkGen.equals("4G")) {
                return osVersion.equals("1.2") || osVersion.equals("1.3");
            } else if (networkGen.equals("5G")) {
                return osVersion.equals("1.3");
            }
        } 
        else if (osName.equals("Gara")) {
            if (networkGen.equals("3G")) {
                return osVersion.equals("EXRT.1") || osVersion.equals("EXRT.2") || osVersion.equals("EXRU.1");
            } else if (networkGen.equals("4G")) {
                return osVersion.equals("EXRT.2") || osVersion.equals("EXRU.1");
            } else if (networkGen.equals("5G")) {
                return osVersion.equals("EXRU.1");
            }
        }
        
        return false;
    }
}

class Tester {
    public static void main(String args[]) {
        // Test case 1
        SmartPhone smartPhone1 = new SmartPhone("KrillinM20", "Nebula", "Saturn", "1.3", "5G");
        if (smartPhone1.testCompatibility()) {
            System.out.println("The mobile OS is compatible with the network generation!");
        } else {
            System.out.println("The mobile OS is not compatible with the network generation!");
        }

        // Test case 2 (from your screenshots)
        SmartPhone smartPhone2 = new SmartPhone("FriezaA8", "Quasar", "Gara", "EXRT.1", "4G");
        if (smartPhone2.testCompatibility()) {
            System.out.println("The mobile OS is compatible with the network generation!");
        } else {
            System.out.println("The mobile OS is not compatible with the network generation!");
        }
    }
}
