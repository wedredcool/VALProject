/**
����� ��������� �����������.
*/
public class Calculator
{
	/**
	��������� ����������.
	*/
	private int result;

	/**
	��������� ���������.
 	@param params ��������� ������������.
	*/
	public void add(int ... params)
		{for (Integer param : params)
			{
				this.result += param;
			}
		}
	/**
	�������� ���������.
	@return ��������� ����������.
	*/
	public int getResult(){
		return this.result;
	}
	/**
	�������� ��������� ����������.
	*/
	public void cleanerResult(){
			this.result = 0;
		}
}