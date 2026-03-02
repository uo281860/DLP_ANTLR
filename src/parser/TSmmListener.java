// Generated from C:/Users/MARIO/EII/3º/DLP/DLP_ANTLR/src/parser/TSmm.g4 by ANTLR 4.13.2
package parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TSmmParser}.
 */
public interface TSmmListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TSmmParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(TSmmParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSmmParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(TSmmParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSmmParser#definition}.
	 * @param ctx the parse tree
	 */
	void enterDefinition(TSmmParser.DefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSmmParser#definition}.
	 * @param ctx the parse tree
	 */
	void exitDefinition(TSmmParser.DefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSmmParser#variableDefinition}.
	 * @param ctx the parse tree
	 */
	void enterVariableDefinition(TSmmParser.VariableDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSmmParser#variableDefinition}.
	 * @param ctx the parse tree
	 */
	void exitVariableDefinition(TSmmParser.VariableDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSmmParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDefinition(TSmmParser.FunctionDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSmmParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDefinition(TSmmParser.FunctionDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSmmParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(TSmmParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSmmParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(TSmmParser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSmmParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(TSmmParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSmmParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(TSmmParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSmmParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(TSmmParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSmmParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(TSmmParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSmmParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(TSmmParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSmmParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(TSmmParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSmmParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(TSmmParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSmmParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(TSmmParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSmmParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(TSmmParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSmmParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(TSmmParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSmmParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(TSmmParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSmmParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(TSmmParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSmmParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(TSmmParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSmmParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(TSmmParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSmmParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(TSmmParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSmmParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(TSmmParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSmmParser#logicalOr}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOr(TSmmParser.LogicalOrContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSmmParser#logicalOr}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOr(TSmmParser.LogicalOrContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSmmParser#logicalAnd}.
	 * @param ctx the parse tree
	 */
	void enterLogicalAnd(TSmmParser.LogicalAndContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSmmParser#logicalAnd}.
	 * @param ctx the parse tree
	 */
	void exitLogicalAnd(TSmmParser.LogicalAndContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSmmParser#equality}.
	 * @param ctx the parse tree
	 */
	void enterEquality(TSmmParser.EqualityContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSmmParser#equality}.
	 * @param ctx the parse tree
	 */
	void exitEquality(TSmmParser.EqualityContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSmmParser#relational}.
	 * @param ctx the parse tree
	 */
	void enterRelational(TSmmParser.RelationalContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSmmParser#relational}.
	 * @param ctx the parse tree
	 */
	void exitRelational(TSmmParser.RelationalContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSmmParser#additive}.
	 * @param ctx the parse tree
	 */
	void enterAdditive(TSmmParser.AdditiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSmmParser#additive}.
	 * @param ctx the parse tree
	 */
	void exitAdditive(TSmmParser.AdditiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSmmParser#multiplicative}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicative(TSmmParser.MultiplicativeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSmmParser#multiplicative}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicative(TSmmParser.MultiplicativeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSmmParser#unary}.
	 * @param ctx the parse tree
	 */
	void enterUnary(TSmmParser.UnaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSmmParser#unary}.
	 * @param ctx the parse tree
	 */
	void exitUnary(TSmmParser.UnaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSmmParser#postfix}.
	 * @param ctx the parse tree
	 */
	void enterPostfix(TSmmParser.PostfixContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSmmParser#postfix}.
	 * @param ctx the parse tree
	 */
	void exitPostfix(TSmmParser.PostfixContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSmmParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(TSmmParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSmmParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(TSmmParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSmmParser#invocation}.
	 * @param ctx the parse tree
	 */
	void enterInvocation(TSmmParser.InvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSmmParser#invocation}.
	 * @param ctx the parse tree
	 */
	void exitInvocation(TSmmParser.InvocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSmmParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(TSmmParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSmmParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(TSmmParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSmmParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(TSmmParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSmmParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(TSmmParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSmmParser#recordField}.
	 * @param ctx the parse tree
	 */
	void enterRecordField(TSmmParser.RecordFieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSmmParser#recordField}.
	 * @param ctx the parse tree
	 */
	void exitRecordField(TSmmParser.RecordFieldContext ctx);
}