int year;
    System.out.println("Enter year:");
    Scanner obj = new Scanner(System.in);
    year = obj.nextInt();

    if( year % 4 == 0)
        System.out.println(year + "Leap year");
    else
        System.out.println("Not leap year")