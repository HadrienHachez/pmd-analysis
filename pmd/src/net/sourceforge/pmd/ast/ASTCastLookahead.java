/* Generated By:JJTree: Do not edit this line. ASTCastLookahead.java */

package net.sourceforge.pmd.ast;

public class ASTCastLookahead extends SimpleNode {
  public ASTCastLookahead(int id) {
    super(id);
  }

  public ASTCastLookahead(JavaParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(JavaParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
