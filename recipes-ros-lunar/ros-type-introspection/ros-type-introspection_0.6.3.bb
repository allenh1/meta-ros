# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The ros_type_introspection package allows the user to parse and deserialize
  RO"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=23f8de2430b349800266ded71351769e"

DEPENDS = "catkin rosbag rosbag_storage roscpp roscpp_serialization rostime topic_tools"
SRC_URI = "https://github.com/facontidavide/ros_type_introspection-release/archive/release/lunar/ros_type_introspection/0.6.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "7d00d2524ed164d9958332dcab74a45a"
SRC_URI[sha256sum] = "54906abc8291fc9543a4dce67f1684219e590e867b94899f24a658eea7de226c"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
