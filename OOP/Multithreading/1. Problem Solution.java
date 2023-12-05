class myClass extends Thread{
  public void run(){
    for(int i=1; i<=5; i++){
      System.out.println(1);
      try{
        Thread.sleep(500);
      } catch (Exception e){
      }
    }
  }
}
