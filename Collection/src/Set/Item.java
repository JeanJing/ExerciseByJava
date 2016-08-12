package Set;

import java.util.*;

/**
 * An item with a description and a part number.
 */
public class Item implements Comparable<Item>
{
   private String description;
   private int partNumber;

   /**
    * Constructs an item.
    * 
    * @param aDescription
    *           the item's description
    * @param aPartNumber
    *           the item's part number
    */
   public Item(String aDescription, int aPartNumber)
   {
      description = aDescription;
      partNumber = aPartNumber;
   }

   /**
    * Gets the description of this item.
    * 
    * @return the description
    */
   public String getDescription()
   {
      return description;
   }

   public String toString()
   {

      return "[descripion=" + description + ", partNumber=" + partNumber + "]";
   }

   public boolean equals(Item otherObject)//这个equals代码写的很好通常开始的时候要进行三种比较1本身 与参数是否为相同引用2参数是否为null3类型是否一致
   {
      if (this == otherObject) return true;
      if (otherObject == null) return false;
      if (getClass() != otherObject.getClass()) return false;
      Item other = otherObject;//这一步强制类型转换
      return Objects.equals(description, other.description) && partNumber == other.partNumber;//对string的比较也要用equals的方法
   }

   public int hashCode()
   {
      return Objects.hash(description, partNumber);//因为有多个实例变量所以使用hash进行组合
   }

   public int compareTo(Item other)
   {
      return Integer.compare(partNumber, other.partNumber);//Integer这个包装器的方法挺多还可以通过这个对两个包装器进行比较
   }
}
