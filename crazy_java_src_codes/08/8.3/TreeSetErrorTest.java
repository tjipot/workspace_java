
import java.util.*;
/**
 * Description:
 * <br/>��վ: <a href="http://www.crazyit.org">���Java����</a>
 * <br/>Copyright (C), 2001-2016, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author Yeeku.H.Lee kongyeeku@163.com
 * @version 1.0
 */
class Err{}
public class TreeSetErrorTest
{
	public static void main(String[] args)
	{
		TreeSet ts = new TreeSet();
		// ��TreeSet��������������Err����
		ts.add(new Err());
		ts.add(new Err());  //��
	}
}