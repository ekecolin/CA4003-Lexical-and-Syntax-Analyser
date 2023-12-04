// Generated from CCAL.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CCALParser}.
 */
public interface CCALListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CCALParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(CCALParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link CCALParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(CCALParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link CCALParser#decl_list}.
	 * @param ctx the parse tree
	 */
	void enterDecl_list(CCALParser.Decl_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CCALParser#decl_list}.
	 * @param ctx the parse tree
	 */
	void exitDecl_list(CCALParser.Decl_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link CCALParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(CCALParser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link CCALParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(CCALParser.DeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link CCALParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void enterVar_decl(CCALParser.Var_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link CCALParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void exitVar_decl(CCALParser.Var_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link CCALParser#const_decl}.
	 * @param ctx the parse tree
	 */
	void enterConst_decl(CCALParser.Const_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link CCALParser#const_decl}.
	 * @param ctx the parse tree
	 */
	void exitConst_decl(CCALParser.Const_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link CCALParser#function_list}.
	 * @param ctx the parse tree
	 */
	void enterFunction_list(CCALParser.Function_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CCALParser#function_list}.
	 * @param ctx the parse tree
	 */
	void exitFunction_list(CCALParser.Function_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link CCALParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(CCALParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CCALParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(CCALParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CCALParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(CCALParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CCALParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(CCALParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CCALParser#parameter_list}.
	 * @param ctx the parse tree
	 */
	void enterParameter_list(CCALParser.Parameter_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CCALParser#parameter_list}.
	 * @param ctx the parse tree
	 */
	void exitParameter_list(CCALParser.Parameter_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link CCALParser#nemp_parameter_list}.
	 * @param ctx the parse tree
	 */
	void enterNemp_parameter_list(CCALParser.Nemp_parameter_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CCALParser#nemp_parameter_list}.
	 * @param ctx the parse tree
	 */
	void exitNemp_parameter_list(CCALParser.Nemp_parameter_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link CCALParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(CCALParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link CCALParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(CCALParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link CCALParser#statement_block}.
	 * @param ctx the parse tree
	 */
	void enterStatement_block(CCALParser.Statement_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CCALParser#statement_block}.
	 * @param ctx the parse tree
	 */
	void exitStatement_block(CCALParser.Statement_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link CCALParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentStatement(CCALParser.AssignmentStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CCALParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentStatement(CCALParser.AssignmentStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CCALParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(CCALParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CCALParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(CCALParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CCALParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(CCALParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CCALParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(CCALParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CCALParser#binary_arith_op}.
	 * @param ctx the parse tree
	 */
	void enterBinary_arith_op(CCALParser.Binary_arith_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link CCALParser#binary_arith_op}.
	 * @param ctx the parse tree
	 */
	void exitBinary_arith_op(CCALParser.Binary_arith_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link CCALParser#fragm}.
	 * @param ctx the parse tree
	 */
	void enterFragm(CCALParser.FragmContext ctx);
	/**
	 * Exit a parse tree produced by {@link CCALParser#fragm}.
	 * @param ctx the parse tree
	 */
	void exitFragm(CCALParser.FragmContext ctx);
	/**
	 * Enter a parse tree produced by {@link CCALParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(CCALParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CCALParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(CCALParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CCALParser#comp_op}.
	 * @param ctx the parse tree
	 */
	void enterComp_op(CCALParser.Comp_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link CCALParser#comp_op}.
	 * @param ctx the parse tree
	 */
	void exitComp_op(CCALParser.Comp_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link CCALParser#arg_list}.
	 * @param ctx the parse tree
	 */
	void enterArg_list(CCALParser.Arg_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CCALParser#arg_list}.
	 * @param ctx the parse tree
	 */
	void exitArg_list(CCALParser.Arg_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link CCALParser#nemp_arg_list}.
	 * @param ctx the parse tree
	 */
	void enterNemp_arg_list(CCALParser.Nemp_arg_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CCALParser#nemp_arg_list}.
	 * @param ctx the parse tree
	 */
	void exitNemp_arg_list(CCALParser.Nemp_arg_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link CCALParser#iFElseStatement}.
	 * @param ctx the parse tree
	 */
	void enterIFElseStatement(CCALParser.IFElseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CCALParser#iFElseStatement}.
	 * @param ctx the parse tree
	 */
	void exitIFElseStatement(CCALParser.IFElseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CCALParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(CCALParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CCALParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(CCALParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CCALParser#functionCallStatement}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallStatement(CCALParser.FunctionCallStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CCALParser#functionCallStatement}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallStatement(CCALParser.FunctionCallStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CCALParser#functionCallOp}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallOp(CCALParser.FunctionCallOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link CCALParser#functionCallOp}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallOp(CCALParser.FunctionCallOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link CCALParser#plusMinus}.
	 * @param ctx the parse tree
	 */
	void enterPlusMinus(CCALParser.PlusMinusContext ctx);
	/**
	 * Exit a parse tree produced by {@link CCALParser#plusMinus}.
	 * @param ctx the parse tree
	 */
	void exitPlusMinus(CCALParser.PlusMinusContext ctx);
	/**
	 * Enter a parse tree produced by {@link CCALParser#fragOp}.
	 * @param ctx the parse tree
	 */
	void enterFragOp(CCALParser.FragOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link CCALParser#fragOp}.
	 * @param ctx the parse tree
	 */
	void exitFragOp(CCALParser.FragOpContext ctx);
}