# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The ros_type_introspection package allows the user to parse and deserialize   RO"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "abseil-cpp catkin-native geometry-msgs rosbag rosbag-storage roscpp roscpp-serialization rostime sensor-msgs topic-tools"
SRC_URI = "https://github.com/facontidavide/ros_type_introspection-release/archive/release/lunar/ros_type_introspection/1.0.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "8170d0c1134f2c21f0fec05c4d49699a"
SRC_URI[sha256sum] = "d26c1a2652de4191d84a23bc8a16172be4fd3b51376f38784d1b333f3b7b03db"
S = "${WORKDIR}/ros_type_introspection-release-release-lunar-ros_type_introspection-1.0.0-0"

inherit catkin
