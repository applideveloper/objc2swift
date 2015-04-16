@interface A : NSObject<Protocol1, Protocol2>

@property(nonatomic, strong) IBOutlet UILabel *label;

- (void)hoge;
- (void)acceptOneParam:(int)n1;
- (void)acceptTwoParams:(int)n1 opt2:(int)n2;
- (void)acceptThreeParams:(int)n1 opt2:(int)n2 opt3:(int)n3;

@end
