
            package curse.of.java;

            import java.util.Scanner;


            public class Ejercicio5 {


                public static void main(String[] args) {
                    Scanner read = new Scanner (System.in);

                   String Id = null;

                    System.out.println("ingrese su nombre");
                    String nombre= read.nextLine();
                    read = new Scanner (System.in);

                    System.out.println("ingrese el dni del participante");
                      Id = read.next();

                    System.out.println("ingrese la edad del participante");
                      int  Edad = read.nextInt();


                    while(!nombre.equalsIgnoreCase("fin") && !Id.equalsIgnoreCase("fin")){

                       
                               
                               if (Edad>=6 && Edad <=10) {
                                   System.out.println("PERTECE MENORES A");
                            
                        }
                               else{
                                   if (Edad >=11 && Edad<=17) {
                                       System.out.println("PERTENECE MENORES B");
                                       
                                   }else{
                                       if (Edad >=18 && Edad<=30) {
                                           System.out.println("PERTENECE JUVENILES");
                                           
                                       }else{
                                           if (Edad >=31 && Edad <=50) {
                                               System.out.println("PERTENECE ADULTOS");
                                               
                                               
                                           }else{
                                               if (Edad > 50) {
                                                   System.out.println("ADULTOS MAYORES");
                                                   
                                               }else{
                                                   if (Edad <=3) {
                                                       System.out.println("NO CUENTA CON LA EDAD SUFICIENTE");
                                                       
                                                   }
                                               }
                                           }
                                       }
                                   }
                               }
                               
                               System.out.println("ingrese su nombre");
                        nombre= read.nextLine();
                        read = new Scanner (System.in);

                        System.out.println("ingrese el dni del participante");
                               Id = read.next();

                        System.out.println("ingrese la edad del participante");
                               Edad = read.nextInt();







                    }



                }

                    }
