/* Generated By:JJTree: Do not edit this line. ASTNestedInterfaceDeclaration.java */

package net.sourceforge.pmd.ast;

public class ASTNestedInterfaceDeclaration extends SimpleNode {
  public ASTNestedInterfaceDeclaration(int id) {
    super(id);
  }

  public ASTNestedInterfaceDeclaration(JavaParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(JavaParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
