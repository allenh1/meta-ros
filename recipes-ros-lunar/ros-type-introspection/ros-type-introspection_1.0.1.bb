# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The ros_type_introspection package allows the user to parse and deserialize   RO"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "abseil-cpp catkin-native geometry-msgs rosbag rosbag-storage roscpp roscpp-serialization rostime sensor-msgs topic-tools"
SRC_URI = "https://github.com/facontidavide/ros_type_introspection-release/archive/release/lunar/ros_type_introspection/1.0.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "9f089f0a2aecf2bc1cc9304c0d225d36"
SRC_URI[sha256sum] = "b6f16fa469ea01fbc87df8443c00f7eb2857f0421b2eb7b8fc7986c658cd4d18"
S = "${WORKDIR}/ros_type_introspection-release-release-lunar-ros_type_introspection-1.0.1-0"

inherit catkin
