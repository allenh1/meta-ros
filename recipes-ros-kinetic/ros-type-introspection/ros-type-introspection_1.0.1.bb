# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The ros_type_introspection package allows the user to parse and deserialize   RO"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "abseil-cpp catkin-native geometry-msgs rosbag rosbag-storage roscpp roscpp-serialization rostime sensor-msgs topic-tools"
SRC_URI = "https://github.com/facontidavide/ros_type_introspection-release/archive/release/kinetic/ros_type_introspection/1.0.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "ddc82b681149085b3b26f9763824796e"
SRC_URI[sha256sum] = "dc4b8417d3ffc8319f17bea3d87f77416438a35341ecdf5346cc67325a2f0c88"
S = "${WORKDIR}/ros_type_introspection-release-release-kinetic-ros_type_introspection-1.0.1-0"

inherit catkin
