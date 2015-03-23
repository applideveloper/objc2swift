// Generated from ObjC.g4 by ANTLR 4.5
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ObjCParser}.
 */
public interface ObjCListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ObjCParser#translation_unit}.
	 * @param ctx the parse tree
	 */
	void enterTranslation_unit(ObjCParser.Translation_unitContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#translation_unit}.
	 * @param ctx the parse tree
	 */
	void exitTranslation_unit(ObjCParser.Translation_unitContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#external_declaration}.
	 * @param ctx the parse tree
	 */
	void enterExternal_declaration(ObjCParser.External_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#external_declaration}.
	 * @param ctx the parse tree
	 */
	void exitExternal_declaration(ObjCParser.External_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#preprocessor_declaration}.
	 * @param ctx the parse tree
	 */
	void enterPreprocessor_declaration(ObjCParser.Preprocessor_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#preprocessor_declaration}.
	 * @param ctx the parse tree
	 */
	void exitPreprocessor_declaration(ObjCParser.Preprocessor_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#class_interface}.
	 * @param ctx the parse tree
	 */
	void enterClass_interface(ObjCParser.Class_interfaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#class_interface}.
	 * @param ctx the parse tree
	 */
	void exitClass_interface(ObjCParser.Class_interfaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#category_interface}.
	 * @param ctx the parse tree
	 */
	void enterCategory_interface(ObjCParser.Category_interfaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#category_interface}.
	 * @param ctx the parse tree
	 */
	void exitCategory_interface(ObjCParser.Category_interfaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#class_implementation}.
	 * @param ctx the parse tree
	 */
	void enterClass_implementation(ObjCParser.Class_implementationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#class_implementation}.
	 * @param ctx the parse tree
	 */
	void exitClass_implementation(ObjCParser.Class_implementationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#category_implementation}.
	 * @param ctx the parse tree
	 */
	void enterCategory_implementation(ObjCParser.Category_implementationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#category_implementation}.
	 * @param ctx the parse tree
	 */
	void exitCategory_implementation(ObjCParser.Category_implementationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#protocol_declaration}.
	 * @param ctx the parse tree
	 */
	void enterProtocol_declaration(ObjCParser.Protocol_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#protocol_declaration}.
	 * @param ctx the parse tree
	 */
	void exitProtocol_declaration(ObjCParser.Protocol_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#protocol_declaration_list}.
	 * @param ctx the parse tree
	 */
	void enterProtocol_declaration_list(ObjCParser.Protocol_declaration_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#protocol_declaration_list}.
	 * @param ctx the parse tree
	 */
	void exitProtocol_declaration_list(ObjCParser.Protocol_declaration_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#class_declaration_list}.
	 * @param ctx the parse tree
	 */
	void enterClass_declaration_list(ObjCParser.Class_declaration_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#class_declaration_list}.
	 * @param ctx the parse tree
	 */
	void exitClass_declaration_list(ObjCParser.Class_declaration_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#class_list}.
	 * @param ctx the parse tree
	 */
	void enterClass_list(ObjCParser.Class_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#class_list}.
	 * @param ctx the parse tree
	 */
	void exitClass_list(ObjCParser.Class_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#protocol_reference_list}.
	 * @param ctx the parse tree
	 */
	void enterProtocol_reference_list(ObjCParser.Protocol_reference_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#protocol_reference_list}.
	 * @param ctx the parse tree
	 */
	void exitProtocol_reference_list(ObjCParser.Protocol_reference_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#protocol_list}.
	 * @param ctx the parse tree
	 */
	void enterProtocol_list(ObjCParser.Protocol_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#protocol_list}.
	 * @param ctx the parse tree
	 */
	void exitProtocol_list(ObjCParser.Protocol_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#property_declaration}.
	 * @param ctx the parse tree
	 */
	void enterProperty_declaration(ObjCParser.Property_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#property_declaration}.
	 * @param ctx the parse tree
	 */
	void exitProperty_declaration(ObjCParser.Property_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#property_attributes_declaration}.
	 * @param ctx the parse tree
	 */
	void enterProperty_attributes_declaration(ObjCParser.Property_attributes_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#property_attributes_declaration}.
	 * @param ctx the parse tree
	 */
	void exitProperty_attributes_declaration(ObjCParser.Property_attributes_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#property_attributes_list}.
	 * @param ctx the parse tree
	 */
	void enterProperty_attributes_list(ObjCParser.Property_attributes_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#property_attributes_list}.
	 * @param ctx the parse tree
	 */
	void exitProperty_attributes_list(ObjCParser.Property_attributes_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#property_attribute}.
	 * @param ctx the parse tree
	 */
	void enterProperty_attribute(ObjCParser.Property_attributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#property_attribute}.
	 * @param ctx the parse tree
	 */
	void exitProperty_attribute(ObjCParser.Property_attributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#class_name}.
	 * @param ctx the parse tree
	 */
	void enterClass_name(ObjCParser.Class_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#class_name}.
	 * @param ctx the parse tree
	 */
	void exitClass_name(ObjCParser.Class_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#superclass_name}.
	 * @param ctx the parse tree
	 */
	void enterSuperclass_name(ObjCParser.Superclass_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#superclass_name}.
	 * @param ctx the parse tree
	 */
	void exitSuperclass_name(ObjCParser.Superclass_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#category_name}.
	 * @param ctx the parse tree
	 */
	void enterCategory_name(ObjCParser.Category_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#category_name}.
	 * @param ctx the parse tree
	 */
	void exitCategory_name(ObjCParser.Category_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#protocol_name}.
	 * @param ctx the parse tree
	 */
	void enterProtocol_name(ObjCParser.Protocol_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#protocol_name}.
	 * @param ctx the parse tree
	 */
	void exitProtocol_name(ObjCParser.Protocol_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#instance_variables}.
	 * @param ctx the parse tree
	 */
	void enterInstance_variables(ObjCParser.Instance_variablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#instance_variables}.
	 * @param ctx the parse tree
	 */
	void exitInstance_variables(ObjCParser.Instance_variablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#visibility_specification}.
	 * @param ctx the parse tree
	 */
	void enterVisibility_specification(ObjCParser.Visibility_specificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#visibility_specification}.
	 * @param ctx the parse tree
	 */
	void exitVisibility_specification(ObjCParser.Visibility_specificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#interface_declaration_list}.
	 * @param ctx the parse tree
	 */
	void enterInterface_declaration_list(ObjCParser.Interface_declaration_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#interface_declaration_list}.
	 * @param ctx the parse tree
	 */
	void exitInterface_declaration_list(ObjCParser.Interface_declaration_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#class_method_declaration}.
	 * @param ctx the parse tree
	 */
	void enterClass_method_declaration(ObjCParser.Class_method_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#class_method_declaration}.
	 * @param ctx the parse tree
	 */
	void exitClass_method_declaration(ObjCParser.Class_method_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#instance_method_declaration}.
	 * @param ctx the parse tree
	 */
	void enterInstance_method_declaration(ObjCParser.Instance_method_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#instance_method_declaration}.
	 * @param ctx the parse tree
	 */
	void exitInstance_method_declaration(ObjCParser.Instance_method_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#method_declaration}.
	 * @param ctx the parse tree
	 */
	void enterMethod_declaration(ObjCParser.Method_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#method_declaration}.
	 * @param ctx the parse tree
	 */
	void exitMethod_declaration(ObjCParser.Method_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#implementation_definition_list}.
	 * @param ctx the parse tree
	 */
	void enterImplementation_definition_list(ObjCParser.Implementation_definition_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#implementation_definition_list}.
	 * @param ctx the parse tree
	 */
	void exitImplementation_definition_list(ObjCParser.Implementation_definition_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#class_method_definition}.
	 * @param ctx the parse tree
	 */
	void enterClass_method_definition(ObjCParser.Class_method_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#class_method_definition}.
	 * @param ctx the parse tree
	 */
	void exitClass_method_definition(ObjCParser.Class_method_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#instance_method_definition}.
	 * @param ctx the parse tree
	 */
	void enterInstance_method_definition(ObjCParser.Instance_method_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#instance_method_definition}.
	 * @param ctx the parse tree
	 */
	void exitInstance_method_definition(ObjCParser.Instance_method_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#method_definition}.
	 * @param ctx the parse tree
	 */
	void enterMethod_definition(ObjCParser.Method_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#method_definition}.
	 * @param ctx the parse tree
	 */
	void exitMethod_definition(ObjCParser.Method_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#method_selector}.
	 * @param ctx the parse tree
	 */
	void enterMethod_selector(ObjCParser.Method_selectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#method_selector}.
	 * @param ctx the parse tree
	 */
	void exitMethod_selector(ObjCParser.Method_selectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#keyword_declarator}.
	 * @param ctx the parse tree
	 */
	void enterKeyword_declarator(ObjCParser.Keyword_declaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#keyword_declarator}.
	 * @param ctx the parse tree
	 */
	void exitKeyword_declarator(ObjCParser.Keyword_declaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#selector}.
	 * @param ctx the parse tree
	 */
	void enterSelector(ObjCParser.SelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#selector}.
	 * @param ctx the parse tree
	 */
	void exitSelector(ObjCParser.SelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#method_type}.
	 * @param ctx the parse tree
	 */
	void enterMethod_type(ObjCParser.Method_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#method_type}.
	 * @param ctx the parse tree
	 */
	void exitMethod_type(ObjCParser.Method_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#property_implementation}.
	 * @param ctx the parse tree
	 */
	void enterProperty_implementation(ObjCParser.Property_implementationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#property_implementation}.
	 * @param ctx the parse tree
	 */
	void exitProperty_implementation(ObjCParser.Property_implementationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#property_synthesize_list}.
	 * @param ctx the parse tree
	 */
	void enterProperty_synthesize_list(ObjCParser.Property_synthesize_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#property_synthesize_list}.
	 * @param ctx the parse tree
	 */
	void exitProperty_synthesize_list(ObjCParser.Property_synthesize_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#property_synthesize_item}.
	 * @param ctx the parse tree
	 */
	void enterProperty_synthesize_item(ObjCParser.Property_synthesize_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#property_synthesize_item}.
	 * @param ctx the parse tree
	 */
	void exitProperty_synthesize_item(ObjCParser.Property_synthesize_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#block_type}.
	 * @param ctx the parse tree
	 */
	void enterBlock_type(ObjCParser.Block_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#block_type}.
	 * @param ctx the parse tree
	 */
	void exitBlock_type(ObjCParser.Block_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#type_specifier}.
	 * @param ctx the parse tree
	 */
	void enterType_specifier(ObjCParser.Type_specifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#type_specifier}.
	 * @param ctx the parse tree
	 */
	void exitType_specifier(ObjCParser.Type_specifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#type_qualifier}.
	 * @param ctx the parse tree
	 */
	void enterType_qualifier(ObjCParser.Type_qualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#type_qualifier}.
	 * @param ctx the parse tree
	 */
	void exitType_qualifier(ObjCParser.Type_qualifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#protocol_qualifier}.
	 * @param ctx the parse tree
	 */
	void enterProtocol_qualifier(ObjCParser.Protocol_qualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#protocol_qualifier}.
	 * @param ctx the parse tree
	 */
	void exitProtocol_qualifier(ObjCParser.Protocol_qualifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#primary_expression}.
	 * @param ctx the parse tree
	 */
	void enterPrimary_expression(ObjCParser.Primary_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#primary_expression}.
	 * @param ctx the parse tree
	 */
	void exitPrimary_expression(ObjCParser.Primary_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#dictionary_pair}.
	 * @param ctx the parse tree
	 */
	void enterDictionary_pair(ObjCParser.Dictionary_pairContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#dictionary_pair}.
	 * @param ctx the parse tree
	 */
	void exitDictionary_pair(ObjCParser.Dictionary_pairContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#dictionary_expression}.
	 * @param ctx the parse tree
	 */
	void enterDictionary_expression(ObjCParser.Dictionary_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#dictionary_expression}.
	 * @param ctx the parse tree
	 */
	void exitDictionary_expression(ObjCParser.Dictionary_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#array_expression}.
	 * @param ctx the parse tree
	 */
	void enterArray_expression(ObjCParser.Array_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#array_expression}.
	 * @param ctx the parse tree
	 */
	void exitArray_expression(ObjCParser.Array_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#box_expression}.
	 * @param ctx the parse tree
	 */
	void enterBox_expression(ObjCParser.Box_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#box_expression}.
	 * @param ctx the parse tree
	 */
	void exitBox_expression(ObjCParser.Box_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#block_parameters}.
	 * @param ctx the parse tree
	 */
	void enterBlock_parameters(ObjCParser.Block_parametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#block_parameters}.
	 * @param ctx the parse tree
	 */
	void exitBlock_parameters(ObjCParser.Block_parametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#block_expression}.
	 * @param ctx the parse tree
	 */
	void enterBlock_expression(ObjCParser.Block_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#block_expression}.
	 * @param ctx the parse tree
	 */
	void exitBlock_expression(ObjCParser.Block_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#message_expression}.
	 * @param ctx the parse tree
	 */
	void enterMessage_expression(ObjCParser.Message_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#message_expression}.
	 * @param ctx the parse tree
	 */
	void exitMessage_expression(ObjCParser.Message_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#receiver}.
	 * @param ctx the parse tree
	 */
	void enterReceiver(ObjCParser.ReceiverContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#receiver}.
	 * @param ctx the parse tree
	 */
	void exitReceiver(ObjCParser.ReceiverContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#message_selector}.
	 * @param ctx the parse tree
	 */
	void enterMessage_selector(ObjCParser.Message_selectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#message_selector}.
	 * @param ctx the parse tree
	 */
	void exitMessage_selector(ObjCParser.Message_selectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#keyword_argument}.
	 * @param ctx the parse tree
	 */
	void enterKeyword_argument(ObjCParser.Keyword_argumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#keyword_argument}.
	 * @param ctx the parse tree
	 */
	void exitKeyword_argument(ObjCParser.Keyword_argumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#selector_expression}.
	 * @param ctx the parse tree
	 */
	void enterSelector_expression(ObjCParser.Selector_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#selector_expression}.
	 * @param ctx the parse tree
	 */
	void exitSelector_expression(ObjCParser.Selector_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#selector_name}.
	 * @param ctx the parse tree
	 */
	void enterSelector_name(ObjCParser.Selector_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#selector_name}.
	 * @param ctx the parse tree
	 */
	void exitSelector_name(ObjCParser.Selector_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#protocol_expression}.
	 * @param ctx the parse tree
	 */
	void enterProtocol_expression(ObjCParser.Protocol_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#protocol_expression}.
	 * @param ctx the parse tree
	 */
	void exitProtocol_expression(ObjCParser.Protocol_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#encode_expression}.
	 * @param ctx the parse tree
	 */
	void enterEncode_expression(ObjCParser.Encode_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#encode_expression}.
	 * @param ctx the parse tree
	 */
	void exitEncode_expression(ObjCParser.Encode_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#type_variable_declarator}.
	 * @param ctx the parse tree
	 */
	void enterType_variable_declarator(ObjCParser.Type_variable_declaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#type_variable_declarator}.
	 * @param ctx the parse tree
	 */
	void exitType_variable_declarator(ObjCParser.Type_variable_declaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#try_statement}.
	 * @param ctx the parse tree
	 */
	void enterTry_statement(ObjCParser.Try_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#try_statement}.
	 * @param ctx the parse tree
	 */
	void exitTry_statement(ObjCParser.Try_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#catch_statement}.
	 * @param ctx the parse tree
	 */
	void enterCatch_statement(ObjCParser.Catch_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#catch_statement}.
	 * @param ctx the parse tree
	 */
	void exitCatch_statement(ObjCParser.Catch_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#finally_statement}.
	 * @param ctx the parse tree
	 */
	void enterFinally_statement(ObjCParser.Finally_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#finally_statement}.
	 * @param ctx the parse tree
	 */
	void exitFinally_statement(ObjCParser.Finally_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#throw_statement}.
	 * @param ctx the parse tree
	 */
	void enterThrow_statement(ObjCParser.Throw_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#throw_statement}.
	 * @param ctx the parse tree
	 */
	void exitThrow_statement(ObjCParser.Throw_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#try_block}.
	 * @param ctx the parse tree
	 */
	void enterTry_block(ObjCParser.Try_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#try_block}.
	 * @param ctx the parse tree
	 */
	void exitTry_block(ObjCParser.Try_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#synchronized_statement}.
	 * @param ctx the parse tree
	 */
	void enterSynchronized_statement(ObjCParser.Synchronized_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#synchronized_statement}.
	 * @param ctx the parse tree
	 */
	void exitSynchronized_statement(ObjCParser.Synchronized_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#autorelease_statement}.
	 * @param ctx the parse tree
	 */
	void enterAutorelease_statement(ObjCParser.Autorelease_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#autorelease_statement}.
	 * @param ctx the parse tree
	 */
	void exitAutorelease_statement(ObjCParser.Autorelease_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#function_definition}.
	 * @param ctx the parse tree
	 */
	void enterFunction_definition(ObjCParser.Function_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#function_definition}.
	 * @param ctx the parse tree
	 */
	void exitFunction_definition(ObjCParser.Function_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(ObjCParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(ObjCParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#declaration_specifiers}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration_specifiers(ObjCParser.Declaration_specifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#declaration_specifiers}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration_specifiers(ObjCParser.Declaration_specifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#arc_behaviour_specifier}.
	 * @param ctx the parse tree
	 */
	void enterArc_behaviour_specifier(ObjCParser.Arc_behaviour_specifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#arc_behaviour_specifier}.
	 * @param ctx the parse tree
	 */
	void exitArc_behaviour_specifier(ObjCParser.Arc_behaviour_specifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#storage_class_specifier}.
	 * @param ctx the parse tree
	 */
	void enterStorage_class_specifier(ObjCParser.Storage_class_specifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#storage_class_specifier}.
	 * @param ctx the parse tree
	 */
	void exitStorage_class_specifier(ObjCParser.Storage_class_specifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#init_declarator_list}.
	 * @param ctx the parse tree
	 */
	void enterInit_declarator_list(ObjCParser.Init_declarator_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#init_declarator_list}.
	 * @param ctx the parse tree
	 */
	void exitInit_declarator_list(ObjCParser.Init_declarator_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#init_declarator}.
	 * @param ctx the parse tree
	 */
	void enterInit_declarator(ObjCParser.Init_declaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#init_declarator}.
	 * @param ctx the parse tree
	 */
	void exitInit_declarator(ObjCParser.Init_declaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#struct_or_union_specifier}.
	 * @param ctx the parse tree
	 */
	void enterStruct_or_union_specifier(ObjCParser.Struct_or_union_specifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#struct_or_union_specifier}.
	 * @param ctx the parse tree
	 */
	void exitStruct_or_union_specifier(ObjCParser.Struct_or_union_specifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#struct_declaration}.
	 * @param ctx the parse tree
	 */
	void enterStruct_declaration(ObjCParser.Struct_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#struct_declaration}.
	 * @param ctx the parse tree
	 */
	void exitStruct_declaration(ObjCParser.Struct_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#specifier_qualifier_list}.
	 * @param ctx the parse tree
	 */
	void enterSpecifier_qualifier_list(ObjCParser.Specifier_qualifier_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#specifier_qualifier_list}.
	 * @param ctx the parse tree
	 */
	void exitSpecifier_qualifier_list(ObjCParser.Specifier_qualifier_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#struct_declarator_list}.
	 * @param ctx the parse tree
	 */
	void enterStruct_declarator_list(ObjCParser.Struct_declarator_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#struct_declarator_list}.
	 * @param ctx the parse tree
	 */
	void exitStruct_declarator_list(ObjCParser.Struct_declarator_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#struct_declarator}.
	 * @param ctx the parse tree
	 */
	void enterStruct_declarator(ObjCParser.Struct_declaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#struct_declarator}.
	 * @param ctx the parse tree
	 */
	void exitStruct_declarator(ObjCParser.Struct_declaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#enum_specifier}.
	 * @param ctx the parse tree
	 */
	void enterEnum_specifier(ObjCParser.Enum_specifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#enum_specifier}.
	 * @param ctx the parse tree
	 */
	void exitEnum_specifier(ObjCParser.Enum_specifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#enumerator_list}.
	 * @param ctx the parse tree
	 */
	void enterEnumerator_list(ObjCParser.Enumerator_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#enumerator_list}.
	 * @param ctx the parse tree
	 */
	void exitEnumerator_list(ObjCParser.Enumerator_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#enumerator}.
	 * @param ctx the parse tree
	 */
	void enterEnumerator(ObjCParser.EnumeratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#enumerator}.
	 * @param ctx the parse tree
	 */
	void exitEnumerator(ObjCParser.EnumeratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#pointer}.
	 * @param ctx the parse tree
	 */
	void enterPointer(ObjCParser.PointerContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#pointer}.
	 * @param ctx the parse tree
	 */
	void exitPointer(ObjCParser.PointerContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#declarator}.
	 * @param ctx the parse tree
	 */
	void enterDeclarator(ObjCParser.DeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#declarator}.
	 * @param ctx the parse tree
	 */
	void exitDeclarator(ObjCParser.DeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#direct_declarator}.
	 * @param ctx the parse tree
	 */
	void enterDirect_declarator(ObjCParser.Direct_declaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#direct_declarator}.
	 * @param ctx the parse tree
	 */
	void exitDirect_declarator(ObjCParser.Direct_declaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#declarator_suffix}.
	 * @param ctx the parse tree
	 */
	void enterDeclarator_suffix(ObjCParser.Declarator_suffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#declarator_suffix}.
	 * @param ctx the parse tree
	 */
	void exitDeclarator_suffix(ObjCParser.Declarator_suffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#parameter_list}.
	 * @param ctx the parse tree
	 */
	void enterParameter_list(ObjCParser.Parameter_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#parameter_list}.
	 * @param ctx the parse tree
	 */
	void exitParameter_list(ObjCParser.Parameter_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#parameter_declaration}.
	 * @param ctx the parse tree
	 */
	void enterParameter_declaration(ObjCParser.Parameter_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#parameter_declaration}.
	 * @param ctx the parse tree
	 */
	void exitParameter_declaration(ObjCParser.Parameter_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#initializer}.
	 * @param ctx the parse tree
	 */
	void enterInitializer(ObjCParser.InitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#initializer}.
	 * @param ctx the parse tree
	 */
	void exitInitializer(ObjCParser.InitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#type_name}.
	 * @param ctx the parse tree
	 */
	void enterType_name(ObjCParser.Type_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#type_name}.
	 * @param ctx the parse tree
	 */
	void exitType_name(ObjCParser.Type_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#abstract_declarator}.
	 * @param ctx the parse tree
	 */
	void enterAbstract_declarator(ObjCParser.Abstract_declaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#abstract_declarator}.
	 * @param ctx the parse tree
	 */
	void exitAbstract_declarator(ObjCParser.Abstract_declaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#abstract_declarator_suffix}.
	 * @param ctx the parse tree
	 */
	void enterAbstract_declarator_suffix(ObjCParser.Abstract_declarator_suffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#abstract_declarator_suffix}.
	 * @param ctx the parse tree
	 */
	void exitAbstract_declarator_suffix(ObjCParser.Abstract_declarator_suffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#parameter_declaration_list}.
	 * @param ctx the parse tree
	 */
	void enterParameter_declaration_list(ObjCParser.Parameter_declaration_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#parameter_declaration_list}.
	 * @param ctx the parse tree
	 */
	void exitParameter_declaration_list(ObjCParser.Parameter_declaration_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#statement_list}.
	 * @param ctx the parse tree
	 */
	void enterStatement_list(ObjCParser.Statement_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#statement_list}.
	 * @param ctx the parse tree
	 */
	void exitStatement_list(ObjCParser.Statement_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(ObjCParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(ObjCParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#labeled_statement}.
	 * @param ctx the parse tree
	 */
	void enterLabeled_statement(ObjCParser.Labeled_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#labeled_statement}.
	 * @param ctx the parse tree
	 */
	void exitLabeled_statement(ObjCParser.Labeled_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#compound_statement}.
	 * @param ctx the parse tree
	 */
	void enterCompound_statement(ObjCParser.Compound_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#compound_statement}.
	 * @param ctx the parse tree
	 */
	void exitCompound_statement(ObjCParser.Compound_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#selection_statement}.
	 * @param ctx the parse tree
	 */
	void enterSelection_statement(ObjCParser.Selection_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#selection_statement}.
	 * @param ctx the parse tree
	 */
	void exitSelection_statement(ObjCParser.Selection_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#for_in_statement}.
	 * @param ctx the parse tree
	 */
	void enterFor_in_statement(ObjCParser.For_in_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#for_in_statement}.
	 * @param ctx the parse tree
	 */
	void exitFor_in_statement(ObjCParser.For_in_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#for_statement}.
	 * @param ctx the parse tree
	 */
	void enterFor_statement(ObjCParser.For_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#for_statement}.
	 * @param ctx the parse tree
	 */
	void exitFor_statement(ObjCParser.For_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void enterWhile_statement(ObjCParser.While_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void exitWhile_statement(ObjCParser.While_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#do_statement}.
	 * @param ctx the parse tree
	 */
	void enterDo_statement(ObjCParser.Do_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#do_statement}.
	 * @param ctx the parse tree
	 */
	void exitDo_statement(ObjCParser.Do_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#iteration_statement}.
	 * @param ctx the parse tree
	 */
	void enterIteration_statement(ObjCParser.Iteration_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#iteration_statement}.
	 * @param ctx the parse tree
	 */
	void exitIteration_statement(ObjCParser.Iteration_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#jump_statement}.
	 * @param ctx the parse tree
	 */
	void enterJump_statement(ObjCParser.Jump_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#jump_statement}.
	 * @param ctx the parse tree
	 */
	void exitJump_statement(ObjCParser.Jump_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(ObjCParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(ObjCParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#assignment_expression}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_expression(ObjCParser.Assignment_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#assignment_expression}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_expression(ObjCParser.Assignment_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#assignment_operator}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_operator(ObjCParser.Assignment_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#assignment_operator}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_operator(ObjCParser.Assignment_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#conditional_expression}.
	 * @param ctx the parse tree
	 */
	void enterConditional_expression(ObjCParser.Conditional_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#conditional_expression}.
	 * @param ctx the parse tree
	 */
	void exitConditional_expression(ObjCParser.Conditional_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#constant_expression}.
	 * @param ctx the parse tree
	 */
	void enterConstant_expression(ObjCParser.Constant_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#constant_expression}.
	 * @param ctx the parse tree
	 */
	void exitConstant_expression(ObjCParser.Constant_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#logical_or_expression}.
	 * @param ctx the parse tree
	 */
	void enterLogical_or_expression(ObjCParser.Logical_or_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#logical_or_expression}.
	 * @param ctx the parse tree
	 */
	void exitLogical_or_expression(ObjCParser.Logical_or_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#logical_and_expression}.
	 * @param ctx the parse tree
	 */
	void enterLogical_and_expression(ObjCParser.Logical_and_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#logical_and_expression}.
	 * @param ctx the parse tree
	 */
	void exitLogical_and_expression(ObjCParser.Logical_and_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#inclusive_or_expression}.
	 * @param ctx the parse tree
	 */
	void enterInclusive_or_expression(ObjCParser.Inclusive_or_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#inclusive_or_expression}.
	 * @param ctx the parse tree
	 */
	void exitInclusive_or_expression(ObjCParser.Inclusive_or_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#exclusive_or_expression}.
	 * @param ctx the parse tree
	 */
	void enterExclusive_or_expression(ObjCParser.Exclusive_or_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#exclusive_or_expression}.
	 * @param ctx the parse tree
	 */
	void exitExclusive_or_expression(ObjCParser.Exclusive_or_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#and_expression}.
	 * @param ctx the parse tree
	 */
	void enterAnd_expression(ObjCParser.And_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#and_expression}.
	 * @param ctx the parse tree
	 */
	void exitAnd_expression(ObjCParser.And_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#equality_expression}.
	 * @param ctx the parse tree
	 */
	void enterEquality_expression(ObjCParser.Equality_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#equality_expression}.
	 * @param ctx the parse tree
	 */
	void exitEquality_expression(ObjCParser.Equality_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#relational_expression}.
	 * @param ctx the parse tree
	 */
	void enterRelational_expression(ObjCParser.Relational_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#relational_expression}.
	 * @param ctx the parse tree
	 */
	void exitRelational_expression(ObjCParser.Relational_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#shift_expression}.
	 * @param ctx the parse tree
	 */
	void enterShift_expression(ObjCParser.Shift_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#shift_expression}.
	 * @param ctx the parse tree
	 */
	void exitShift_expression(ObjCParser.Shift_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#additive_expression}.
	 * @param ctx the parse tree
	 */
	void enterAdditive_expression(ObjCParser.Additive_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#additive_expression}.
	 * @param ctx the parse tree
	 */
	void exitAdditive_expression(ObjCParser.Additive_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#multiplicative_expression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicative_expression(ObjCParser.Multiplicative_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#multiplicative_expression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicative_expression(ObjCParser.Multiplicative_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#cast_expression}.
	 * @param ctx the parse tree
	 */
	void enterCast_expression(ObjCParser.Cast_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#cast_expression}.
	 * @param ctx the parse tree
	 */
	void exitCast_expression(ObjCParser.Cast_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#unary_expression}.
	 * @param ctx the parse tree
	 */
	void enterUnary_expression(ObjCParser.Unary_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#unary_expression}.
	 * @param ctx the parse tree
	 */
	void exitUnary_expression(ObjCParser.Unary_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#unary_operator}.
	 * @param ctx the parse tree
	 */
	void enterUnary_operator(ObjCParser.Unary_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#unary_operator}.
	 * @param ctx the parse tree
	 */
	void exitUnary_operator(ObjCParser.Unary_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#postfix_expression}.
	 * @param ctx the parse tree
	 */
	void enterPostfix_expression(ObjCParser.Postfix_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#postfix_expression}.
	 * @param ctx the parse tree
	 */
	void exitPostfix_expression(ObjCParser.Postfix_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#argument_expression_list}.
	 * @param ctx the parse tree
	 */
	void enterArgument_expression_list(ObjCParser.Argument_expression_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#argument_expression_list}.
	 * @param ctx the parse tree
	 */
	void exitArgument_expression_list(ObjCParser.Argument_expression_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(ObjCParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(ObjCParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjCParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(ObjCParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjCParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(ObjCParser.ConstantContext ctx);
}