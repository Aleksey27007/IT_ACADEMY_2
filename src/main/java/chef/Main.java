package chef;

import chef.products.Products;
import chef.products.Salads.SaladsEnum;
import java.util.ArrayList;

public class Main {
  /*
  * Шеф-повар. Определить иерархию овощей. Сделать салат. Посчитать калорийность.
  * Провести сортировку овощей для салата на основе одного из параметров.
  * Найти овощи в салате, соответствующие заданному диапазону калорийности.
   */
  public static void main(String[] args) {

    Kitchen kitchen = new Kitchen();

    /** we made a salad **/
    kitchen.makeSalad(SaladsEnum.VENEGRET);

    kitchen.makeAListOfIngredients(SaladsEnum.VENEGRET);

    /** sort by param ( 1 - name, 2  - weight, 3 - kkal ) **/

    kitchen.sortSaladByParameter(1);
    kitchen.makeAListOfIngredients(SaladsEnum.VENEGRET);

    kitchen.sortSaladByParameter(2);
    kitchen.makeAListOfIngredients(SaladsEnum.VENEGRET);

    kitchen.sortSaladByParameter(3);
    kitchen.makeAListOfIngredients(SaladsEnum.VENEGRET);

    /** sum kcal **/
    kitchen.calculateKcalInSalad();

    /** find by range kcal**/
    ArrayList<Products> result = kitchen.findProdInRange(0, 200);
    for (Products component: result) {
      System.out.println(component);
    }
  }
}
