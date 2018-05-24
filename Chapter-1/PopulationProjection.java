public class PopulationProjection
{
  public static void main(String[] args)
  {
    System.out.println("The population of the next year is " + (312032486 + 365 * 24 * 60 * 60.0 / 7 + 365 * 24 * 60 * 60.0 / 45 - 365 * 24 * 60 * 60.0 / 13));
    System.out.println("The population of the second year is " + ((312032486 + 365 * 24 * 60 * 60.0 / 7 + 365 * 24 * 60 * 60.0 / 45 - 365 * 24 * 60 * 60.0 / 13) * 2));
    System.out.println("The population of the third year is " + ((312032486 + 365 * 24 * 60 * 60.0 / 7 + 365 * 24 * 60 * 60.0 / 45 - 365 * 24 * 60 * 60.0 / 13) * 3));
    System.out.println("The population of the forth year is " + ((312032486 + 365 * 24 * 60 * 60.0 / 7 + 365 * 24 * 60 * 60.0 / 45 - 365 * 24 * 60 * 60.0 / 13) * 4));
    System.out.println("The population of the fifth year is " + ((312032486 + 365 * 24 * 60 * 60.0 / 7 + 365 * 24 * 60 * 60.0 / 45 - 365 * 24 * 60 * 60.0 / 13) * 5));
  }
}