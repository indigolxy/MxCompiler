package ast.stmt;

import ast.expr.*;
import util.Position;
import ast.*;

public class ForStmtNode extends StmtNode {
  public ExprNode condExpr = null, stepExpr = null;
  public StmtNode initStmt = null, body = null; // can be null (emptyStmt)

  public ForStmtNode(Position pos) {
    super(pos);
  }

  @Override
  public void accept(ASTVisitor visitor) {
    visitor.visit(this);
  }
}
