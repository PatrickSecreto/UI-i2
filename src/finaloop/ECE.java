package finaloop;

import java.util.Scanner;

public class ECE {
    public static String getBreadboardLearnings() {
        return """
               A breadboard is a solderless tool utilized for constructing 
               and evaluating electronic circuits, offering a hassle-free means 
               to prototype without soldering. Typically, it features a grid of 
               interconnected holes into which components and wires can be inserted.""";
    }
    
    public static String getResistorLearnings() {
        return """
               Resistors are electronic components designed to impede the flow of 
               electric current within a circuit, measured in ohms (\u03a9).""";
    }
    
    public static String getCapacitorLearnings() {
        return  """
                Capacitors, on the other hand, store and discharge electrical
                energy, quantified in farads (F).Capacitors, on the other hand, store and discharge electrical 
                """;
    }
    
    public static String getTransistorLearnings() {
        return """
               Transistors, semiconductor devices pivotal in electronics, 
               serve to amplify or switch electronic signals and power, with 
               PNP and NPN being the two primary types.  PNP transistors 
               consist of an N-type semiconductor layer between two layers of 
               P-type semiconductor, whereas NPN transistors feature a P-type 
               layer sandwiched between two N-type layers, resulting in distinct 
               operational behaviors depending on their configurations and biasing. 
               These components play multifaceted roles in electronic circuits, 
               capable of signal amplification, voltage regulation, and acting as switches.""";
    }
    
    public static String getDiodesLearnings() {
        return """
               Diodes, semiconductor devices crucial in electronics, permit current 
               to flow in only one direction, finding widespread use in rectification, 
               """;
    }
    
    public static String getjumperWiresLearning() {
        return """
               Jumper wires, flexible connectors used in electronic circuits, 
               facilitate temporary electrical connections on breadboards or between 
               components without soldering. They offer a convenient means to create 
               connections across different points on a breadboard or circuit board, 
               aiding in rapid circuit prototyping.""";
    }
    
    public static String getInductorLearnings() {
        return """
               Inductors are electronic components that store energy in the form of 
               a magnetic field when current passes through them, quantified in henries 
               (H). As essential elements in electrical circuits, inductors are particularly 
               useful in applications requiring energy storage, filtering, or inductive 
               coupling.""";
    }
    
    public static String getCalculateVoltage() {
        return """
               Formula for voltage in parallel circuits:
               Veq = V1 = V2 = V3 = \u2026
               """;
    }

    public static void LessonsInECE(){
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        
        while (choice != 3){
            System.out.println("\nWhat lesson in ECE do you want to learn?\n"
                    + "1. Basic Circuitries\n"
                    + "2. Diode Application\n"
                    + "3. Back");

            System.out.print("\nEnter your choice: ");
            choice = scanner.nextInt();
            
            switch (choice){
                case 1:
                    ChoiceBasicCircuitries();
                    break;
                    
                case 2:
                    ChoicesDiodeApplication();
                    break;
                    
                case 3:
                    break;
                    
                default:
                    System.out.println("Invalid input. Please refer to the choices above.\n");
                    break;
            }
        }
    }
    
    // Basic Circuitries
    public static void ChoiceBasicCircuitries() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nWelcome to Basic Circuitries!");
        int choice = 0;
        
