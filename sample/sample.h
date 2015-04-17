@interface MyClass : NSObject <SomeProtocol>

@property(nonatomic, strong) IBOutlet UILabel *label;

- (void)hoge;
- (void)hogeWithInt:(int)n;
- (void)hogeWithInt:(int)n string:(NSString *)str;

@end
