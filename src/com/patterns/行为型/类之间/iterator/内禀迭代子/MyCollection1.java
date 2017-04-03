package com.patterns.��Ϊ��.��֮��.iterator.����������;

public class MyCollection1 implements Collection1 {
	public String string[] = {"A","B","C","D","E"};  

	@Override
	public Iterator1 iterator() {
		return new MyIterator();  
	}

	/**
	 * �������ṩ�޸ľۼ�Ԫ�صķ���
	 */
    private Object get(int i){
    	return string[i];
    } 
    
    private int size() {  
        return string.length;  
    } 
    
	/**
     * �ڲ���Ա�࣬�����������
     * ���ڵ������Ǿۼ����ڲ��࣬�����ӿ������ɷ��ʾۼ���Ԫ�أ����Ե����ӿ�������ʵ�ֵ������ܲ����ƶԾۼ�Ԫ�صĵ����߼�
     * 
     * ���ڵ��������ھۼ��Ľṹ֮�ڶ���ģ���������ĵ������ֽ������������ӣ�Intrinsic Iterator��
     */
    private class MyIterator implements Iterator1{
    	//��������ʼֵΪ-1��ÿ�ε���next������1��ÿ�ε���previous������1
        private int pos = -1; 
    	

		@Override
		public Object previous() {
			if(pos > 0){  
	            pos--;  
	        }  
	        return get(pos);
		}

		@Override
		public Object next() {
	        if(pos<size()-1){  
	            pos++;  
	        }  
	        return get(pos); 
		}

		@Override
		public boolean hasNext() {
	        if(pos<size()-1){  
	            return true;  
	        }else{  
	            return false;  
	        }  
		}

		@Override
		public Object first() {
	        pos = 0;  
	        return get(pos);  
		}
	}
}
