// automatically generated by the FlatBuffers compiler, do not modify

package com.google.ar.sceneform.lullmodel;

import java.nio.*;

import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
/**
 * Data type for boolean values to be stored in a VariantDef.
 */
public final class DataBool extends Table {
  public static DataBool getRootAsDataBool(ByteBuffer _bb) { return getRootAsDataBool(_bb, new DataBool()); }
  public static DataBool getRootAsDataBool(ByteBuffer _bb, DataBool obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; vtable_start = bb_pos - bb.getInt(bb_pos); vtable_size = bb.getShort(vtable_start); }
  public DataBool __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public boolean value() { int o = __offset(4); return o != 0 ? 0!=bb.get(o + bb_pos) : false; }

  public static int createDataBool(FlatBufferBuilder builder,
      boolean value) {
    builder.startObject(1);
    DataBool.addValue(builder, value);
    return DataBool.endDataBool(builder);
  }

  public static void startDataBool(FlatBufferBuilder builder) { builder.startObject(1); }
  public static void addValue(FlatBufferBuilder builder, boolean value) { builder.addBoolean(0, value, false); }
  public static int endDataBool(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }
}

