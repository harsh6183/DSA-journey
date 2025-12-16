public void main(string[] args){
  String str="Hello";

  //Approach 1
  char[] ch = str.toCharArray();
  for(int i =ch.length-1;i>0;i--){
    System.out.println(ch[i]);
  }

  //Approach 2
  for(int i =str.length()-1;i>0;i--){
    System.out.println(str.charAt[i]);
  }

  //Approach 3
  StringBuffer sb = new StringBuffer(str);
  System.out.println(sb.reverse());
}