        while (choice != 4){
            System.out.println("\nWhat do you want to learn from Basic Circuitries? \n"
                    + "1. Circuitry Parts\n"
                    + "2. Parallel Circuits\n"
                    + "3. Series Circuits\n"
                    + "4. Back");

            System.out.print("\nEnter your choice: ");
            choice = scanner.nextInt();
            
            switch (choice){
                case 1:
                    circuitPartsChoice();
                    break;
                    
                case 2:
                    parallelDescChoice();
                    break;
                    
                case 3:
                    seriesDescChoice();
                    break;
                    
                case 4:
                    break;
                    
                default:
                    System.out.println("Invalid input. Please refer to the choices above.\n");
                    break;
            }
        }
    }
    
    public static void circuitPartsChoice(){
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        
        while (choice != 8){
            System.out.println("\nWhat part of circuits do you want to learn?:\n"
                    + "1. Breadboard \n" 
                    + "2. Resistors\n" 
                    + "3. Capacitors\n" 
                    + "4. Transistors (PNP, NPN)\n" 
                    + "5. Diodes (LED, Sensors, etc.)\n" 
                    + "6. Jumper Wires\n"
                    + "7. Inductors\n" 
                    + "8. Back");

            System.out.print("\nEnter your choice: ");
            choice = scanner.nextInt();

            switch (choice){
                case 1:
                    System.out.println("\nA breadboard is a solderless tool utilized for constructing \n"
                                     + "and evaluating electronic circuits, offering a hassle-free means \n"
                                     + "to prototype without soldering. Typically, it features a grid of \n"
                                     + "interconnected holes into which components and wires can be inserted.");
                    break;
                    
                case 2:
                    System.out.println("\nResistors are electronic components designed to impede the flow of \n"
                                     + "electric current within a circuit, measured in ohms (Ω).");
                    break;
                    
                case 3:
                    System.out.println("\nCapacitors, on the other hand, store and discharge electrical \n"
                                     + "energy, quantified in farads (F). ");
                    break;
                    
                case 4:
                    System.out.println("\nTransistors, semiconductor devices pivotal in electronics, \n"
                                     + "serve to amplify or switch electronic signals and power, with \n"
                                     + "PNP and NPN being the two primary types.  PNP transistors \n"
                                     + "consist of an N-type semiconductor layer between two layers of \n"
                                     + "P-type semiconductor, whereas NPN transistors feature a P-type \n"
                                     + "layer sandwiched between two N-type layers, resulting in distinct \n"
                                     + "operational behaviors depending on their configurations and biasing. \n"
                                     + "These components play multifaceted roles in electronic circuits, \n"
                                     + "capable of signal amplification, voltage regulation, and acting as switches.");
                    break;
                    
                case 5:
                    System.out.println("\nDiodes, semiconductor devices crucial in electronics, permit current \n"
                                     + "to flow in only one direction, finding widespread use in rectification, \n"
                                     + "signal demodulation, and voltage regulation. ");
                    break;
                    
                case 6:
                    System.out.println("\nJumper wires, flexible connectors used in electronic circuits, \n"
                                     + "facilitate temporary electrical connections on breadboards or between \n"
                                     + "components without soldering. They offer a convenient means to create \n"
                                     + "connections across different points on a breadboard or circuit board, \n"
                                     + "aiding in rapid circuit prototyping.");
                    break;
                    
                case 7:
                    System.out.println("\nInductors are electronic components that store energy in the form of \n"
                                     + "a magnetic field when current passes through them, quantified in henries \n"
                                     + "(H). As essential elements in electrical circuits, inductors are particularly \n"
                                     + "useful in applications requiring energy storage, filtering, or inductive \n"
                                     + "coupling. ");
                    
                case 8:
                    break;
                    
                default:
                    System.out.println("Invalid choice. Please select from the selection above.");
                    break;
            }
        }
    }
    
    public static void parallelDescChoice(){
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        System.out.println("\nIn parallel circuits, components are linked across diverse pathways, ensuring that \n"
                         + "each component receives the same voltage as the overall circuit. The total current \n"
                         + "within a parallel circuit equals the aggregate of currents flowing through individual \n"
                         + "components. Moreover, the total resistance in a parallel circuit is lower than that of \n"
                         + "any individual component due to the combined pathways for current flow.");
    
        System.out.println("\nCircuit design for Parallel Circuits:");
        System.out.println(" ---------------------------------\n"
                         + " |        |           |          |\n"
                         + " |        |           |          |\n"
                         + "___       |           |          |\n"
                         + " _       { }         { }        { }\n"
                         + "___      { }         { }        { }\n"
                         + " _        |           |          |\n"
                         + " |        |           |          |\n"
                         + " |        |           |          |\n"
                         + " ---------------------------------");
        while (choice != 5){
            System.out.println("\nWhat do you want to learn about parallel circuits?\n"
                    + "1. How to calculate Voltage?\n" 
                    + "2. How to calculate Current?\n" 
                    + "3. How to calculate Resistance of each resistor?\n"
                    + "4. Calculator for Parallel Circuits\n"
                    + "5. Back");
            
            System.out.print("\nEnter your choice: ");
            choice = scanner.nextInt();

            switch (choice){
                case 1:
                    System.out.println("\nFormula for voltage in parallel circuits:\n"
                            + "Veq = V1 = V2 = V3 = …\n");
                    break;
                    
                case 2:
                    System.out.println("\nFormula for current in parallel circuits:\n"
                            + "I  = I1 + I2 + I3 + …\n");
                    break;
                    
                case 3:
                    System.out.println("\nFormula for resistance in parallel circuits:\n"
                            + "R = 1/R1 + 1/R2 + 1/R3 + …\n");
                    break;
                    
                case 4:
                    parallelCalculator();
                    break;
                       
                case 5:
                    break;    
                    
                default:
                    System.out.println("Invalid choice. Please select from the selection above.");
                    break;
            }
        }
    }
    
    public static void parallelCalculator(){
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        
        while (choice != 4){
            System.out.println("\nParallel: What do you want to compute?\n"
                    + "1. Resistance\n"
                    + "2. Voltage\n"
                    + "3. Current\n"
                    + "4. Back");
            System.out.print("\nEnter your choice: ");
            choice = scanner.nextInt();

            switch (choice){
                // Resistance
                case 1:
                    System.out.println("\nParallel: What do you want to know the resistance of?\n"
                            + "1. Total Resistance (Req)\n"
                            + "2. Resistance of a specific resistor");

                    System.out.print("\nEnter your choice: ");
                    int rChoice = scanner.nextInt();

                    switch (rChoice){
                        case 1:
                            float totalResistance = 0f;
                            System.out.print("\nEnter the number of Resistors: ");
                            int numResistors = scanner.nextInt();

                            for (int i = 1; i < numResistors + 1; i++){
                                System.out.print("Enter the resistance of Resistor " + i + ": ");
                                float r = scanner.nextFloat();

                                totalResistance += 1/r;
                            }

                            totalResistance = 1/totalResistance;

                            System.out.println("\nTotal Resistance: " + totalResistance + " ohms");
                            break;

                        case 2:
                            System.out.print("\nTotal Voltage (Veq): ");
                            float totalV = scanner.nextFloat();

                            System.out.print("Current in the specific resistor (I): ");
                            float currentOfResistor = scanner.nextFloat();

                            float resistanceOfResistor = totalV/currentOfResistor;

                            System.out.println("\nResistance of that specific resistor: " + resistanceOfResistor + " ohms");
                            break;

                        default:
                            System.out.println("Invalid choice. Please select from the selection above.");
                            break;
                        
                    }
                break;
                    
                // Voltage    
                case 2:
                    System.out.println("\nSince Veq = V1 = V2 +..., Voltage of the whole parallel circuit is the same.");
                    
                    System.out.println("\nTotal Voltage Calculator:");
                    System.out.print("Total Current: ");
                    float totalCurrent = scanner.nextFloat();
                    
                    System.out.print("Total Resistance: ");
                    float totalResistance = scanner.nextFloat();
                    
                    float totalVoltage = totalCurrent*totalResistance;
                    System.out.println("\nTotal Voltage: " + totalVoltage + " V");
                    break;
                    
                // Current    
                case 3:
                    System.out.println("\nParallel: What do you want to know the current of?\n"
                            + "1. Total Current (Ieq)\n"
                            + "2. Current of a specific resistor");

                    System.out.print("\nEnter your choice: ");
                    int iChoice = scanner.nextInt();

                    switch (iChoice){
                        case 1:
                            float totalC = 0f;
                            System.out.print("\nEnter the number of Resistors: ");
                            int numResistors = scanner.nextInt();

                            for (int i = 1; i < numResistors + 1; i++){
                                System.out.print("Enter the current of Resistor " + i + ": ");
                                float r = scanner.nextFloat();

                                totalC += r;
                            }
                            System.out.println("\nTotal Current: " + totalC + " A");
                            break;

                        case 2:
                            System.out.print("\nTotal Voltage (Veq): ");
                            float totalV = scanner.nextFloat();

                            System.out.print("Resistance in the specific resistor (R): ");
                            float resistanceOfResistor = scanner.nextFloat();

                            float currentOfResistor = totalV/resistanceOfResistor;

                            System.out.println("\nCurrent of the specific resistor: " + currentOfResistor + " A");
                            break;

                        default:
                            System.out.println("Invalid choice. Please select from the selection above.");
                            break;
                        
                    }
                    break;
                    
                case 4:
                    break;
                    
                // Invalid Input
                default:
                    System.out.println("Invalid choice. Please select from the selection above.");
                    break;
            }
        }
    }
    
    public static void seriesDescChoice(){
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        System.out.println("\nIn a series circuit, components are interconnected in a singular pathway, ensuring \n"
                         + "that identical current flows through each element. The total voltage across the \n"
                         + "series circuit equals the cumulative sum of the individual voltages across each \n"
                         + "component. Furthermore, the total resistance within a series circuit equates to the \n"
                         + "sum of the resistances of all constituent components.");
        
        System.out.println("\nCircuit design for Series Circuits:");
        System.out.println(" --------------{  }---------------\n"
                         + " |                               |\n"
                         + " |                               |\n"
                         + "___                              |\n"
                         + " _                              { }\n"
                         + "___                             { }\n"
                         + " _                               |\n"
                         + " |                               |\n"
                         + " |                               |\n"
                         + " --------------{  }---------------");
        
        while (choice != 5){
            System.out.println("\nWhat do you want to learn about series circuits?\n"
                    + "1. How to calculate Voltage?\n" 
                    + "2. How to calculate Current?\n" 
                    + "3. How to calculate Resistance of each resistor?\n"
                    + "4. Calculator for Series Circuits\n"
                    + "5. Back");
            System.out.print("\nEnter your choice: ");
            choice = scanner.nextInt();

            switch (choice){
                case 1:
                    System.out.println("\nFormula for voltage in series circuits:\n"
                            + "V = V_1 + V_2 + V_3 + …\n");
                    break;
                    
                case 2:
                    System.out.println("\nFormula for current in series circuits:\n"
                            + "I = I1 = I2 = I3 =...\n");
                    break;
                    
                case 3:
                    System.out.println("\nFormula for resistance in series circuits:\n"
                            + "R = R_1 + R_2 + R_3 + ...\n");
                    break;
                    
                case 4:
                    seriesCalculator();
                    break;
                    
                case 5:
                    break;
                    
                default:
                    System.out.println("Invalid choice. Please select from the selection above.");
                    break;
            }
        }
    }
    
    public static void seriesCalculator(){
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        
        while (choice != 4){
            System.out.println("\nSeries: What do you want to compute?\n"
                    + "1. Resistance\n"
                    + "2. Voltage\n"
                    + "3. Current\n"
                    + "4. Back");
            System.out.print("\nEnter your choice: ");
            choice = scanner.nextInt();

            switch (choice){
                // Resistance
                case 1:
                    System.out.println("\nSeries: What do you want to know the resistance of?\n"
                            + "1. Total Resistance (Req)\n"
                            + "2. Resistance of a specific resistor");
                    
                    System.out.print("\nEnter your choice: ");
                    int rChoice = scanner.nextInt();
                    
                    switch (rChoice){
                        case 1:
                            float totalResistance = 0f;
                            System.out.print("\nEnter the number of Resistors: ");
                            int numResistors = scanner.nextInt();
                            
                            for (int i = 1; i < numResistors + 1; i++){
                                System.out.print("Enter the resistance of Resistor " + i + ": ");
                                float r = scanner.nextFloat();
                                
                                totalResistance += r;
                            }
                            System.out.println("\nTotal Resistance: " + totalResistance + " ohms");
                            break;
                            
                        case 2:
                            System.out.print("\nVoltage in that specific resistor (V): ");
                            float voltageOfResistor = scanner.nextFloat();
                            
                            System.out.print("Total Current (Ieq): ");
                            float totalI = scanner.nextFloat();
                            
                            float resistanceOfResistor = voltageOfResistor/totalI;
                            
                            System.out.println("Resistance of that specific resistor: " + resistanceOfResistor + " ohms");
                            break;
                            
                        default:
                            System.out.println("Invalid choice. Please select from the selection above.");
                            break;
                    }
                    break;
                    
                // Voltage    
                case 2:
                    System.out.println("\nSeries: What do you want to know the voltage of?\n"
                            + "1. Total Voltage (Veq)\n"
                            + "2. Voltage of a specific resistor");
                    
                    System.out.print("\nEnter your choice: ");
                    int vChoice = scanner.nextInt();
                    
                    switch (vChoice){
                        case 1:
                            float totalV = 0f;
                            System.out.print("\nEnter the number of Resistors: ");
                            int numResistors = scanner.nextInt();
                            
                            for (int i = 1; i < numResistors + 1; i++){
                                System.out.print("Enter the voltage of Resistor " + i + ": ");
                                float r = scanner.nextFloat();
                                
                                totalV += r;
                            }
                            System.out.println("\nTotal Voltage: " + totalV + " V");
                            break;
                            
                        case 2:
                            System.out.print("\nTotal Current (Ieq): ");
                            float totalI = scanner.nextFloat();
                            
                            System.out.print("Resistance in the specific resistor (R): ");
                            float resistanceOfResistor = scanner.nextFloat();
                            
                           float voltageOfResistor = totalI*resistanceOfResistor;
                            
                            System.out.println("\nVoltage of the specific resistor: " + voltageOfResistor + " V");
                            break;
                            
                        default:
                            System.out.println("Invalid choice. Please select from the selection above.");
                            break;
                    }
                    break;
                    
                // Current    
                case 3:
                    System.out.println("\nSince Ieq = I1 = I2 +..., Current of the whole series circuit is the same.");
                    
                    System.out.println("\nTotal Current Calculator:");
                    System.out.print("Total Voltage: ");
                    float totalVoltage = scanner.nextFloat();
                    
                    System.out.print("Total Resistance: ");
                    float totalResistance = scanner.nextFloat();
                    
                    float totalCurrent = totalVoltage/totalResistance;
                    System.out.println("\nTotal Current: " + totalCurrent + " A");
                    break;
                    
                case 4:
                    break;
                    
                // Invalid Input
                default:
                    System.out.println("Invalid choice. Please select from the selection above.");
                    break;
            }
        }
    }
    

    // Diode Application
    public static void ChoicesDiodeApplication(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nWelcome to Diode Applications!");
        int choice = 0;
        
        while (choice != 4){
            System.out.println("\nWhat do you want to learn from Diode Application? \n"
                    + "1. Rectifiers\n"
                    + "2. Clippers\n"
                    + "3. Clampers\n"
                    + "4. Back");
            
            System.out.print("\nEnter your choice: ");
            choice = scanner.nextInt();
            
            switch (choice){
                case 1:
                    rectifierChoice();
                    break;
                    
                case 2:
                    System.out.println("""
                                       
                           Clippers have the ability to "clip" off a portion of the
                           input signal without distorting the remaining part of the 
                           alternating waveform. In this way, clippers can either 
                           create a specific type of signal or to limit the voltage 
                           that can be applied to a network.
                           """);
                    break;
                    
                case 3:
                    System.out.println("""
                                       
                           Clampers is a network constructed of a diode, a resistor, 
                           and a capacitor that shifts a waveform to a different dc
                           level without changing the appearance of the applied signal.
                           These are networks that "clamp" the input signal to a different
                           dc level. the peak-to-peak swing of the applied signal will
                           remain the same.
                           """);
                    break;
                    
                case 4:
                    break;

                default:
                    System.out.println("Invalid input. Please refer to the choices above.\n");
                    break;
            }
        }
    }
    
    public static void rectifierChoice(){
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        
        while (choice != 4){
            System.out.println("\nWhat do you want to learn in rectifiers?:\n"
                    + "1. Half Wave Rectifiers\n" 
                    + "2. Full Wave Rectifiers\n" 
                    + "3. Calculator\n"
                    + "4. Back");
            
            System.out.print("\nEnter your choice: ");
            choice = scanner.nextInt(); 

            switch (choice){
                case 1:
                    System.out.println("""
                                       
                                       A Half-wave rectifier produces an output voltage during one-half
                                       (180 degrees) of the input ac signal. One half of the input signal
                                       (negative half cycle) is removed to establsigh a dc voltage.""");
                    
                    System.out.println("""
                                       
                                       Formulas for Half Wave Rectifiers:
                                       Vp = Vin - Vth
                                       Vave = Vp/pi
                                       PIV = Vin
                                       
                                       Where:
                                       Vp = Peak Voltage
                                       Vin = Input Voltage
                                       Vth = Diode Threshold Voltage
                                       Vave = Average Voltage
                                       PIV = Peak Inverse Voltage
                                       """);
                    break;
                    
                case 2:
                    System.out.println("""
                                       
                                       A Full Wave Rectifier produces an output voltage during the entire 
                                       cycle (360 degrees) of the input ac signal, which means it uses both
                                       cycle of the input signal for its outut""");
                    
                    System.out.println("""
                                       
                                       Formulas for Full Wave Rectifiers:
                                       Vp = Vin - 2Vth
                                       Vave = 2Vp/pi
                                       PIV = Vin - Vth
                                       
                                       Where:
                                       Vp = Peak Voltage
                                       Vin = Input Voltage
                                       Vth = Diode Threshold Voltage
                                       Vave = Average Voltage
                                       PIV = Peak Inverse Voltage
                                       """);
                    break;
                    
                case 3:
                    rectifierCalculator();
                    break;
                    
                case 4:
                    break;
                    
                default:
                    System.out.println("Invalid choice. Please select from the selection above.");
            }
        }
    }
    
    public static void rectifierCalculator(){
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        
        while (choice != 3){
            System.out.println("\nRectifier: What do you want to compute?\n"
                    + "1. Half Wave Rectifiers\n" 
                    + "2. Full Wave Rectifiers\n" 
                    + "3. Back");
            
            System.out.print("\nEnter your choice: ");
            choice = scanner.nextInt();
            
            switch (choice){
                // Half wave Rectifiers
                case 1:
                    int hwchoice = 0;
                    while (hwchoice != 3){
                        System.out.println("\nHalf Wave Rectifiers: Calculate for?\n"
                                + "1. Peak Voltage\n"
                                + "2. Average Voltage\n"
                                + "3. Back");
                        
                        System.out.print("\nEnter your choice: ");
                        hwchoice = scanner.nextInt();
                        
                        switch (hwchoice){
                            case 1:
                                System.out.print("\nEnter input Voltage: ");
                                float Vin = scanner.nextFloat();
                                
                                System.out.print("\nEnter diode Threshold Voltage: : ");
                                float Vth = scanner.nextFloat();
                                
                                float Vp = Vin - Vth;
                                
                                System.out.println("\nPeak Voltage: " + Vp);
                                break;
                                
                            case 2:
                                System.out.print("\nEnter Peak Voltage: ");
                                float vp = scanner.nextFloat();
                                
                                float piApprox = 3.1415926535f;
                                
                                float Vave = vp / piApprox;
                                
                                System.out.println("\nAverage Voltage: " + Vave);
                                break;
                                
                            case 3:
                                break;
                                
                            default:
                                System.out.println("Invalid choice. Please select from the selection above.");
                                break;
                                
                        }
                    }
                    break;
                  
                // Full Wave Rectifiers
                case 2:
                    int fwchoice = 0;
                    while (fwchoice != 4){
                        System.out.println("\nFull Wave Rectifiers: Calculate for?\n"
                                + "1. Peak Voltage\n"
                                + "2. Average Voltage\n"
                                + "3. Peak Inverse Voltage\n"
                                + "4. Back");
                        
                        System.out.print("\nEnter your choice: ");
                        fwchoice = scanner.nextInt();
                        
                        switch (fwchoice){
                            case 1:
                                System.out.print("\nEnter input Voltage: ");
                                float Vin = scanner.nextFloat();
                                
                                System.out.print("\nEnter diode Threshold Voltage: : ");
                                float Vth = scanner.nextFloat();
                                
                                float Vp = Vin - (2*Vth);
                                
                                System.out.println("\nPeak Voltage: " + Vp);
                                break;
                                
                            case 2:
                                System.out.print("\nEnter Peak Voltage: ");
                                float vp = scanner.nextFloat();
                                
                                float piApprox = 3.1415926535f;
                                
                                float Vave = (2*vp) / piApprox;
                                
                                System.out.println("\nAverage Voltage: " + Vave);
                                break;
                                
                            case 3:
                                System.out.print("\nEnter input Voltage: ");
                                float vin = scanner.nextFloat();
                                
                                System.out.print("\nEnter diode Threshold Voltage: : ");
                                float vth = scanner.nextFloat();
                                
                                float PIV = vin - vth;
                                System.out.println("Peak Inverse Voltage (PIV): " + PIV);
                                break;
                                   
                            case 4:
                                break;
                                
                            default:
                                System.out.println("Invalid choice. Please select from the selection above.");
                                break;
                                
                        }
                    }
                    break;
                    
                default:
                    System.out.println("Invalid choice. Please select from the selection above.");
                    break;
            }
        }
    }
}
