package codechicken.lib.asm;

import net.minecraft.launchwrapper.IClassTransformer;

@Deprecated//This is covered by the CCRenderItem class now!! \o/
public class RenderHookTransformer implements IClassTransformer {
    private ModularASMTransformer transformer = new ModularASMTransformer();

    public RenderHookTransformer() {
        //Map<String, ASMBlock> blocks = ASMReader.loadResource("/assets/ccl/asm/hooks.asm");
        //transformer.add(new MethodInjector(new ObfMapping("net/minecraft/client/renderer/RenderItem", "func_180454_a", "(Lnet/minecraft/item/ItemStack;Lnet/minecraft/client/renderer/block/model/IBakedModel;)V"), blocks.get("n_IItemRenderer"), blocks.get("IItemRenderer"), true));
    }

    @Override
    public byte[] transform(String name, String tname, byte[] bytes) {
        return transformer.transform(name, bytes);
    }
}
