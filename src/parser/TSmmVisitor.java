// Generated from C:/Users/MARIO/EII/3º/DLP/DLP_ANTLR/src/parser/TSmm.g4 by ANTLR 4.13.2
package parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link TSmmParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface TSmmVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link TSmmParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(TSmmParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSmmParser#definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinition(TSmmParser.DefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSmmParser#variableDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDefinition(TSmmParser.VariableDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSmmParser#functionDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDefinition(TSmmParser.FunctionDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSmmParser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters(TSmmParser.ParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSmmParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(TSmmParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSmmParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(TSmmParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSmmParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(TSmmParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSmmParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(TSmmParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSmmParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(TSmmParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSmmParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(TSmmParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSmmParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(TSmmParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSmmParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(TSmmParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSmmParser#logicalOr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalOr(TSmmParser.LogicalOrContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSmmParser#logicalAnd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalAnd(TSmmParser.LogicalAndContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSmmParser#equality}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquality(TSmmParser.EqualityContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSmmParser#relational}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelational(TSmmParser.RelationalContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSmmParser#additive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditive(TSmmParser.AdditiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSmmParser#multiplicative}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicative(TSmmParser.MultiplicativeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSmmParser#unary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary(TSmmParser.UnaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSmmParser#postfix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfix(TSmmParser.PostfixContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSmmParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(TSmmParser.ArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSmmParser#invocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInvocation(TSmmParser.InvocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSmmParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(TSmmParser.PrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSmmParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(TSmmParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSmmParser#recordField}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecordField(TSmmParser.RecordFieldContext ctx);
}