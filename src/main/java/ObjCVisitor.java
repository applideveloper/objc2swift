// Generated from ObjC.g4 by ANTLR 4.5
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ObjCParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ObjCVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ObjCParser#translation_unit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTranslation_unit(ObjCParser.Translation_unitContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#external_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExternal_declaration(ObjCParser.External_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#preprocessor_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreprocessor_declaration(ObjCParser.Preprocessor_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#class_interface}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_interface(ObjCParser.Class_interfaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#category_interface}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCategory_interface(ObjCParser.Category_interfaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#class_implementation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_implementation(ObjCParser.Class_implementationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#category_implementation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCategory_implementation(ObjCParser.Category_implementationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#protocol_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProtocol_declaration(ObjCParser.Protocol_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#protocol_declaration_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProtocol_declaration_list(ObjCParser.Protocol_declaration_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#class_declaration_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_declaration_list(ObjCParser.Class_declaration_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#class_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_list(ObjCParser.Class_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#protocol_reference_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProtocol_reference_list(ObjCParser.Protocol_reference_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#protocol_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProtocol_list(ObjCParser.Protocol_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#property_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperty_declaration(ObjCParser.Property_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#property_attributes_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperty_attributes_declaration(ObjCParser.Property_attributes_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#property_attributes_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperty_attributes_list(ObjCParser.Property_attributes_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#property_attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperty_attribute(ObjCParser.Property_attributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#class_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_name(ObjCParser.Class_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#superclass_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuperclass_name(ObjCParser.Superclass_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#category_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCategory_name(ObjCParser.Category_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#protocol_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProtocol_name(ObjCParser.Protocol_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#instance_variables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstance_variables(ObjCParser.Instance_variablesContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#visibility_specification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVisibility_specification(ObjCParser.Visibility_specificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#interface_declaration_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterface_declaration_list(ObjCParser.Interface_declaration_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#class_method_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_method_declaration(ObjCParser.Class_method_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#instance_method_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstance_method_declaration(ObjCParser.Instance_method_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#method_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod_declaration(ObjCParser.Method_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#implementation_definition_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImplementation_definition_list(ObjCParser.Implementation_definition_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#class_method_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_method_definition(ObjCParser.Class_method_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#instance_method_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstance_method_definition(ObjCParser.Instance_method_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#method_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod_definition(ObjCParser.Method_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#method_selector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod_selector(ObjCParser.Method_selectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#keyword_declarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyword_declarator(ObjCParser.Keyword_declaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#selector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelector(ObjCParser.SelectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#method_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod_type(ObjCParser.Method_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#property_implementation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperty_implementation(ObjCParser.Property_implementationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#property_synthesize_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperty_synthesize_list(ObjCParser.Property_synthesize_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#property_synthesize_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperty_synthesize_item(ObjCParser.Property_synthesize_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#block_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock_type(ObjCParser.Block_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#type_specifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_specifier(ObjCParser.Type_specifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#type_qualifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_qualifier(ObjCParser.Type_qualifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#protocol_qualifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProtocol_qualifier(ObjCParser.Protocol_qualifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#primary_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary_expression(ObjCParser.Primary_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#dictionary_pair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDictionary_pair(ObjCParser.Dictionary_pairContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#dictionary_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDictionary_expression(ObjCParser.Dictionary_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#array_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_expression(ObjCParser.Array_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#box_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBox_expression(ObjCParser.Box_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#block_parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock_parameters(ObjCParser.Block_parametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#block_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock_expression(ObjCParser.Block_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#message_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMessage_expression(ObjCParser.Message_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#receiver}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReceiver(ObjCParser.ReceiverContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#message_selector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMessage_selector(ObjCParser.Message_selectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#keyword_argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyword_argument(ObjCParser.Keyword_argumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#selector_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelector_expression(ObjCParser.Selector_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#selector_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelector_name(ObjCParser.Selector_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#protocol_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProtocol_expression(ObjCParser.Protocol_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#encode_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEncode_expression(ObjCParser.Encode_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#type_variable_declarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_variable_declarator(ObjCParser.Type_variable_declaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#try_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTry_statement(ObjCParser.Try_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#catch_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatch_statement(ObjCParser.Catch_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#finally_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinally_statement(ObjCParser.Finally_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#throw_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThrow_statement(ObjCParser.Throw_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#try_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTry_block(ObjCParser.Try_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#synchronized_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSynchronized_statement(ObjCParser.Synchronized_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#autorelease_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAutorelease_statement(ObjCParser.Autorelease_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#function_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_definition(ObjCParser.Function_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(ObjCParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#declaration_specifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration_specifiers(ObjCParser.Declaration_specifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#arc_behaviour_specifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArc_behaviour_specifier(ObjCParser.Arc_behaviour_specifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#storage_class_specifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStorage_class_specifier(ObjCParser.Storage_class_specifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#init_declarator_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInit_declarator_list(ObjCParser.Init_declarator_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#init_declarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInit_declarator(ObjCParser.Init_declaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#struct_or_union_specifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStruct_or_union_specifier(ObjCParser.Struct_or_union_specifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#struct_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStruct_declaration(ObjCParser.Struct_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#specifier_qualifier_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecifier_qualifier_list(ObjCParser.Specifier_qualifier_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#struct_declarator_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStruct_declarator_list(ObjCParser.Struct_declarator_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#struct_declarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStruct_declarator(ObjCParser.Struct_declaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#enum_specifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnum_specifier(ObjCParser.Enum_specifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#enumerator_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumerator_list(ObjCParser.Enumerator_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#enumerator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumerator(ObjCParser.EnumeratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#pointer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPointer(ObjCParser.PointerContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#declarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarator(ObjCParser.DeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#direct_declarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirect_declarator(ObjCParser.Direct_declaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#declarator_suffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarator_suffix(ObjCParser.Declarator_suffixContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#parameter_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter_list(ObjCParser.Parameter_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#parameter_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter_declaration(ObjCParser.Parameter_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#initializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializer(ObjCParser.InitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#type_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_name(ObjCParser.Type_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#abstract_declarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbstract_declarator(ObjCParser.Abstract_declaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#abstract_declarator_suffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbstract_declarator_suffix(ObjCParser.Abstract_declarator_suffixContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#parameter_declaration_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter_declaration_list(ObjCParser.Parameter_declaration_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#statement_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement_list(ObjCParser.Statement_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(ObjCParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#labeled_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabeled_statement(ObjCParser.Labeled_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#compound_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompound_statement(ObjCParser.Compound_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#selection_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelection_statement(ObjCParser.Selection_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#for_in_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_in_statement(ObjCParser.For_in_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#for_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_statement(ObjCParser.For_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#while_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_statement(ObjCParser.While_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#do_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDo_statement(ObjCParser.Do_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#iteration_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIteration_statement(ObjCParser.Iteration_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#jump_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJump_statement(ObjCParser.Jump_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(ObjCParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#assignment_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_expression(ObjCParser.Assignment_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#assignment_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_operator(ObjCParser.Assignment_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#conditional_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditional_expression(ObjCParser.Conditional_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#constant_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant_expression(ObjCParser.Constant_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#logical_or_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogical_or_expression(ObjCParser.Logical_or_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#logical_and_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogical_and_expression(ObjCParser.Logical_and_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#inclusive_or_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInclusive_or_expression(ObjCParser.Inclusive_or_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#exclusive_or_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExclusive_or_expression(ObjCParser.Exclusive_or_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#and_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd_expression(ObjCParser.And_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#equality_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquality_expression(ObjCParser.Equality_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#relational_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelational_expression(ObjCParser.Relational_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#shift_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShift_expression(ObjCParser.Shift_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#additive_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditive_expression(ObjCParser.Additive_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#multiplicative_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicative_expression(ObjCParser.Multiplicative_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#cast_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCast_expression(ObjCParser.Cast_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#unary_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_expression(ObjCParser.Unary_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#unary_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_operator(ObjCParser.Unary_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#postfix_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfix_expression(ObjCParser.Postfix_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#argument_expression_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument_expression_list(ObjCParser.Argument_expression_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(ObjCParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjCParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(ObjCParser.ConstantContext ctx);
}