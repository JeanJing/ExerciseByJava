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

   public boolean equals(Item otherObject)//���equals����д�ĺܺ�ͨ����ʼ��ʱ��Ҫ�������ֱȽ�1���� ������Ƿ�Ϊ��ͬ����2�����Ƿ�Ϊnull3�����Ƿ�һ��
   {
      if (this == otherObject) return true;
      if (otherObject == null) return false;
      if (getClass() != otherObject.getClass()) return false;
      Item other = otherObject;//��һ��ǿ������ת��
      return Objects.equals(description, other.description) && partNumber == other.partNumber;//��string�ıȽ�ҲҪ��equals�ķ���
   }

   public int hashCode()
   {
      return Objects.hash(description, partNumber);//��Ϊ�ж��ʵ����������ʹ��hash�������
   }

   public int compareTo(Item other)
   {
      return Integer.compare(partNumber, other.partNumber);//Integer�����װ���ķ���ͦ�໹����ͨ�������������װ�����бȽ�
   }
}
