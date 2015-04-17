@interface A : NSObject<Protocol1, Protocol2>

@property(nonatomic, strong) IBOutlet UILabel *label;

- (void)hoge;

@end

@interface A(Category)<Protocol3>

@end
