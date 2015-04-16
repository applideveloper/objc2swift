@interface A : NSObject<Protocol1, Protocol2>

@property(assign, nonatomic) UILabel *label;

- (void)hogeWithString:(NSString *)str;

@end

@interface A(Category)<Protocol3>
@end
