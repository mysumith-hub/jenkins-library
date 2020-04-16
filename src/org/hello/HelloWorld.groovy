package org.hello;

class HelloWorld{
  def script;
  HelloWorld(script){
    System.out.println("HelloWorld");
    this.script = script;
  }
  def print(){
    script.sh "echo 'script message Hello!'"
    System.out.println("HelloWorld");
  }
  static void main(String[] args){
    System.out.println("Hello Static World ");
  }


}
