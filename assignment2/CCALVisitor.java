// Generated from CCAL.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CCALParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CCALVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CCALParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(CCALParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link CCALParser#decl_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl_list(CCALParser.Decl_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link CCALParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl(CCALParser.DeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link CCALParser#var_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_decl(CCALParser.Var_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link CCALParser#const_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConst_decl(CCALParser.Const_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link CCALParser#function_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_list(CCALParser.Function_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link CCALParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(CCALParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CCALParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(CCALParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CCALParser#parameter_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter_list(CCALParser.Parameter_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link CCALParser#nemp_parameter_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNemp_parameter_list(CCALParser.Nemp_parameter_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link CCALParser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(CCALParser.MainContext ctx);
	/**
	 * Visit a parse tree produced by {@link CCALParser#statement_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement_block(CCALParser.Statement_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link CCALParser#assignmentStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentStatement(CCALParser.AssignmentStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CCALParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(CCALParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CCALParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(CCALParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CCALParser#binary_arith_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinary_arith_op(CCALParser.Binary_arith_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link CCALParser#fragm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFragm(CCALParser.FragmContext ctx);
	/**
	 * Visit a parse tree produced by {@link CCALParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(CCALParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CCALParser#comp_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComp_op(CCALParser.Comp_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link CCALParser#arg_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArg_list(CCALParser.Arg_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link CCALParser#nemp_arg_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNemp_arg_list(CCALParser.Nemp_arg_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link CCALParser#iFElseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIFElseStatement(CCALParser.IFElseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CCALParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(CCALParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CCALParser#functionCallStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallStatement(CCALParser.FunctionCallStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CCALParser#functionCallOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallOp(CCALParser.FunctionCallOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link CCALParser#plusMinus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlusMinus(CCALParser.PlusMinusContext ctx);
	/**
	 * Visit a parse tree produced by {@link CCALParser#fragOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFragOp(CCALParser.FragOpContext ctx);
}